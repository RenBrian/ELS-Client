package BLService;

import java.util.ArrayList;

import PO.UserPO;

public interface UserBLService {
	/*
	 * 登录
	 */
	public String Login(UserPO po);
	/*
	 * 获取用户列表
	 */
	public ArrayList<UserPO> getList();
	/*
	 * 添加用户
	 */
	public void addUser(UserPO po);
	/*
	 *删除用户
	 */
	public void removeUser(UserPO po);
	/*
	 * 修改用户
	 */
	public void changeUser(UserPO po1,UserPO po2);
}
