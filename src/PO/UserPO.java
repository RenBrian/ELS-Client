package PO;

import java.io.Serializable;

public class UserPO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
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
//	public boolean equals(UserPO po){
//		if(po==null)
//			return false;
//		if(id.equals(po.getID())&&password.equals(po.getPassword())&&role.equals(po.getRole()))
//			return true;
//		return false;
//
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		UserPO other = (UserPO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

}
