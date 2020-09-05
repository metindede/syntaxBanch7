package com.syntax.class26;
public abstract class Vehicle {

	public String vin;
	public static int totalVehicles;
	
	public Vehicle(String vin) {
		this.vin=vin;
		totalVehicles++;
	}
	
	public static int getTotal() {
		return totalVehicles;
	}
	
	public void drive() {
		System.out.println("All vehicle drives");
	}
	public void stop() {
		System.out.println("All vehicles stop by pressing break");
	}
	
	public abstract void start();
	
	public abstract void openTrunk();
	
	//can we make abstract method as static? NO
	
	//can we make abstract class as final?NO
	
	// can we make abstract class as private? NO
	
}
abstract class Car extends Vehicle  {
	public Car(String vin) {
		super(vin);
	}
	
	public void openTrunk() {
		System.out.println("All cars can open trunk automatically");
	}
}
class Lamborgini extends Car {
	public Lamborgini(String vin) {
		super(vin);
	}
	
	public void start() {
		System.out.println("Lamborgini starts magically");
	}
}