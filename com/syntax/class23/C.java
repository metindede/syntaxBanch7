package com.syntax.class23;
import java.util.Scanner;
public class C {

	
		 public static void main(String[] args) {
//				Create a method that will accept 2 numbers as parameters and
				// return true if both numbers are even otherwise returned false
//						( Return false if one or both given numbers are not even)
		//
//						Examples:
//						bothEven(4,6) ==> true
//						bothEven(3,4) ==> false
//						bothEven(-1,1) ==> false
		//
//						Expected Output:
//						false
			  	Scanner scan=new Scanner(System.in);
			  	System.out.println("enter the first number");
			  	int a=scan.nextInt();
				
			  	System.out.println("Enter the second number");
			  	int b=scan.nextInt();
			  	System.out.println(bothEven(a,b));
		 }

			static boolean bothEven(int a, int b) {
				boolean check = false;
				if (a % 2 == 0 && b % 2 == 0) {
					check = true;
				}
				return check;
			}
		}
		
			    