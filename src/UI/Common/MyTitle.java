package UI.Common;

import java.awt.Color;
import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public class MyTitle extends JLayeredPane{

	public MyTitle(){
		setBounds(0, 0, 30, 30);
		setOpaque(true);
		setBackground(new Color(64, 224, 208));
	}
}
