package com.syntax.class28;

public class Employee {
	public String fullName, title;
	public long ssn;
	
	// make variable as private
	private double salary;
	private int age, empId;

	public Employee(String fullName, String title) {
		this.fullName = fullName;
		this.title = title;
	}

	// create public methods (getters and setters)to give access to private
	// variables

	// creating setters
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		if (age > 16) {
			this.age = age;
		}
	}

	public void setEmpID(int empId) {
		if (empId > 0) {
			this.empId = empId;
		}
	}

	// creating getters
	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public int getEmpdId() {
		return empId;
	}
}