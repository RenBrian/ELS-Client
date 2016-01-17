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
	 * 查找用户
	 */
	public UserPO get(UserPO po);
	/*
	 * 添加用户
	 */
	public void add(UserPO po);
	/*
	 *删除用户
	 */
	public void remove(UserPO po);
	/*
	 * 修改用户
	 */
	public void change(UserPO po);
}
