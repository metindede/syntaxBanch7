package com.syntax.class07;

public class WhileVsDoWhile {
	public static void main(String[] args) {
		// print hello 3 times

		int x = 11;
		while (x <= 3) { // checks before going into the loop
			System.out.println("Hello");
			x++;
		

		System.out.println("-------Using a Do While loop--------");

		int y = 11;
		do {
			System.out.println("Hello");
			y++;
		} while (y <= 3); // checks after going into the loop

		// while checks if soup is hot, before eating
		// do while check if soup is hot, after eating
		// with do while loop you will get burn!!!
	}
	}
}


