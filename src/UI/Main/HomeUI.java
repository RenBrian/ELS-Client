package UI.Main;

import java.awt.Color;
import javax.swing.JLayeredPane;
import UI.Common.DigitField;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class HomeUI extends JLayeredPane {
	public DigitField idField = new DigitField();
	public JButton button = new JButton("查询");

	public HomeUI(){
		this.setBounds(0, 30, 1000, 670);
		idField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyChar()==KeyEvent.VK_ENTER)
					setVisible(false);
			}
		});
		idField.setBounds(244, 286, 345, 35);
		idField.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(65, 224, 208)));
		add(idField);
		idField.setColumns(10);


		button.setText("查询订单");
		button.setFocusPainted(false);
		button.setFont(new Font("STZhongsong", Font.PLAIN, 17));
		button.setBounds(588, 285, 139, 35);

		button.setBorderPainted(false);
		add(button);

		JLabel lblNewLabel = new JLabel();
		ImageIcon icon=new ImageIcon("421.jpg");
		icon.setImage(icon.getImage().getScaledInstance(1000, 670, 1));
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(0,0, 1000, 670);
		add(lblNewLabel);




	}
}
