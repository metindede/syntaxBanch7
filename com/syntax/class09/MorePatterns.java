package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		// 12345
		// 12345
		// 12345
		// 12345

		// how many rows? 4
		for (int i = 1; i <= 4; i++) {
			// how many columns? 5

			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}

			System.out.println();

		}

		System.out.println("======================");
		// Task 5 minutes. Try to print this pattern
		// 11111
		// 22222
		// 33333
		// 44444

		for (int row = 1; row <= 4; row++) {

			for (int col = 11; col <= 15; col++) {
				System.out.print(row);
			}

			// move to the new line
			System.out.println();
		}

	}

}
