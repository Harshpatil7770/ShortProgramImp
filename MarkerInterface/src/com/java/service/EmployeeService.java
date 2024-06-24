package com.java.service;

import com.java.marker.ADMIN;

public class EmployeeService implements ADMIN {

	public void addNewEmployeeData(Object objcts, String data) {

		if (objcts instanceof ADMIN) {
			System.out.println(data);
		}
	}
}
