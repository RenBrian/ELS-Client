package UI.Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import UI.Common.MyFrame;

public class Add_UserUI extends MyFrame {

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
					Add_UserUI frame = new Add_UserUI();
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
	public Add_UserUI() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		
		UserInfoUI desktopPane = new UserInfoUI();
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JTextField lblNewLabel = new JTextField("");
		lblNewLabel.setBounds(175, 76, 127, 25);
		desktopPane.add(lblNewLabel);
		
		JTextField label = new JTextField("");
		label.setBounds(175, 145, 127, 25);
		desktopPane.add(label);
		
		JTextField label_1 = new JTextField("");
		label_1.setBounds(175, 214, 127, 25);
		desktopPane.add(label_1);
		desktopPane.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
