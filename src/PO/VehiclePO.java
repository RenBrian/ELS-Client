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



	/**
	 *
	 */

	public VehiclePO() {
		super();
	}
	public VehiclePO(String id_Vehicle, String id_Card, String id_Engine, Date buy, Date service) {
		super();
		this.id_Vehicle = id_Vehicle;
		this.id_Card = id_Card;
		this.id_Engine = id_Engine;
		this.buy = buy;
		Service = service;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Service == null) ? 0 : Service.hashCode());
		result = prime * result + ((buy == null) ? 0 : buy.hashCode());
		result = prime * result + ((id_Card == null) ? 0 : id_Card.hashCode());
		result = prime * result + ((id_Engine == null) ? 0 : id_Engine.hashCode());
		result = prime * result + ((id_Vehicle == null) ? 0 : id_Vehicle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiclePO other = (VehiclePO) obj;
		if (Service == null) {
			if (other.Service != null)
				return false;
		} else if (!Service.equals(other.Service))
			return false;
		if (buy == null) {
			if (other.buy != null)
				return false;
		} else if (!buy.equals(other.buy))
			return false;
		if (id_Card == null) {
			if (other.id_Card != null)
				return false;
		} else if (!id_Card.equals(other.id_Card))
			return false;
		if (id_Engine == null) {
			if (other.id_Engine != null)
				return false;
		} else if (!id_Engine.equals(other.id_Engine))
			return false;
		if (id_Vehicle == null) {
			if (other.id_Vehicle != null)
				return false;
		} else if (!id_Vehicle.equals(other.id_Vehicle))
			return false;
		return true;
	}


	public static void main(String[] args){
		VehiclePO a=new VehiclePO();
		VehiclePO b=new VehiclePO();
		System.out.print(a.equals(b));
	}
}
