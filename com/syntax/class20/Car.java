package com.syntax.class20;

public class Car {
	public static String make;
	protected String model, color;
	int year, door, speed;
	private double price;

	public void displayInfo() {
		System.out.println("We build " + year + " " + make + " " + model + " for price = $" + price);
	}

	public static void main(String[] args) {

		Car car=new Car();
		/*
		 	Car --> class name
		 	car --> reference variable
			new --> keyword
			Car(); --> calling Constructor --> block of the code that initializes the obj
		 */
		make="BMW";
		car.model="M5";
		car.year=2021;
		car.color="Pink";
		car.door=2;
		car.speed=200;
		car.price=90000;
		
		Car car1=new Car();
		car1.model="i5";
		car1.year=2020;
		car1.color="Blue";
		car1.door=4;
		car1.speed=180;
		
		car.displayInfo();
		car1.displayInfo();
		
		//static String driver; --> local variables CANNOT BE STATIC
		//System.out.println(driver);
	}
}