package UI.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLayeredPane;
import javax.swing.JTextField;

import UI.Common.MyButton;

@SuppressWarnings("serial")
public class AdminUI extends JLayeredPane{
	public AdminUI(){
		setBounds(0,30, 700, 470);
		
		UserListUI list=new UserListUI();
		list.setBounds(0, 0, 545, 470);
		add(list);
		
		JTextField textField = new JTextField();
		textField.setBounds(553, 31, 110, 21);
		add(textField);
		textField.setColumns(10);
		
		MyButton btnNewButton = new MyButton("账号查找");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(552, 74, 111, 23);
		add(btnNewButton);

		MyButton btnNewButton2 = new MyButton("添加账号");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserInfoUI a=new UserInfoUI(null,"新建");
				a.setVisible(true);
			}
		});
		btnNewButton2.setBounds(552, 126, 111, 23);
		add(btnNewButton2);
		
		MyButton button = new MyButton("确认");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setBounds(553, 409, 110, 23);
		add(button);
	}

}
