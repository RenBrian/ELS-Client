package UI.Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import UI.Common.MyFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Find_UserUI extends MyFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Find_UserUI frame = new Find_UserUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	private void InitFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
	}
	public void InitDesktop(){
		UserInfoUI desktopPane = new UserInfoUI();
		desktopPane.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		getContentPane().add(desktopPane, BorderLayout.CENTER);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(202, 74, 129, 25);
		desktopPane.add(lblNewLabel);

		JLabel label = new JLabel("New label");
		label.setBounds(202, 147, 129, 25);
		desktopPane.add(label);

		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(202, 211, 129, 25);
		desktopPane.add(label_1);

	}
	public Find_UserUI() {
		InitFrame();
		InitDesktop();
	}
}
