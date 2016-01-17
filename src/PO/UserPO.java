package PO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserPO implements Serializable{
	/**
	 * 
	 */
	protected String id;
	protected String password;
	protected String role;
	
	public UserPO(String i, String p,String role){
		this.id = i;
		this.password = p;
		this.role=role;
	}
	
	public UserPO(){
		super();
	}
	
	public void setID(String i){
		this.id = i;
	}
	public String getID(){
		return id;
	}
	
	public void setPassword(String p){
		this.password = p;
	}
	public String getPassword(){
		return password;
	}
	public void setRole(String r){
		this.role=r;
	}
	public String getRole(){
		return role;
	}
	
}
