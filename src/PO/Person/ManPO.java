package PO.Person;

import java.io.Serializable;

public class ManPO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String name;//姓名
	protected String phone_number;//电话
	protected String address;//地址
	
	
	
	public ManPO() {
		super();
	}
	
	public ManPO(String name, String phone_number, String address) {
		this.name = name;
		this.phone_number = phone_number;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
