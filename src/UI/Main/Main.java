package UI.Main;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import BL.UserBL;
import BLService.UserBLService;
import PO.UserPO;
import UI.Admin.AdminUI;
import UI.Common.MyFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Main extends MyFrame {

	private boolean isLogin=false;
	private LoginUI login=new LoginUI();
	private HomeUI home=new HomeUI();
	private AdminUI admin=new AdminUI();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Main() {

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					Goto("login");
					login.textField.setText("");
					login.textField_1.setText("");
					button2.setVisible(true);
					button1.setVisible(false);
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Goto("home");
				if(!isLogin){
					button1.setVisible(true);
				}else{
					button5.setVisible(true);
				}
				button2.setVisible(false);
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3.setVisible(false);
				Goto("home");
				button5.setVisible(false);
				button2.setVisible(false);
				button1.setVisible(true);
				isLogin=false;
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Goto("admin");
				button2.setVisible(true);
				button5.setVisible(false);
			}
		});
		
		desktopPane.add(home);
		home.setVisible(true);

		desktopPane.add(admin);
		admin.setVisible(false);

		login.setVisible(false);
		desktopPane.add(login);
		
		login.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login();
			}
		});
	}


	private void Goto(String name_ui){
		admin.setVisible(false);
		home.setVisible(false);
		login.setVisible(false);

		switch(name_ui){
			case"admin":
				admin.setVisible(true);
				break;
			case"home":
				home.setVisible(true);
				break;
			case"login":
				login.setVisible(true);
		}
	}
	
	public void Login(){
		UserBLService user=new UserBL();
		UserPO po=new UserPO(login.textField.getText(),login.textField_1.getText(),null);
		String result=user.Login(po);
		if(result.equals("密码错误")){
			JOptionPane.showMessageDialog(null, "密码错误", "",JOptionPane.ERROR_MESSAGE);
			return;
		}else if(result.equals("账号不存在")){
			JOptionPane.showMessageDialog(null, "账号不存在", "", JOptionPane.ERROR_MESSAGE);
			return;
		}else{
			switch(result){
			case"管理员":
				Goto("admin");
				isLogin=true;
				button1.setVisible(false);
				button3.setVisible(true);
				break;
			}
		}
	}
}
