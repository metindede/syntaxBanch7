package com.syntax.class26;
public class VehicleTest {
	
	public static void main(String[] args) {

		//Vehicle v=new Vehicle();--> CE: cannot instantiate Abstract class
		
		Vehicle lambo=new Lamborgini("12346879767897087kjhvjhv");
		lambo.drive();
		lambo.start();
		lambo.stop();
		lambo.openTrunk();
		int total = Vehicle.getTotal();
		System.out.println(total);
		
		System.out.println(" ----   second object ----- ");
		Car car=new Lamborgini("hbghg876867kjhvjhv");
		car.drive();
		car.start();
		car.stop();
		car.openTrunk();
		
		total=Car.getTotal();
		System.out.println(total);
	}
}