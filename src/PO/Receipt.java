package PO;

import java.util.Date;

public class Receipt {
	protected String ID;//每张单据都有一个特定的id
	protected Date time;//每张单据都有时间记录
	
	public void setID(String id){
		ID=id;
	}
	public String getID(){
		return ID;
	}
	public void setTime(Date time){
		this.time=time;
	}
	public Date getTime(){
		return time;
	}
	
}
