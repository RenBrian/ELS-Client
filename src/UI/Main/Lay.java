package UI.Main;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public class Lay extends JLayeredPane{
	public boolean isExit=false;
	public boolean isLogin=false;
	public JButton button_1 = new JButton("登录");
	public JButton button_2 = new JButton("主页");
	public JButton button = new JButton("Ⅹ");
	public JButton button_3 = new JButton("注销");
	public Lay(){
		setOpaque(true);
		setBackground(new Color(64, 224, 208));
		setBounds(0, 0, 700, 30);

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(new Color(64, 224, 208));
			}
		});
		button.setBounds(650, 0, 50, 30);
		button.setBackground(new Color(64, 224, 208));
		button.setBorderPainted(false);
		add(button);

		button_1.setBorderPainted(false);
		button_1.setBackground(new Color(64, 224, 208));
		button_1.setBounds(0, 0, 68, 30);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_1.setBackground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button_1.setBackground(new Color(64, 224, 208));
			}
		});
		add(button_1);
		button_2.setBorderPainted(false);
		button_2.setVisible(false);
		button_2.setBackground(new Color(64, 224, 208));
		button_2.setBounds(0, 0, 68, 30);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_2.setBackground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button_2.setBackground(new Color(64, 224, 208));
			}
		});
		add(button_2);

		button_3.setBorderPainted(false);
		button_3.setBackground(new Color(64, 224, 208));
		button_3.setBounds(66, 0, 68, 30);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_3.setBackground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button_3.setBackground(new Color(64, 224, 208));
			}
		});
		button_3.setVisible(false);
		add(button_3);
	}
}
