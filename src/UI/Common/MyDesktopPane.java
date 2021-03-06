package UI.Common;

import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;

public class MyDesktopPane extends JDesktopPane{
	public JButton btnNewButton = new MyButton("x");
	public JLayeredPane layeredPane = new MyTitle();

//	public MyLay lay=new MyLay();
	public MyDesktopPane() {
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		setBackground(Color.WHITE);
		layeredPane.setBounds(0, 0, 450, 30);
		add(layeredPane);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(64,224,208));
			}
		});


		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		btnNewButton.setBounds(405, 0, 45, 30);
		layeredPane.add(btnNewButton);
//		layeredPane.setBounds(320, 89, -201, -24);
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
}
