package UI.Common;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int xOld=0,yOld=0;
	int Width=1000,Height=700;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void InitMouse(){
		//处理拖动事件
				this.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						xOld = e.getX();
						yOld = e.getY();
					}
				});
				this.addMouseMotionListener(new MouseMotionAdapter() {
					@Override
					public void mouseDragged(MouseEvent e) {
						int xOnScreen = e.getXOnScreen();
						int yOnScreen = e.getYOnScreen();
						int xx = xOnScreen - xOld;
						int yy = yOnScreen - yOld;
						MyFrame.this.setLocation(xx, yy);
					}
				});
	}
	private void InitFrame(){
		setUndecorated(true);
		setBounds(100, 100, 450, 350);
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		InitFrame();
		InitMouse();
//		desktopPane.
	}

}
