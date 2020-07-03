package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		/*
		 * name, lastName, grade, city, state, phoneNumber
		 * 
		 */

		String name = "Matthew";
		String lastName = "Sweeney";
		String grade = "A-";
		String city = "Winchester";
		String state = "VA";
		int phoneNumber1 = 1235678901;
		String phoneNumber2 = "(123) 567-8901";

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(city);
		System.out.println(state);
		System.out.println(grade);
		System.out.println(phoneNumber2);

		System.out.println("-------------------------");
		// b)
		// Change student’s city, state, phone number and grade. And print those updated
		// values.

		// Not possible
		// String city = "Garfield";

		// Not good, because you're not re-assigning
		// String city2 = "Garfield";

		city = "Garfield";
		state = "NJ";
		phoneNumber2 = "(551) 567-8901";
		grade = "A+";
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber2);
		System.out.println(grade);

		System.out.println("**************************");
		// Task:
		// 1. My name is __ and my last name is ____ .
		// 2. I live in city of ___ state ___ and my phone number is ___ !

		System.out.println("My name is " + name + " and my last name is " + lastName + '.');
		System.out.println("I live in city of " + city + " state " + state + " and my phone number is " + phoneNumber2 + "!");
	}

}
