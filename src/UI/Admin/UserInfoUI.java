package UI.Admin;

import UI.Common.MyButton;
import UI.Common.MyDesktop;

import javax.swing.JLabel;

import java.awt.Color;

@SuppressWarnings("serial")
public class UserInfoUI extends MyDesktop {

	public MyButton button_1 = new MyButton("确认");
	JLabel label = new JLabel("账号：");
	JLabel label_1 = new JLabel("密码：");
	JLabel label_2 = new JLabel("职位：");

	/**
	 * Create the frame.
	 */
	public UserInfoUI() {
		setBackground(Color.WHITE);
		this.setBounds(0, 0, 450, 350);
		label.setBounds(80, 74, 54, 25);
		add(label);
		
		label_1.setBounds(80, 145, 54, 25);
		add(label_1);
		
		label_2.setBounds(80, 212, 54, 25);
		add(label_2);

		
		button_1.setBounds(340, 295, 82, 23);
		add(button_1);

	}
}
