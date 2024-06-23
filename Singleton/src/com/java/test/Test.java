package com.java.test;

public class Test {

	public void getInfo() {
		Company getInstance2 = Company.getInstance();
		System.out.println(getInstance2.hashCode());
	}
}
