package com.syntax.class23;

public class TestingSuper {
public static void main(String[] args) {
		
		SubClass obj=new SubClass();
		obj.displayName();
		obj.callingParentMethod();

		System.out.println("-- Object of the parent class -------");
		SuperClass obj1=new SuperClass();
		obj1.printHello();
		System.out.println(obj1.name);
	}
}
