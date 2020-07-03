package com.syntax.class11;

public class RetrieveElements {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };
		// getting all elements
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ",");
		}
		System.out.println();

		System.out.println("--- Print using advanced/enhanced loop, for each loop ---");
		for (char element : grades) {
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println("---------------------------------------");
		String[] fruits = { "Apple", "Orange", "Grapes", "Banana", "Cucumber" };

		// Task: Print all the fruits in two different way

		for (int i = 0; i < fruits.length; i++) {

			if (fruits[i].equals("Grapes")) {
				System.out.println(fruits[i] + " is my favorite fruit");
			} else {
				System.out.println(fruits[i]);
			}

		}

		System.out.println("---------");
		for (String f : fruits) {

			if (f.equals("Grapes")) {
				System.out.println(f + " is my favorite!!!");
			} else {
				System.out.println(f);
			}
		}

	}

}
