package com.syntax.class25;

public class TestClass {
public static void main(String[] args) {
		
		SuperClass c=new Subclass();
		c.enjoy();//static method from parent class will get executed, enjoy from child class will be hidden
		
		SuperClass.enjoy();
		Subclass.enjoy();//cannot see parent static method only your own static method
	}
}