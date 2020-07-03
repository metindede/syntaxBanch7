package com.syntax.class15;
public class Task {

	public static void main(String[] args) {
		
		//one of the IQ
		String str="ggiugiug 86868 69*()@@!!";
		
		str=str.replaceAll("[^A-Za-z]", "");

		System.out.println(str.length());
		
		String a ="1.Is it saturday 2.Is it raining 3.Do we have a Java Class today?";
		String[] array = a.split("[0-9]");
		
		int sentences = array.length;
		
		System.out.println("Total number of sentences is " + sentences);
		
	}

}
