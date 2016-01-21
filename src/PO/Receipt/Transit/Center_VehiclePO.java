package PO.Receipt.Transit;

public class Center_VehiclePO extends TransitPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id_Vehicle;
	private String driver;
	private String loader;
	private double fee_express;
	public String getId_Vehicle() {
		return id_Vehicle;
	}
	public void setId_Vehicle(String id_Vehicle) {
		this.id_Vehicle = id_Vehicle;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getLoader() {
		return loader;
	}
	public void setLoader(String loader) {
		this.loader = loader;
	}
	public double getFee_express() {
		return fee_express;
	}
	public void setFee_express(double fee_express) {
		this.fee_express = fee_express;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
