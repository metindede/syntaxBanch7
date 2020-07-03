package com.syntax.class10;

public class Odometer {

	public static void main(String[] args) {
		// We bought a new car
		// It starts with 0000 mileage and it increases
		// It goes 0001, 0002, 0003 ... 9999
		// Please print every mileage
		// Hint: There are 4 inner loops

		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j <= 9; j++) {

				for (int k = 0; k <= 9; k++) {

					for (int m = 0; m <= 9; m++) {
						System.out.println(i + "" + j + k + m);
					}
				}
			}
		}

	}

}
