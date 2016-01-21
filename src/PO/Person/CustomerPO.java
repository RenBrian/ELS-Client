package PO.Person;

import java.io.Serializable;

public class CustomerPO extends ManPO implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public CustomerPO(String name, String phone_number, String address) {
		
		super(name, phone_number, address);
		
	}
	
	
}
