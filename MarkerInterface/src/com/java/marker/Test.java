package com.java.marker;

import com.java.service.EmployeeService;

public class Test {

	public static void main(String args[]) {
		EmployeeService employeeService = new EmployeeService();
		employeeService.addNewEmployeeData(employeeService, "Added Employee Data");
	}
}
