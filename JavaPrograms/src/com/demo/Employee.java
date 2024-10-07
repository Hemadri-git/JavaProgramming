package com.demo;

public class Employee{
	
	int employeeId;
	String employeeName;
	
	public void setEmployee(int employeeId,String employeeName) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employee Id = " + employeeId + ", employee Name = " + employeeName + "]";
	}
	
}