package com.java.test;

public class Company {
	
	private static Company company=null;
	private int val=10;

	//unable to create object of class from outside
	private Company() {

	}
	
	//unable to call this method from outside of the clas.
	//that's why making this method as static
	public static Company getInstance() {
		if (company == null) {
			System.out.println("Current Instance of Company is : " + company);
			System.out.println("Hence Creating new Instance of class Company");
			return company = new Company();
		}
		System.out.println(company.val);
		System.out.println("Using alreday created instance of class");
		return company;
	}
	
	
	/**
	 * Hole business logic you can write here.
	 */	
	public void getInfo() {

	}
}
