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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Max_Capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		WarehousePO other = (WarehousePO) obj;
		if (Double.doubleToLongBits(Max_Capacity) != Double.doubleToLongBits(other.Max_Capacity))
			return false;
		if (Double.doubleToLongBits(rate) != Double.doubleToLongBits(other.rate))
			return false;
		return true;
	}





}
