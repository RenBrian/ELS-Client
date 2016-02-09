package UI.Hall;

import java.awt.EventQueue;

import javax.swing.JLayeredPane;

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
	}

	public HallUI() {
		InitHall();
	}
}
