package PO.Agency;

public class WarehousePO extends AgencyPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double  Max_Capacity;  //最大容量
	private double	rate;//警报比例
	
	
	public double getMax_Capacity() {
		return Max_Capacity;
	}
	public void setMax_Capacity(double max_Capacity) {
		Max_Capacity = max_Capacity;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
