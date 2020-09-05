package com.syntax.class25;

public class StudentTest {
public static void main(String[] args) {
		
		SyntaxStudent syntax = new SyntaxStudent();
		syntax.study();
		syntax.sleepy();
		syntax.inLoveWithJava();
		
		System.out.println("--- Creating an object of College student -----");
		CollegeStudent col = new CollegeStudent();
		col.read();
		col.study();
		col.sleepy();
		
		System.out.println("--- Creating an object of student -----");
		Student stu=new Student();
		stu.study();
		stu.sleepy();
		
		System.out.println("--- Creating an object of college student but give reference to Student class  -----");
		Student obj=new CollegeStudent();
		obj.study();
		obj.sleepy();
		
		System.out.println("--- Creating an object of syntax student but give reference to Student class  -----");
	
		Student ss=new SyntaxStudent();
		ss.study();//runtime polymorphism
		ss.sleepy();//runtime polymorphism
		
		System.out.println("--- Creating an object of school student but give reference to Human class  -----");
		Human obj1=new SchoolStudent();
		obj1.happy();
		obj1.study();//runtime polymorphism
		
	}
}