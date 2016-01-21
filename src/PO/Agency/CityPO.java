package PO.Agency;

import java.io.Serializable;

public class CityPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String ID;
	
	
	public CityPO() {
		super();
	}
	public CityPO(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
