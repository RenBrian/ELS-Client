package UI.Common;

import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class MyTitle extends JLayeredPane{

	public MyTitle(){
		setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(192, 192, 192)));
		setBounds(0, 0, 30, 30);
		setOpaque(true);
		setBackground(new Color(64, 224, 208));
	}
}
