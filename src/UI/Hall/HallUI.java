package UI.Hall;

import java.awt.EventQueue;

import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;

public class HallUI extends JLayeredPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HallUI frame = new HallUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private void InitHall(){
		this.setBounds(0, 30, 1000, 670);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(119, 73, 267, 234);
		add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("New tab", null, tabbedPane_1, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.addTab("New tab", null, tabbedPane_2, null);
	}

	public HallUI() {
		InitHall();
	}
}
