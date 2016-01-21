package UI.Main;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import UI.Common.MyButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class LoginUI extends JLayeredPane {
	JButton button = new MyButton("登录");
	JTextField textField = new JTextField();
	JTextField textField_1 = new JPasswordField();

	public LoginUI(){
		this.setBounds(0, 30, 1000, 670);
		textField.setBounds(409,203 ,145 , 21);
		textField.setColumns(10);
		add(textField);

		JLabel label = new JLabel("账号");
		label.setBounds(298, 203, 54, 21);
		add(label);

		JLabel label_1 = new JLabel("密码");
		label_1.setBounds(298, 297, 54, 21);
		add(label_1);


		textField_1.setBounds(409, 297, 145, 21);
		add(textField_1);
		textField_1.setColumns(10);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		button.setBackground(new Color(65, 224, 208));
		button.setBounds(416, 392, 120, 23);
		add(button);

	}
}
