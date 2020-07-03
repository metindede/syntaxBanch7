package com.syntax.class08;

public class Task1 {
	// Print numbers from 1 to 50 except those that are divisible by 3
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) { // divisible by 3
				continue;
			}

			System.out.println(i);
		}

	}

}
