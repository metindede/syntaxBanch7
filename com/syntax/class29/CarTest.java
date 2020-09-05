package com.syntax.class29;

public class CarTest {

	public static void main(String[] args) {

		Car truck = new Sedan(35000.0, "White", 16000.0);
		System.out.println("The new price of Truck with discaunt is " + truck.calculateSalePrice());

		Car sedan = new Sedan(3500.0, "Purple", 177.2);
		System.out.println("The new price of Sedan with discaunt is " + sedan.calculateSalePrice());

	}
}