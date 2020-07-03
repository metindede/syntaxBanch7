package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// Capture the name from the user and print
		// Your name is ____

		// Ask the user to enter the age as double and print
		// Your name is ____ and age is ____

		// 1. We bring the Scanner Class to our program
		// System.in--> read from keyboard/console
		Scanner input = new Scanner(System.in);

		// We are instructing the user what to enter
		System.out.println("Please enter your full name!");
		// We are capturing the whole line into a text variable
		String name = input.nextLine();
		System.out.println("Your name is " + name);

		// We are instructing the user what to enter
		System.out.println("Please enter your age as double!");
		// We are capturing the text as a double
		// If it is not a double, then an error/exception will be printed
		double albanianAge = input.nextDouble();
		System.out.println("Your name is " + name + " and age is " + albanianAge);

	}
}
