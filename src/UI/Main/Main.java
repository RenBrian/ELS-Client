package UI.Main;

import java.awt.EventQueue;

import UI.Common.MainFrame;
import UI.Common.MyButton;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import BL.OrderBL;
import BLService.OrderBLService;
import PO.Receipt.OrderPO;

import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class Main extends MainFrame {

	private HomeUI home=new HomeUI();


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
		desktopPane.btnNewButton.setSize(45, 39);
		desktopPane.layeredPane.setBounds(0, 0, 1000, 39);
		desktopPane.btnNewButton.setLocation(955, 0);

		MyButton btnNewButton = new MyButton("登录");
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginUI login=new LoginUI();
				login.setVisible(true);
			}
		});
		btnNewButton.setBounds(0, 0, 68, 39);
		desktopPane.layeredPane.add(btnNewButton);
		this.setBounds(200, 25, 1000, 700);
		home.idField.setFont(new Font("宋体", Font.PLAIN, 18));
		home.idField.setBounds(322, 286, 297, 35);
		home.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderBLService bl=new OrderBL();
				OrderPO order=bl.find(home.idField.getText());
				if(order==null){
					JOptionPane.showMessageDialog(null, "订单不存在", "", JOptionPane.ERROR_MESSAGE);
				}else{

				}
			}
		});
		home.setSize(1000, 663);
		home.setLocation(0, 37);
		desktopPane.add(home);
		home.setVisible(true);


	}
}
