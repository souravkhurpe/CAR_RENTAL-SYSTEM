package com.model;

public class Car {

	private int cid;
	private String cBrand;
	private String cName;
	private double basePrice;
	boolean isAvailable = true;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcBrand() {
		return cBrand;
	}
	public void setcBrand(String cBrand) {
		this.cBrand = cBrand;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	@Override
	public String toString() {
		return "Car ID= " + cid + ", Brand= " + cBrand + ", Model Name= " + cName + ", Price Per Day= " + basePrice
				+ ", Car Available= " + isAvailable ;
	}
	
	

}
