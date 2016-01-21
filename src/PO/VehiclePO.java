package PO;

import java.io.Serializable;
import java.util.Date;

public class VehiclePO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id_Vehicle;    //车辆代号
	private String id_Card;    //车牌号
	private String id_Engine; //发动机号
	private Date buy; //购买时间
	private Date Service;   //服役时间
	
	
	public String getId_Vehicle() {
		return id_Vehicle;
	}
	public void setId_Vehicle(String id_Vehicle) {
		this.id_Vehicle = id_Vehicle;
	}
	public String getId_Card() {
		return id_Card;
	}
	public void setId_Card(String id_Card) {
		this.id_Card = id_Card;
	}
	public String getId_Engine() {
		return id_Engine;
	}
	public void setId_Engine(String id_Engine) {
		this.id_Engine = id_Engine;
	}
	public Date getBuy() {
		return buy;
	}
	public void setBuy(Date buy) {
		this.buy = buy;
	}
	public Date getService() {
		return Service;
	}
	public void setService(Date service) {
		Service = service;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
