package UI.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AdminUI extends JLayeredPane{
	public AdminUI(){
		setBounds(0,30, 700, 470);
		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(0, 0, 545, 458);
//		add(scrollPane);
		
		UserListUI list=new UserListUI();
		list.setBounds(0, 0, 545, 460);
		add(list);
		
		JTextField textField = new JTextField();
		textField.setBounds(553, 31, 110, 21);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("账号查找");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(552, 74, 111, 23);
		add(btnNewButton);

		JButton btnNewButton2 = new JButton("添加账号");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton2.setBounds(552, 126, 111, 23);
		add(btnNewButton2);
		
		JButton button = new JButton("确认");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setBounds(553, 409, 110, 23);
		add(button);
	}

}
