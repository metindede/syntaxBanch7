package com.syntax.class18;

public class Hause {
public static void main(String[] args) {
		
		Cat cat1=new Cat();//cat1 --> local variable
		cat1.name="Jessy";
		cat1.age=8;
		cat1.color="grey";//accessing instance variable and assigning value
		//to access static variables we  use name of the class where they were declared
		System.out.println("Number of paws="+Cat.paws);
		
		String color="Yellow";//declaring local variable
		
		Cat cat2=new Cat();
		cat2.name="Lucy";
		cat2.age=1;
		cat2.color="white";
		cat2.name="Bonchuk";
		cat2.mustache=false;//possible way but not the right way
		Cat.tail=false;
		
//		System.out.println("Name of 1st cat="+cat1.name);
//		System.out.println("Age of cat "+cat1.age);
//		System.out.println("Name of 2nd cat="+cat2.name);
		System.out.println("----  Printing values of 1 cat -----");
		cat1.displayCat();
		cat1.displayCommonFeatures();
		
		System.out.println("---- Printing values of 2 cat -----");
		cat2.displayCat();
		cat2.displayCommonFeatures();
		
		Cat cat3=new Cat();
		cat3.name="Kathy";
		cat3.age=4;
		cat3.color="black";
		
		System.out.println("-----  Printing values of 3 cat -----");
		cat3.displayCat();
		cat3.displayCommonFeatures();
		
	}

}
