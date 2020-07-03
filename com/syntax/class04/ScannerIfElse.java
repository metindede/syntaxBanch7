package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {

	public static void main(String[] args) {
		// Mac: command + shift + o
		// Windows: ctrl + shift + o
		Scanner scanner = new Scanner(System.in);

		// Ask the user to enter two numbers
		// Compare the number and print which one is larger

		System.out.println("Please enter a number!");
		int num1 = scanner.nextInt();

		System.out.println("Please enter another number!");
		int num2 = scanner.nextInt();

		System.out.println("--------------------------------");
		System.out.println("Number are " + num1 + " and " + num2);
		System.out.println("--------------------------------");

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
	}

}
