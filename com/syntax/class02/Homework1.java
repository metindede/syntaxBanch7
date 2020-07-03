package com.syntax.class02;

public class Homework1 {

	// Create a Java Program (class) and name it PracticeVariables.
	// create variables for all
	// 8 primitive Data Types (byte, short, int, long, float, double, char,
	// boolean).
	// i want you to print out each variable
	// on a separate line and test its number range (capacity).

	public static void main(String[] args) {

		// To format your code
		// windows: ctrl + shift + f
		// mac: cmd + shift + f

		byte maria = 104; // -128 to +127
		short malika = 10; // -32,768 to 32,767

		// variable declaration
		int ummarZahid; // -2,147,483,648 to 2,147,483,647
		// assign a value to the variable
		ummarZahid = 3;
		// re-assign another value to the variable
		ummarZahid = 57;

		// variable declaration and assign in one step
		int ummarZahid2 = 2359;

		long tatiana = 223468526776L;

		double raman = 3.4;
		float olga = 7.9863f;

		char bulat = '$';
		char kamila1 = 'm';
		char kamila2 = 'M'; // value in kamila1 is not the same with value in kamila2
		char metin = ' '; // I am storing space

		boolean ksenia = true;

		System.out.println(maria);

		// sout + ctrl + space
		// syso + ctrl + space
		// sysout + ctrl + space
		System.out.println(malika);
		System.out.println(ummarZahid);
		System.out.println(tatiana);
		System.out.println(raman);
		System.out.println(olga);
		System.out.println(bulat);
		System.out.println(metin);
		System.out.println(ksenia);
		System.out.println(kamila2);

		// When we debug the code, we have to put breakpoints
		// You put a breakpoint by double-clicking.

		int murod123zhon = 2938;
		System.out.println(murod123zhon);
		murod123zhon = 45;
		System.out.println(murod123zhon);

		// declaring multiple variable in one line
		// they should be of the same data type (int).
		int murod1 = 3, murod2 = 70, murod3;
	}
}
