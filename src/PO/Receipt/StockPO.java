package PO.Receipt;

import PO.Agency.WarehousePO;

public class StockPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private WarehousePO warehouse;
	private String arrival;
	private String area;   //区
	private String row;    //排
	private String shelf;  //架
	private String seat; //位
	private String ways; //出库装运方式
	private String id_Transit;//出库汽运编号或者中转单编号
	
	
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRow() {
		return row;
	}
	public void setRow(String row) {
		this.row = row;
	}
	public String getShelf() {
		return shelf;
	}
	public void setShelf(String shelf) {
		this.shelf = shelf;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getWays() {
		return ways;
	}
	public void setWays(String ways) {
		this.ways = ways;
	}
	public String getId_Transit() {
		return id_Transit;
	}
	public void setId_Transit(String id_Transit) {
		this.id_Transit = id_Transit;
	}
	public WarehousePO getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(WarehousePO warehouse) {
		this.warehouse = warehouse;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
