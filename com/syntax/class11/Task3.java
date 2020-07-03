package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.

		String[] countries = { "Tajikistan", "Brazil", "Pakistan", "Gambia", "US" };

		// Elion way
		String[] capitalCities = { "Dushanbe", "Brasilia", "Islamabad", "Banjul", "Washington DC" };

		for (int i = 0; i < countries.length; i++) {
			System.out.println("The capital city of " + countries[i] + " is " + capitalCities[i]);
		}

		// HW: Try to solve this way with one enhanced for loop
		// Hint: You should not be able to do it

//		for (String country : countries) {
//
//			if (country.equals("Albania")) {
//				System.out.println("Tirana");
//			} else if (country.equals("Brazil")) {
//				System.out.println("Brasilia");
//			} else if (country.equals("US") || country.equals("USA")) {
//				System.out.println("Washington DC");
//			} else if (country.equals("Tajikistan")) {
//				System.out.println("Dushanbe");
//			} else if (country.equalsIgnoreCase("Gambia")) {
//				System.out.println("Banjul");
//			} else {
//				System.out.println("The country " + country + " is not in my list.");
//			}
//		}
//
//		System.out.println("---------2nd way------------");
//		for (int i = 0; i < countries.length; i++) {
//
//			switch (countries[i]) {
//			case "Tajikistan":
//				System.out.println("Dushanbe");
//				break;
//			case "US":
//			case "USA":
//				System.out.println("Washington DC");
//				break;
//			case "Brazil":
//				System.out.println("Brasilia");
//				break;
//			case "Albania":
//				System.out.println("Tirana");
//				break;
//			case "Gambia":
//				System.out.println("Banjul");
//				break;
//			default:
//				System.out.println("Not in my list");
//			}
//
//		}

	}

}
