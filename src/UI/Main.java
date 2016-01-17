package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;

import BL.UserBL;
import BLService.UserBLService;
import PO.UserPO;
import UI.Admin.AdminUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

@SuppressWarnings("serial")
public class Main extends JFrame {

	private JPanel contentPane;
	private LoginUI login=new LoginUI();
	private Lay lay=new Lay();
	private JDesktopPane desktopPane = new JDesktopPane();
	private HomeUI home=new HomeUI();
	private AdminUI admin=new AdminUI();
	int xOld=0,yOld=0;
	
	
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

	public void Init(){
		//处理拖动事件
				this.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						xOld = e.getX();
						yOld = e.getY();
					}
				});
				this.addMouseMotionListener(new MouseMotionAdapter() {
					@Override
					public void mouseDragged(MouseEvent e) {
						int xOnScreen = e.getXOnScreen();
						int yOnScreen = e.getYOnScreen();
						int xx = xOnScreen - xOld;
						int yy = yOnScreen - yOld;
						Main.this.setLocation(xx, yy);
					}
				});

		
	}
	
	public Main() {
		setUndecorated(true);
		setBounds(100, 100, 700,500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Init();
		
		desktopPane.add(lay);
		lay.setVisible(true);
		lay.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		lay.button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!lay.button_3.isVisible()){
					Goto("login");
					login.textField.setText("");
					login.textField_1.setText("");
					lay.button_2.setVisible(true);
					lay.button_1.setVisible(false);
				}else{
					Goto("admin");
					lay.button_2.setVisible(true);
					lay.button_1.setVisible(false);
				}
			}
		});
		lay.button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Goto("home");
				lay.button_1.setVisible(true);
				lay.button_2.setVisible(false);
			}
		});
		lay.button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lay.button_3.setVisible(false);
				Goto("home");
				lay.button_1.setText("登录");
				lay.button_1.setVisible(true);
				lay.button_2.setVisible(false);
			}
		});
		
		
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		home.setBounds(0, 29, 700, 471);
		desktopPane.add(home);
		
		desktopPane.add(admin);
		admin.setVisible(false);
		
		login.setBounds(0,29,700, 471);
		desktopPane.add(login);
		login.setVisible(false);
		login.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
						lay.button_1.setText("返回");
						lay.button_1.setVisible(false);
						lay.button_3.setVisible(true);
						break;
					}
					
				}
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
}
