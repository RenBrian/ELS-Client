package UI.Common;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends MyFrame{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public MyDesktopPane desktopPane = new MyDesktopPane();

	public MainFrame() {
		desktopPane.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().add(desktopPane, BorderLayout.CENTER);

	}

}
