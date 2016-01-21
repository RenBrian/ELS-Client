package UI.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLayeredPane;
import javax.swing.JTextField;

import UI.Common.MyButton;

@SuppressWarnings("serial")
public class AdminUI extends JLayeredPane{
	public AdminUI(){
		this.setBounds(0, 30, 1000, 670);
		UserListUI list=new UserListUI();
		list.setBounds(0, 0, this.getWidth()-130, this.getHeight());
		add(list);
		
		JTextField textField = new JTextField();
		textField.setBounds(880, 31, 110, 28);
		add(textField);
		textField.setColumns(10);

		MyButton btnNewButton2 = new MyButton("添加账号");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserInfoUI a=new UserInfoUI();
				a.setVisible(true);
			}
		});
		
		MyButton btnNewButton = new MyButton("账号查找");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(880, 75, 111, 34);
		add(btnNewButton);
		btnNewButton2.setBounds(880, 197, 111, 34);
		add(btnNewButton2);
	}

}
