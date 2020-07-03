package com.syntax.class05;

public class LogicalNot {
	public static void main(String[] args) {
//		boolean b1 = !true;
//		System.out.println(b1);// --> false
//
//		boolean b2 = !false;
//		System.out.println(b2);// --> true
//
//		boolean cold = true;
//
//		if (!cold) {
//			System.out.println(1);
//		} else {
//			System.out.println(2);
//		}

		System.out.println("--------------------");
		// If it is not Monday or Friday we have a class
		int day = 1;

		// 1st way
		if (day != 1 && day != 5) {
			System.out.println("We have a class");
		} else {
			System.out.println("We are sleeping");
		}

		// 2nd way, similar to 1st, !(day == 1) is the same as day != 1
		if (!(day == 1) && !(day == 5)) {
			System.out.println("We have a class");
		} else {
			System.out.println("We are sleeping");
		}

		// 3rd way, easiest
		if (!(day == 1 || day == 5)) {
			System.out.println("We have a class");
		} else {
			System.out.println("We are sleeping");
		}

		System.out.println("---------Raining-----------");
		boolean isRaining = false;

		if (!isRaining) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}

	}
}
