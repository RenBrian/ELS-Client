package UI.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import UI.Common.MainFrame;
import UI.Common.MyButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class AdminUI extends MainFrame{
	public AdminUI(){
		desktopPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		desktopPane.btnNewButton.setLocation(955, 0);
		desktopPane.layeredPane.setSize(1000, 30);
		this.setBounds(100, 25, 1000, 700);
		UserListUI list=new UserListUI();
		desktopPane.add(list);
		list.setBounds(0, 30, 870, 670);

		JTextField textField = new JTextField();
		desktopPane.add(textField);
		textField.setBounds(880, 77, 110, 28);
		textField.setColumns(10);
		MyButton btnNewButton2 = new MyButton("添加账号");
		desktopPane.add(btnNewButton2);

		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add_UserUI a=new Add_UserUI();
				a.setVisible(true);
			}
		});
		btnNewButton2.setBounds(880, 262, 111, 34);

		MyButton btnNewButton = new MyButton("账号查找");
		btnNewButton.setBounds(880, 115, 111, 34);
		desktopPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				}
		});
	}

	public static void main(String[] args){
		AdminUI a=new AdminUI();
		a.setVisible(true);
	}

}
