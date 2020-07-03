package com.syntax.class06;

import java.util.Scanner;

public class Homework1WithSwitch {

	public static void main(String[] args) {
		// Write a program for user to enter his/her birth month.
		// Based on the month define the season.
		// Example: if user is born in June, July or August → season =”Summer”.
		// At the end of the program we should see output as “You were born in ______”.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your birth month:");
		String month = scan.next();

		String season;

		switch (month.toLowerCase()) { // .toLowerCase() converts DECember -> december
		case "december":
		case "january":
		case "february":
			season = "Winter";
			break;
		case "march":
		case "april":
		case "may":
			season = "Spring";
			break;
		case "june":
		case "july":
		case "august":
			season = "Summer";
			break;
		case "september":
		case "october":
		case "november":
			season = "Fall";
			break;
		default:
			season = "Unknown";
		}

		System.out.println("You were born in " + season);
	}

}
