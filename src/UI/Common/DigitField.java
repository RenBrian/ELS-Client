package UI.Common;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DigitField extends JTextField {
	public DigitField() {
		DigitDocument document=new DigitDocument(10);
		this.setDocument(document);
	}

}
