package com.syntax.class07;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int time = 10;

		System.out.println("--------While Loop--------");

		while (time <= 12) {
			// This code will execute infinitely
			// But then we fixed it by adding time++

			System.out.println("Good Morning!");
			time++;
		}

//		while (time > 12) {
//			// This block of code will not execute
//			System.out.println("Good Morning!");
//			time++;
//		}

		System.out.println("--------if isRain--------");

		boolean isRain = true;

		if (isRain) {
			System.out.println("Take your umbrella"); // 1 time
		}

//		while (isRain) {
//			System.out.println("Take your umbrella"); // infinitely
//		}

		System.out.println("--------while isRain--------");

		while (isRain) {
			System.out.println("Take your umbrella");
			// isRain++; //compile error
			isRain = false;
		}

		System.out.println("---------------------------");
		System.out.println("how to print numbers from 1 to 50?");
		int x = 1;
		while (x <= 50) {
			System.out.println(x);
			x++;
		}

		System.out.println("---------------------------");
		System.out.println("how to print numbers from 20 to 30?");
		int y = 20;
		while (y <= 30) {
			System.out.println(y);
			y++;
		}

		System.out.println("---------------------------");
		System.out.println("how to print numbers from 5 to 15 at the same line?");
		int z = 5;
		while (z <= 15) {
			System.out.print(z + " ");
			z++;
		}

		System.out.println();
		System.out.println("---------------------------");
		System.out.println("how to print numbers from 10 to 1?");
		int k = 10;
		while (k >= 1) {
			System.out.println(k);
			k--;
		}
	}
}
