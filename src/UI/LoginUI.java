package UI;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginUI extends JLayeredPane {
	JButton button = new JButton("登录");
	JTextField textField = new JTextField();
	JTextField textField_1 = new JPasswordField();
	public static void main(String[] args){
		LoginUI a=new LoginUI();
		a.setVisible(true);
	}
	
	public LoginUI(){
		
		setOpaque(false);
		setBounds(0,0,700,500);
		
		textField.setBounds(308,141 ,145 , 21);
		textField.setColumns(10);
		add(textField);
		
		JLabel label = new JLabel("账号");
		label.setBounds(220, 141, 54, 21);
		add(label);
		
		JLabel label_1 = new JLabel("密码");
		label_1.setBounds(220, 230, 54, 21);
		add(label_1);
		
		textField_1.setBounds(308, 230, 145, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		
		button.setBackground(new Color(65, 224, 208));
		button.setBounds(318, 316, 120, 23);
		add(button);
		
	}
}
