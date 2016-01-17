package UI.Common;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton{
	public MyButton(){
		Init();
	}
	public MyButton(String text){
		this.setText(text);
		Init();
	}
	public void Init(){
		this.setBorderPainted(false);
		this.setBounds(0, 0, 30, 30);
		this.setBackground(new Color(64,224,208));
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setBackground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				setBackground(new Color(64, 224, 208));
			}
		});
	}
}
