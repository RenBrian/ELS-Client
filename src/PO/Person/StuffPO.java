package PO.Person;

import java.io.Serializable;

public class StuffPO extends ManPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String ID;
	protected String sex;

	
	public StuffPO(String name,String iD, String sex,String phone,String address) {
		super(name,phone,address);
		this.ID = iD;
	}

	
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


}
