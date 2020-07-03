package com.syntax.class16;

public class TaskMethods {

	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else {
			System.out.println(b + " is larger than " + a);
		}
	}

	/*
	 * Create a method that will take a number and prints whether the number is even
	 * or odd.
	 */
	void evenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("The number " + n + " is even");
		} else {
			System.out.println("The number " + n + " is odd");
		}
	}

	/*
	 * Create a method that will print whether given String is palindrome or not.
	 */

	void palindrome(String word) {
		String b = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			b += word.charAt(i);
		}

		if (b.equals(word)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " isn't palindrome");
		}
	}

	/*
	 * Create a method that will say Hello in different language based on the
	 * country that will passed when method is executed.
	 */
	void sayHello(String country) {

		country = country.toLowerCase();

		switch (country) {

		case "usa":
			System.out.println("Hello");
			break;

		case "turkey":
			System.out.println("Merhaba");
			break;

		case "egypt":
			System.out.println("Ehlen wa Sahlen");
			break;
			
		default:
			System.out.println("Hi");
		}
	}
}