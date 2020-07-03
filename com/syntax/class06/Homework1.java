package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// Albert Einstein said:
		// Spend 95% of the time to understand the problem
		// Spend 5% of the time solving the problem.

		// Write a program for user to enter his/her birth month.
		// Based on the month define the season.
		// Example: if user is born in June, July or August → season =”Summer”.
		// At the end of the program we should see output as “You were born in ______”.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your birth month:");
		String month = scan.next();

		String season = "Unknown";

		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		}

		System.out.println("You were born in " + season);
	}
}
