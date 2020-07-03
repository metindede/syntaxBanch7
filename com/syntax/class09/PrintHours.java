package com.syntax.class09;

public class PrintHours {
	public static void main(String[] args) {
		// Let us print the clock
		// 00:00
		// 00:01
		// ...
		// 01:00
		// 01:01
		// ...
		// 23:58
		// 23:59
		// Hour goes from 00 to 23
		// Minute goes from 00 to 59

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {
				
				if (m < 10) {
					System.out.println(h + ":0" + m);
				} else {
					System.out.println(h + ":" + m);
				}
				
			}

		}

		// Ihsan should add seconds as Homework
	}
}
