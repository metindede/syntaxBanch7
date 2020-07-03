package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not.
		// If the user does not have a credit card then offer them.
		// If they do have one ask what is balance on the card?
		// If balance of the card is larger than 1000, tell them to pay off immediately,
		// otherwise you can tell them that they can spend more.

		Scanner scan = new Scanner(System.in);
		boolean cc;

		System.out.println("Do you have a Credit Card? (true or false)");
		cc = scan.nextBoolean();

		if (cc) {

			System.out.println("What is your Credit Card balance?");
			double balance = scan.nextDouble();

			if (balance > 1000) {
				System.out.println("Please pay off immediately!");
			} else {
				System.out.println("You can spend more.");
			}

		} else {
			System.out.println("Let me offer you our best Credit Card!");
		}

	}

}
