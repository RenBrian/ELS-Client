package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Data implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<?> data;
	private String str;
	public Data(String str){
		try {
			this.str=str;
			FileInputStream fis=new FileInputStream(str);
			ObjectInputStream is=new ObjectInputStream(fis);
			data=(ArrayList<?>) is.readObject();
			is.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs=new FileOutputStream(str);
				ObjectOutputStream os=new ObjectOutputStream(fs);
				data=new ArrayList<Object>();
				os.writeObject(data);
				os.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	public ArrayList<?> getList(){
		return data;
	}
	public void saveList(ArrayList<?> data){
		this.data=data;
		try {
			FileOutputStream fs=new FileOutputStream(str);
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(data);
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
