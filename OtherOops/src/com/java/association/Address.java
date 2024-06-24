package com.java.association;

public class Address {

	private long addressId;
	
	private String addressDetails;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressDetails=" + addressDetails + "]";
	}
	
	/**
	 * Association basically represent HAS-A relationship. It has two forms , A)
	 * Aggregation B) Composition Main purpose of association is basically it make
	 * loosely coupled relationship. With the help of association we can access only
	 * those fileds, method that we want. advantace - loosely coupled.
	 */
	
	public void getCustomStudentDetails() {
		Student student=new Student();
		System.out.println(student.getInfo_1());
	}
	
}
