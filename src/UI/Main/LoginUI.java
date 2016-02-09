package UI.Main;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import BL.UserBL;
import BLService.UserBLService;
import PO.UserPO;
import UI.Admin.AdminUI;
import UI.Common.MainFrame;
import UI.Common.MyButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;

public class LoginUI extends MainFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button = new MyButton("登录");
	JTextField idField = new JTextField();
	JPasswordField keyField = new JPasswordField();

	public LoginUI(){

		this.setBounds(500,200,429,330);
		desktopPane.btnNewButton.setLocation(384, 0);
		desktopPane.layeredPane.setBounds(0, 0, 429, 176);
		desktopPane.setBackground(new Color(247, 250, 253));

		JLabel lblNewLabel = new JLabel("ELS");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 99));
		lblNewLabel.setBounds(140, 52, 171, 79);
		desktopPane.layeredPane.add(lblNewLabel);
		idField.setForeground(Color.BLACK);

		idField.setBounds(137,186 ,175 , 32);
		idField.setColumns(10);
		idField.setOpaque(false);
		desktopPane.add(idField);

		keyField.setBounds(137, 218,175 , 32);
		keyField.setColumns(10);
		keyField.setOpaque(false);
		desktopPane.add(keyField);

		JLabel label = new JLabel("账号");
		label.setBounds(90, 186, 45, 32);
		desktopPane.add(label);

		JLabel label_1 = new JLabel("密码");
		label_1.setBounds(90, 218, 45, 32);
		desktopPane.add(label_1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			UserBLService bl=new UserBL();
			UserPO po=new UserPO(idField.getText(),String.valueOf(keyField.getPassword()),null);
			String result=bl.Login(po);
//			System.out.println(result);
			if(result.equals("密码错误")){
				JOptionPane.showMessageDialog(null, "密码错误", "", JOptionPane.ERROR_MESSAGE);
				return;
			}else if(result.equals("管理员")){
				AdminUI admin=new AdminUI();
				admin.setVisible(true);
				dispose();
			}
			}
		});

		button.setBackground(new Color(65, 224, 208));
		button.setBounds(137, 288, 175, 32);
		desktopPane.add(button);

		JCheckBox checkBox = new JCheckBox("记住密码");
		checkBox.setFont(new Font("宋体", Font.PLAIN, 12));
		checkBox.setBackground(new Color(247, 250, 253));
		checkBox.setForeground(Color.BLACK);
		checkBox.setBounds(137, 256, 103, 23);
		desktopPane.add(checkBox);



	}
	public static void main(String[] args){
		LoginUI a=new LoginUI();
		a.setVisible(true);
	}
}
