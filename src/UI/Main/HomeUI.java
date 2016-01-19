package UI.Main;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import UI.Common.DigitField;
import UI.Common.MyLay;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class HomeUI extends MyLay {

	public HomeUI(){
		JTextField textField_2 = new DigitField();		
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyChar()==KeyEvent.VK_ENTER)
					setVisible(false);
			}
		});
		textField_2.setBounds(263, 286, 272, 35);
		textField_2.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(65, 224, 208)));
		add(textField_2);
		textField_2.setColumns(10);

		JButton button = new JButton("查询");
		button.setFont(new Font("STZhongsong", Font.PLAIN, 17));
		button.setBounds(534, 285, 93, 35);
		button.setBackground(new Color(65, 224, 208));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(new Color(65, 224, 208));
			}
		});
		button.setBorderPainted(false);
		add(button);




	}

}
