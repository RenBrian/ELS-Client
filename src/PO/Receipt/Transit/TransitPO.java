package PO.Receipt.Transit;

import java.util.ArrayList;

import PO.Receipt.ReceiptPO;

public class TransitPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<String> orderList;
	protected String start;
	protected String arrival;

	public ArrayList<String> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<String> orderList) {
		this.orderList = orderList;
	}
	

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
