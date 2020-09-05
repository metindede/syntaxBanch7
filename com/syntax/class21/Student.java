package com.syntax.class21;

public class Student {
	String name, adress;

	Student(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	void displayInfo() {
		System.out.println(name + "'s adress is " + adress);
	}

	public static void main(String[] args) {
		
		Student student = new Student("Ahmet", "Pittsburgh");

		student.displayInfo();
	}
}