package UI.Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import BL.UserBL;
import BLService.UserBLService;
import PO.UserPO;
import UI.Common.MyButton;
import UI.Common.MyFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.awt.Color;

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
		desktopPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		getContentPane().add(desktopPane, BorderLayout.CENTER);

		JTextField idfield = new JTextField("");
		idfield.setBounds(176, 77, 156, 25);
		desktopPane.add(idfield);

		JPasswordField keyfield = new JPasswordField("");
		keyfield.setBounds(176, 145, 156, 25);
		desktopPane.add(keyfield);
		desktopPane.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"快递员", "营业厅业务员", "中转中心业务员", "仓库管理员", "财务人员", "总经理", "管理员"}));
		comboBox.setBounds(176, 213, 118, 21);
		desktopPane.add(comboBox);

		MyButton button = new MyButton("确认");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserBLService bl=new UserBL();
				String key=String.valueOf(keyfield.getPassword());
				UserPO user=new UserPO(idfield.getText(),key,comboBox.getSelectedItem().toString());
				bl.add(user);
				dispose();
			}
		});
		button.setBounds(347, 300, 93, 23);
		desktopPane.add(button);

		JLabel label_1 = new JLabel("添加用户");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(180, 3, 107, 27);
		desktopPane.layeredPane.add(label_1);
	}
}
