package com.syntax.class18;

public class Employee {
	int empId;
	double salary;
	
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		
		System.out.println(Employee.CEO);
		
		//accessing static variables within same class
		System.out.println(CEO);
		
		//accessing static method
		sayHelloToCeo();
	}
	
	static void sayHelloToCeo() {
		System.out.println("Hi "+CEO);
	}
	
}