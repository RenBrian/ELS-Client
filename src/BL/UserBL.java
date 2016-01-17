package BL;

import java.util.ArrayList;

import BLService.UserBLService;
import Data.UserData;
import PO.UserPO;

public class UserBL implements UserBLService{
	UserData data=new UserData();
	@Override
	public String Login(UserPO po) {
		UserPO user=data.get(po);
		if(user==null){
			return "账号不存在";
		}else if(!user.getPassword().equals(po.getPassword())){
			return "密码错误";
		}else{
			return user.getRole();
		}
		
	}
	@Override
	public ArrayList<UserPO> getList() {
		
		return data.getList();
	}
	@Override
	public void addUser(UserPO po) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeUser(UserPO po) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changeUser(UserPO po1, UserPO po2) {
		// TODO Auto-generated method stub
		
	}
	
}
