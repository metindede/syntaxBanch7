package com.syntax.class08;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// We are playing a lottery game and the lucky number is 17;
		// We want to keep asking the user to enter any numbers from 1-20
		// until he guesses the lucky number
		// --> In that case we print "Congrats, you won!"

		Scanner scan = new Scanner(System.in);
		int lucky = 17;
		int num;

		// if I use while loop, I have to ask two times
//		System.out.println("Please enter a number 1-20:");
//		num = scan.nextInt();
//
//		while (num != lucky) {
//			System.out.println("Please enter a number 1-20:");
//			num = scan.nextInt();
//		}

		// if I use do while loop, I have to ask only one time
		do {
			System.out.println("Please enter a number 1-20:");
			num = scan.nextInt();
		} while (num != lucky);

		System.out.println("Congrats, you won!");

	}

}
