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
				UserPO admin= new UserPO("admin", "admin","管理员");
				upl.add(admin);
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
	public UserPO get(UserPO po) {
			for (UserPO up : upl) {
				if (up.getID().equals(po.getID())) 
					return up;
			}
			return null;
	}
	@Override
	public void add(UserPO po) {
		upl.add(po);
		Output();
	}
	@Override
	public void remove(UserPO po) {
		UserPO temp = null;
		for(UserPO user:upl){
			if(user.getID().equals(po.getID())){
				temp=user;
			}
		}
		upl.remove(temp);
		Output();

	}
	@Override
	public void change(UserPO po) {
		for(UserPO up:upl){
			if(up.getID().equals(po.getID()))
				up=po;
		}
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
		UserData ul = new UserData();
			for (UserPO po : ul.upl) {
				System.out.println(po.getID() + po.getPassword()+po.getRole());
			}

	}

}
