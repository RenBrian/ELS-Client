package PO.Receipt;

public class BillPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double fee;
	private String courier;
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getCourier() {
		return courier;
	}
	public void setCourier(String courier) {
		this.courier = courier;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
