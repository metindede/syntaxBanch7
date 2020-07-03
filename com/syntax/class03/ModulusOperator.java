package com.syntax.class03;

public class ModulusOperator {

	public static void main(String[] args) {
		double d1 = 12.5;
		double d2 = 4.7;
		double doubleResult = d1 / d2;
		System.out.println("double result is " + doubleResult);

		float f1 = 12.5f;
		float f2 = 4.7F;
		float floatResult = f1 / f2;
		System.out.println("float result is " + floatResult);

		System.out.println("----------------------");

		double num1 = 14;
		double num2 = 4;

		System.out.println(num1);
		System.out.println(num2);

		double div = num1 / num2;
		System.out.println("If we divide doubles the result is " + div);

		System.out.println("----------------------");

		int i = 14;
		int j = 4;
		int result2 = i / j; // 3.5
//		double result3 = i / j;

		System.out.println("The division is " + result2);
//		System.out.println(result3);

		int mod = i % j;
		System.out.println("The remainder is " + mod);

		System.out.println("----------------------");

		i = 20;
		j = 4;

		mod = i % j;
		System.out.println(mod);

	}
	// 17 / 5 = 3
	// 3 * 5 = 15
	// 17 - 15 = 2 is the remainder
}
