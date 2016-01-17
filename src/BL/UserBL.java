package BL;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import BLService.UserBLService;
import Data.UserData;
import DataService.UserDataService;
import PO.UserPO;

public class UserBL implements UserBLService{
	UserDataService data=new UserData();
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
	public void add(UserPO po) {
		if(data.get(po)!=null){
			JOptionPane.showMessageDialog(null, "账号已存在", "", JOptionPane.ERROR_MESSAGE);
			return;
		}
		data.add(po);
		JOptionPane.showMessageDialog(null, "账号添加成功");
		
	}
	@Override
	public void remove(UserPO po) {
		if(data.get(po)==null){
			JOptionPane.showMessageDialog(null, "账号不存在", "", JOptionPane.ERROR_MESSAGE);
			return;
		}
		data.remove(po);
		JOptionPane.showMessageDialog(null, "账号添加成功");
	}
	@Override
	public void change(UserPO po) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public UserPO get(UserPO po) {
		return data.get(po);
	}
	
}
