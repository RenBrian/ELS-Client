package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import DataService.UserDataService;
import PO.UserPO;

@SuppressWarnings("serial")
public class UserData implements Serializable,UserDataService{

	private ArrayList<UserPO> upl;
	
	@SuppressWarnings("unchecked")
	public UserData() {
		try {
			FileInputStream fis = new FileInputStream("User.file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			upl = (ArrayList<UserPO>) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("User.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				upl = new ArrayList<UserPO>();
				os.writeObject(upl);
				os.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public UserPO get(UserPO up) {
			for (UserPO po : upl) {
				if (po.getID().equals(up.getID())) 
					return po;
			}
			return null;
	}
	@Override
	public void add(UserPO up) {
		upl.add(up);
		Output();
	}
	@Override
	public void remove(UserPO up) {
		UserPO temp = null;
		for(UserPO user:upl){
			if(user.getID().equals(up.getID())){
				temp=user;
			}
		}
		upl.remove(temp);
		Output();

	}
	@Override
	public void change(UserPO up1, UserPO up2) {
		remove(up1);
		add(up2);
		Output();
	}
	@Override
	public ArrayList<UserPO> getList(){
		return upl;
	}
	private void Output(){
		try {
			FileOutputStream fs = new FileOutputStream("User.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
//		UserPO a = new UserPO("admin", "admin","管理员");
//		ul.addUser(a);
		UserData ul = new UserData();
			for (UserPO po : ul.upl) {
				System.out.println(po.getID() + po.getPassword()+po.getRole());
			}

	}

}
