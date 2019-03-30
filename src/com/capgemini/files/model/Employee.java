package com.capgemini.files.model;

import java.util.Objects;

public class Employee {
	
	private int employeId;
	private String employeName;
	private double employeeSalary;
	
	public Employee() {
		super();
	
	}
	
	public Employee(int employeId, String employeName, double employeeSalary) {
		super();
		this.employeId = employeId;
		this.employeName = employeName;
		this.employeeSalary = employeeSalary;
	}
	
	public int getEmployeId() {
		return employeId;
	}
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeId=" + employeId + ", employeName=" + employeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	@Override
	public int hashCode() {

		return Objects.hash(employeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;

		Employee employee = (Employee) obj;
		if (this.employeId == employee.employeId)
			return true;
		else
			return false;

	}

}
