package com.java.test;

public class XorAppl {

	public static void main(String args[]) {
		Company getInstance1 = Company.getInstance();

		System.out.println(getInstance1.hashCode());
		
		Test test=new Test();
		test.getInfo();
	}
}
