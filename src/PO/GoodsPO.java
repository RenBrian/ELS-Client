package PO;

public class GoodsPO {
	private String name;
	private int number;
	private double trueWeight;
	private double sizeWeight;
	private double length,width,height;
	
	public GoodsPO(String name,int number,double trueWeight,double length,double width,double height){
		this.name=name;
		this.number=number;
		this.trueWeight=trueWeight;
		this.length=length;
		this.width=width;
		this.height=height;
		this.sizeWeight=length*width*height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getTrueWeight() {
		return trueWeight;
	}

	public void setTrueWeight(double trueWeight) {
		this.trueWeight = trueWeight;
	}

	public double getSizeWeight() {
		return sizeWeight;
	}

	public void setSizeWeight(double sizeWeight) {
		this.sizeWeight = sizeWeight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
