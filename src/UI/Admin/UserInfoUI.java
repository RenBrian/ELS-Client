package UI.Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import PO.UserPO;

import javax.swing.JDesktopPane;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class UserInfoUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPO user=new UserPO();
					user.setRole("管理员");
					user.setID("admin");
					user.setPassword("admin");
					UserInfoUI frame = new UserInfoUI(user);
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
	public UserInfoUI(UserPO po) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		this.setTitle("用户信息");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel label = new JLabel("账号：");
		label.setBounds(69, 73, 54, 25);
		desktopPane.add(label);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setBounds(69, 124, 54, 25);
		desktopPane.add(label_1);
		
		JLabel label_2 = new JLabel("职位：");
		label_2.setBounds(69, 178, 54, 25);
		desktopPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel(po.getID());
		lblNewLabel.setBounds(153, 73, 112, 25);
		desktopPane.add(lblNewLabel);
		
		JTextField label_3 = new JTextField(po.getPassword());
		label_3.setBounds(153, 124, 112, 25);
		desktopPane.add(label_3);
		
		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(218, 287, 82, 23);
		desktopPane.add(button);
		
		JButton button_1 = new JButton("修改");
		button_1.setBounds(321, 287, 82, 23);
		desktopPane.add(button_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"快递员", "管理员", "营业厅业务员", "中转中心业务员", "仓库管理人员", "财务人员", "业务员","总经理"}));
		comboBox.setSelectedItem(po.getRole());
		comboBox.setBounds(153, 180, 112, 21);
		desktopPane.add(comboBox);
		
		JButton button_2 = new JButton("删除账号");
		button_2.setBounds(10, 287, 90, 23);
		desktopPane.add(button_2);
	}
}
