package UI.Main;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.Font;

@SuppressWarnings("serial")
public class HomeUI extends JLayeredPane {

	public HomeUI(){
		setOpaque(false);
		setBounds(0, 0, 689, 497);
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(187, 194, 224, 35);
		textField_2.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(65, 224, 208)));
		add(textField_2);
		textField_2.setColumns(10);

		JButton button = new JButton("查询");
		button.setFont(new Font("STZhongsong", Font.PLAIN, 17));
		button.setBounds(410, 194, 93, 35);
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
