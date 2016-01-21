package PO.Receipt.Transit;

public class Center_FightPO extends TransitPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id_Fight;
	private String id_Huogui;
	private String loader;           //监装员
	private double fee_xepress;
	
	
	public String getId_Fight() {
		return id_Fight;
	}
	public void setId_Fight(String id_Fight) {
		this.id_Fight = id_Fight;
	}
	public String getId_Huogui() {
		return id_Huogui;
	}
	public void setId_Huogui(String id_Huogui) {
		this.id_Huogui = id_Huogui;
	}
	public String getLoader() {
		return loader;
	}
	public void setLoader(String loader) {
		this.loader = loader;
	}
	public double getFee_xepress() {
		return fee_xepress;
	}
	public void setFee_xepress(double fee_xepress) {
		this.fee_xepress = fee_xepress;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
