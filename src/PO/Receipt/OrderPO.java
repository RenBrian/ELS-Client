package PO.Receipt;

import java.util.ArrayList;

import PO.GoodsPO;
import PO.Person.CustomerPO;
import PO.Receipt.ReceiptPO;

public class OrderPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GoodsPO goods;
	private CustomerPO sender;
	private CustomerPO receiver;
	private double fee;
	private double fee_pack;
	private double fee_express;
	private String id_Transit;
	private String id_Load;
	private String name;//签收人姓名
	private ArrayList<String> state;//订单状态 实时更新
	
	
	
	public String getId_Transit() {
		return id_Transit;
	}


	public void setId_Transit(String id_Transit) {
		this.id_Transit = id_Transit;
	}


	public String getId_Load() {
		return id_Load;
	}


	public void setId_Load(String id_Load) {
		this.id_Load = id_Load;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public GoodsPO getGoods() {
		return goods;
	}
	public void setGoods(GoodsPO goods) {
		this.goods = goods;
	}
	public CustomerPO getSender() {
		return sender;
	}
	public void setSender(CustomerPO sender) {
		this.sender = sender;
	}
	public CustomerPO getReceiver() {
		return receiver;
	}
	public void setReceiver(CustomerPO receiver) {
		this.receiver = receiver;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getFee_pack() {
		return fee_pack;
	}
	public void setFee_pack(double fee_pack) {
		this.fee_pack = fee_pack;
	}
	public double getFee_express() {
		return fee_express;
	}
	public void setFee_express(double fee_express) {
		this.fee_express = fee_express;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getState() {
		return state;
	}
	public void setState(ArrayList<String> state) {
		this.state = state;
	}
	
	

}
