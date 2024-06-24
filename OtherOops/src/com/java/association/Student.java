package com.java.association;

public class Student {

	private long id;

	private String name;

	private Address address;
	
	public Student() {
		
	}

	public Student(long id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "[ Id : " + id + ", Name: " + name + ", Address : " + address+" ]";
	}
	
	public String getInfo_1() {
		return "Method getInfo_1 from Student class";
	}
	
	public String getInfo_2() {
		return "Method getInfo_2 from Student class";
	}
}
