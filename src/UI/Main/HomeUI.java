package UI.Main;

import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

import UI.Common.DigitField;
import UI.Common.MyButton;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class HomeUI extends JLayeredPane {

	public HomeUI(){
		this.setBounds(0, 30, 1000, 670);
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

		MyButton button = new MyButton("查询");
		button.setFont(new Font("STZhongsong", Font.PLAIN, 17));
		button.setBounds(534, 285, 93, 35);

		button.setBorderPainted(false);
		add(button);




	}

}
