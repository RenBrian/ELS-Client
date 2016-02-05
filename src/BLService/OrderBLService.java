package BLService;

import PO.Receipt.OrderPO;

public interface OrderBLService {
	/*
	 * 添加订单
	 */
	public void add(OrderPO po);
	/*
	 * 删除订单
	 */
	public void remove(String id);
	/*
	 * 修改订单
	 */
	public void change(OrderPO po);
	/*
	 * 查找订单
	 */
	public OrderPO find(String id);

}
