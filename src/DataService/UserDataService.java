package DataService;

import java.util.ArrayList;

import PO.UserPO;

public interface UserDataService{
	/*
	 * 增加
	 */
	public void add(UserPO po);
	/*
	 * 删除
	 */
	public void remove(UserPO po);
	/*
	 * 修改
	 */
	public void change(UserPO po1,UserPO po2);
	/*
	 * 查
	 */
	public UserPO get(UserPO po);
	/*
	 * 获取列表
	 */
	public ArrayList<UserPO> getList();

}
