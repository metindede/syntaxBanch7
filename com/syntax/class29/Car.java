package com.syntax.class29;


/*Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() 
 * which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. 
The Truck class has field as weight and has its own implementation of  calculateSalePrice() method 
in which returned price calculated as following: 
if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 * 
 */
public class Car {
	
	double carPrice;
	String carColor;

	Car(double carPrice, String carColor) {
		this.carPrice = carPrice;
		this.carColor = carColor;
	}

	double calculateSalePrice() {
		return carPrice;
	}
}

class Truck extends Car {// Truck
	
	double weight;

	Truck(double carPrice, String carColor, double weight) {
		super(carPrice, carColor);
		this.weight = weight;
	}

	double calculateSalePrice() {
		if (this.weight > 2000) {
			return carPrice - (carPrice * 0.1);
		} else {
			return carPrice - (carPrice * 0.2);
		}
	}
}

class Sedan extends Car {// Sedan
	
	double length;

	Sedan(double carPrice, String carColor, double length) {
		super(carPrice, carColor);
		this.length = length;
	}

	double calculateSalePrice() {
		if (this.length > 20) {
			return carPrice - (carPrice * 0.05);
		} else {
			return carPrice - (carPrice * 0.1);
		}
	}
}