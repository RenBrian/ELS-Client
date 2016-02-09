package UI.Common;

import javax.swing.JTextField;

public class DigitField extends JTextField {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public DigitField() {
		DigitDocument document=new DigitDocument(10);
		this.setDocument(document);
	}

}
