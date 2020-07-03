package com.syntax.class09;

public class Patterns {
	public static void main(String[] args) {
		// I want to print this pattern
//		*****
//		*****
//		*****
//		*****

		System.out.println("Silly way, Not nested loop");
		for (int i = 1; i <= 4; i++) {
			System.out.println("*****");
		}

		System.out.println("Another Silly way");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		System.out.println("---------------1st way-------------");
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("---------------2nd way-------------");
		for (int i = 4; i >= 1; i--) {

			for (int j = 101; j <= 105; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("---------------Task Pattern 10X10-------------");

		for (int row = 1; row <= 10; row++) {

			for (int col = 1; col <= 10; col++) {
				System.out.print("$");
			}
			
			System.out.println();
		}

	}

}
