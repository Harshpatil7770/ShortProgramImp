package com.java.inheritance;

public class Employee extends Company {

	/**
	 * Employee class extends Company Is-A relationship. It is part of inheritance.
	 * Inheritance means inherite properties from one class to another class. It
	 * represent parent-child relationship. limitations - Inheritance become tightly
	 * coupled, if you change something in parent class, it will affect in child
	 * class. Advantace - code reusability.
	 */
	public void processEmpDataa() {
		System.out.println(getName());
	}
}
