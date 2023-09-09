package com.model;

public class Customer {

	private int id;
	private String name;
	private long mobileNo;
	private boolean isRent;
	private String carRent = "Not taken any car on rent";

	public String getCarRent() {
		return carRent;
	}

	public void setCarRent(String carRent) {
		this.carRent = carRent;
	}

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer ID=" + id + ", Name=" + name + ", MobileNo=" + mobileNo + ", isRented=" + isRent + ", Car Rent Details="
				+ carRent ;
	}

}
