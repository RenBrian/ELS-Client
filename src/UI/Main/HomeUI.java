package UI.Main;

import java.awt.Color;
import javax.swing.JLayeredPane;
import UI.Common.DigitField;
import UI.Common.MyButton;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class HomeUI extends JLayeredPane {
	public DigitField idField = new DigitField();
	public MyButton button = new MyButton("查询");

	public HomeUI(){
		this.setBounds(0, 30, 1000, 670);
		idField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyChar()==KeyEvent.VK_ENTER)
					setVisible(false);
			}
		});
		idField.setBounds(192, 286, 427, 35);
		idField.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(65, 224, 208)));
		add(idField);
		idField.setColumns(10);

		button.setText("查询订单");
		button.setFont(new Font("STZhongsong", Font.PLAIN, 17));
		button.setBounds(618, 285, 139, 35);

		button.setBorderPainted(false);
		add(button);




	}

}
