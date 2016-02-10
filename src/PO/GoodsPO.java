package PO;

import java.io.Serializable;

public class GoodsPO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		temp = Double.doubleToLongBits(sizeWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(trueWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
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
		GoodsPO other = (GoodsPO) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (Double.doubleToLongBits(sizeWeight) != Double.doubleToLongBits(other.sizeWeight))
			return false;
		if (Double.doubleToLongBits(trueWeight) != Double.doubleToLongBits(other.trueWeight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}



}
