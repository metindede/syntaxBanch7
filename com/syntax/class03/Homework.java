package com.syntax.class03;

public class Homework {
	// Write a Java program to add, subtract, multiply and divide 2 decimal values.
	// Your program should say. "The _______ of 2 numbers ___ and ___ is equal to
	// _____"

	public static void main(String[] args) {
		double num1 = 3.5, num2 = 4.2;

		double sum = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;

		System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);

		System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 + num2));

		System.out.println("The substaction of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);

		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + mult);

		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + num1 * num2);

		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + div);

		System.out.println("-------------------------------");

		// Write a program to find the square of the number 3.9.
		// You program should say "The square of the ____ is ____ "

		double number = 6.9;
		System.out.println("The square of the " + number + " is " + number * number);

		System.out.println("-------------------------------");

		// Write a program to print the area and perimeter of a rectangle
		// with width = 5 and height = 8. Your program should say.
		// "The perimeter of a rectangle with width ___ and height ____ is equal to
		// _____ and the area is __"
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 * (width + height);
//		int perimeter2 = 2 * width + 2 * height;

		System.out.println("The perimeter of a rectangle with width " + width 
				+ " and height " + height + " is equal to " + perimeter
				+ " and area is " + area);

	}
}
