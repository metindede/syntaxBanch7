package com.syntax.class07;

public class ForLoop {
	public static void main(String[] args) {
		// print numbers from 1 to 5

		int a = 1;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}

		// When you know how many times it will execute, we should go with for loop
		for (int num = 1; num <= 5; num++) {
			System.out.println(num);
		}

	}
}
