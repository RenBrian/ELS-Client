package UI.Common;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

@SuppressWarnings("serial")
public class DigitDocument extends PlainDocument{
	private int maxLength;
	
	public DigitDocument(int NewMaxLength){
		super();
		this.maxLength=NewMaxLength;
	}

	public void insertString(int offset,String str,javax.swing.text.AttributeSet a) throws BadLocationException{
		if(str==null)
			return;
		if(this.getLength()+str.length()<=maxLength){
			char[] upper=str.toCharArray();
			int length=0;
			for(int i=0;i<upper.length;i++){
				if(Character.isDigit(upper[i])){
					upper[length++]=upper[i];
				}
			}
			super.insertString(offset, new String(upper,0,length), a);
		}
	}

}
