package UI.Admin;

import UI.Common.MyDesktopPane;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class UserInfoUI extends MyDesktopPane {
	JLabel label = new JLabel("账号：");
	JLabel label_1 = new JLabel("密码：");
	JLabel label_2 = new JLabel("职位：");

	/**
	 * Create the frame.
	 */
	public UserInfoUI() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setBackground(Color.WHITE);
		this.setBounds(0, 0, 450, 350);
		label.setBounds(104, 73, 54, 25);
		add(label);

		label_1.setBounds(104, 145, 54, 25);
		add(label_1);

		label_2.setBounds(104, 212, 54, 25);
		add(label_2);

	}
}
