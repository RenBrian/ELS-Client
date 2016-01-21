package PO.Receipt.Transit;

public class Hall_LoadPO extends TransitPO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
			
			private String id_vehicle;
			private double fee_express;
			private String driver;
			private String loader;
			
			public String getId_vehicle() {
				return id_vehicle;
			}
			public void setId_vehicle(String id_vehicle) {
				this.id_vehicle = id_vehicle;
			}
			public double getFee_express() {
				return fee_express;
			}
			public void setFee_express(double fee_express) {
				this.fee_express = fee_express;
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
			public static long getSerialversionuid() {
				return serialVersionUID;
			}
			
			
}
