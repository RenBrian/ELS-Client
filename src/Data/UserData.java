package Data;

import java.io.Serializable;
import java.util.ArrayList;

import DataService.UserDataService;
import PO.UserPO;

@SuppressWarnings("serial")
public class UserData implements Serializable,UserDataService{

	private ArrayList<UserPO> upl;
	private Data data=new Data("User.file");

	@SuppressWarnings("unchecked")
	public UserData() {
		upl=(ArrayList<UserPO>) data.getList();
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
		data.saveList(upl);
	}
	@Override
	public void remove(UserPO po) {
		upl.remove(po);
		data.saveList(upl);

	}
	@Override
	public void change(UserPO po) {
		int index=upl.indexOf(po);
		upl.set(index, po);
		data.saveList(upl);
	}

	@Override
	public ArrayList<UserPO> getList(){
		return upl;
	}


	public static void main(String[] args) {
		UserData ul = new UserData();
			UserPO user=new UserPO();
			user.setID("admin1");
			user.setPassword("admin");
			user.setRole("快递员");
//			ul.change(use);
			ul.remove(user);
			for (UserPO po : ul.upl) {
				System.out.println(po.getID() + po.getPassword()+po.getRole());
			}

	}

}
