package com.syntax.class14;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Mom's first name?");
	String moms = scan.nextLine();
	System.out.println("Dad's first name?");
	String dads = scan.nextLine();
	System.out.println("Boy or Girl?");
	String gender= scan.nextLine();
	int nName=moms.length();
	int dName=dads.length();
	if (gender.equalsIgnoreCase("boy")) {
		for (int i=0; i<=(dName-1)/2; i++) {
		String letter =String.valueOf(dads.charAt(i));
		System.out.println(letter.toUpperCase());
		}
		for (int i=nName/2;i<nName; i++) { 
			String letter =String.valueOf(moms.charAt(i));
			System.out.print(letter.toUpperCase());
		}
	}else if (gender.equalsIgnoreCase("girl")) {
		for (int i=0;i<=(nName-1)/2; i++) {
			String letter =String.valueOf(moms.charAt(i));
			System.out.print(letter.toUpperCase());
		}
		for (int i=dName/2; i<dName; i++) {
			String letter=String.valueOf(dads.charAt(i));
			System.out.print(letter.toUpperCase());
		}
		} else {
			System.out.print("Please try again");
		}
	}
}
