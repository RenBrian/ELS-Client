package PO.Agency;

import java.io.Serializable;

public class AgencyPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected CityPO city;
	protected String ID;
	
	public CityPO getCity() {
		return city;
	}
	public void setCity(CityPO city) {
		this.city = city;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
}
