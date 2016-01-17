package UI.Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import PO.UserPO;
import UI.Common.MyButton;

import javax.swing.JDesktopPane;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class UserInfoUI extends JFrame {

	private JPanel contentPane;
	private UserPO user=new UserPO();
	private JLabel lblNewLabel_1 = new JLabel(user.getPassword());
	private JTextField label_3 = new JTextField(user.getPassword());
	private JLabel lblNewLabel = new JLabel(user.getID());
	private JTextField textField = new JTextField();

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
					UserInfoUI frame = new UserInfoUI(user,"修改");
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
	public UserInfoUI(UserPO po,String message) {
		if(po!=null)
			user=po;
		lblNewLabel_1 = new JLabel(user.getPassword());
		label_3 = new JTextField(user.getPassword());
		lblNewLabel = new JLabel(user.getID());
		textField = new JTextField();
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
		
		lblNewLabel.setBounds(153, 73, 136, 25);
		desktopPane.add(lblNewLabel);
		
		label_3.setBounds(153, 124, 136, 25);
		desktopPane.add(label_3);
		
		MyButton button_1 = new MyButton("确认");
		button_1.setBounds(321, 287, 82, 23);
		desktopPane.add(button_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"快递员", "管理员", "营业厅业务员", "中转中心业务员", "仓库管理人员", "财务人员", "业务员","总经理"}));
		comboBox.setSelectedItem(user.getRole());
		comboBox.setBounds(153, 180, 136, 21);
		desktopPane.add(comboBox);
		
		MyButton button_2 = new MyButton("删除");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_2.setBounds(221, 287, 90, 23);
		desktopPane.add(button_2);
		
		textField.setBounds(153, 73, 136, 25);
		desktopPane.add(textField);
		
		lblNewLabel_1.setBounds(153, 124, 136, 25);
		desktopPane.add(lblNewLabel_1);
		
		GoTo(message);
	}
	
	private void GoTo(String sign){
		lblNewLabel_1.setVisible(false);
		textField.setVisible(false);
		lblNewLabel.setVisible(false);
		label_3.setVisible(false);
		
		if(sign.equals("新建")){
			textField.setVisible(true);
			label_3.setVisible(true);
		}else if(sign.equals("查看")){
			lblNewLabel_1.setVisible(true);
			lblNewLabel.setVisible(true);
		}else{
			label_3.setVisible(true);
			lblNewLabel.setVisible(true);
			
		}
	}
}
