package UI.Common;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 

@SuppressWarnings("serial")
public class MyFrame extends JFrame{
	
	public JButton button1 = new MyButton();
	public JButton button2 = new MyButton();
	private JButton button4 = new MyButton();
	public JButton button3 = new MyButton();
	public JButton button5 = new MyButton();
	
	private JLayeredPane lay = new MyTitle();
	public  JDesktopPane desktopPane = new JDesktopPane();
	private int xOld=0,yOld=0;
	int Width=1000,Height=700;
	
	public void InitFrame(){
		setUndecorated(true);
		setBounds(200,20,Width,Height);
		desktopPane.setBackground(Color.WHITE);
		getContentPane().add(desktopPane, BorderLayout.CENTER);
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
	private void InitLay(){
		lay.setBackground(new Color(64, 224, 208));
		lay.setBounds(0, 0, Width,30);
		desktopPane.add(lay);
	}
	private void InitButton(){
		Initbutton1();
		Initbutton2();
		Initbutton3();
		Initbutton4();
		Initbutton5();
	}
	private void Initbutton1(){
		ImageIcon icon=new ImageIcon("C:/Users/斌/Desktop/登录.png");
		button1.setIcon(icon);
		button1.setBounds(0, 0, 70, 30);
		lay.add(button1);
//		button1.setVisible(false);
	}
	private void Initbutton2(){
		ImageIcon icon=new ImageIcon("C:/Users/斌/Desktop/主页.png");
		button2.setIcon(icon);
		button2.setBounds(0, 0, 70, 30);
		lay.add(button2);
		button2.setVisible(false);
	}
	private void Initbutton3(){
		ImageIcon icon=new ImageIcon("C:/Users/斌/Desktop/注销.png");
		button3.setIcon(icon);
		button3.setBounds(80, 0, 70, 30);
		lay.add(button3);
		button3.setVisible(false);
	}
	private void Initbutton4(){
		ImageIcon icon=new ImageIcon("C:/Users/斌/Desktop/1.png");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button4.setBounds(Width-40, 0,40,30);
		button4.setIcon(icon);
		button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button4.setBackground(Color.RED);
			}
		});
		lay.add(button4);
	}
	private void Initbutton5(){
		ImageIcon icon=new ImageIcon("C:/Users/斌/Desktop/返回.png");
		button5.setBounds(0, 0, 70, 30);
		button5.setIcon(icon);
		lay.add(button5);
		button5.setVisible(false);
	}
	public MyFrame() {
		InitMouse();
		InitFrame();
		InitLay();
		InitButton();
	}
	
	public static void main(String[] args){
		MyFrame a=new MyFrame();
		a.setVisible(true);
	}
}
