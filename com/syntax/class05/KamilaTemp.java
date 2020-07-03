package com.syntax.class05;

import java.util.Scanner;

public class KamilaTemp {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature.
		// Your program should convert Fahrenheit into celsius and
		// print “The temperature is the city __ is __”

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your city!");
		String city = scan.next();

		System.out.println("Please enter the temperature in Fahrenheit!");
		int tempF = scan.nextInt();

		int tempC = (tempF - 32) * 5 / 9;
		System.out.println("The temperature in Celcius of the city " + city + " is " + tempC);

		// casting
		// int * double = double
		int tempC2 = (int) ((tempF - 32) * (5.0 / 9.0));
		System.out.println("The temperature in Celcius of the city " + city + " is " + tempC2);
	}

}
