package UI.Common;
 
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 

@SuppressWarnings("serial")
public class MainFrame extends MyFrame{
	
	public JButton button1 = new MyButton("登录");
	public JButton button2 = new MyButton("主页");
//	private JButton button4 = new MyButton("x");
	public JButton button3 = new MyButton("注销");
	public JButton button5 = new MyButton("返回");
	
//	private JLayeredPane lay = new MyTitle();
	public  MyDesktop desktopPane = new MyDesktop();
//	private int xOld=0,yOld=0;
	int Width=1000,Height=700;
//	
	public void InitFrame(){
		setUndecorated(true);
		setBounds(200,20,Width,Height);
	}
	public void InitDesktop(){
		desktopPane.layeredPane.setBounds(0, 0, 1000, 30);
		desktopPane.btnNewButton.setLocation(955, 0);
		desktopPane.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		desktopPane.setBounds(0, 0, Width, Height);
		desktopPane.setBackground(Color.WHITE);
		getContentPane().add(desktopPane, BorderLayout.CENTER);
	}
	private void InitButton(){
		Initbutton1();
		Initbutton2();
		Initbutton3();
		Initbutton5();
	}
	private void Initbutton1(){
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button1.setBounds(0, 0, 60, 30);
		desktopPane.layeredPane.add(button1);
	}
	private void Initbutton2(){
		button2.setBounds(0, 0, 60, 30);
		desktopPane.layeredPane.add(button2);
		button2.setVisible(false);
	}
	private void Initbutton3(){
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button3.setBounds(80, 0, 60, 30);
		desktopPane.layeredPane.add(button3);
		button3.setVisible(false);
	}

	private void Initbutton5(){
		button5.setBounds(0, 0, 60, 30);
		desktopPane.layeredPane.add(button5);
		button5.setVisible(false);
	}
	public MainFrame() {
		InitFrame();
		InitDesktop();
		InitButton();
	}
	
	public static void main(String[] args){
		MainFrame a=new MainFrame();
		a.setVisible(true);
	}
}
