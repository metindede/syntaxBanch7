package com.syntax.class25;

public class FinalKeyword {
public static String str="Hello";
	
	public static final String USERNAME="Admin";//final variables MUST be initialized
	
	public final String PASSWORD="Admin123";

	public static void main(String[] args) {
		
		System.out.println(str);
		str="Hi";
		System.out.println(str);
		
		System.out.println(USERNAME);
		//username="User123";CE: variable is final and we cannot change it is value
		
		FinalKeyword fk=new FinalKeyword();
		//fk.PASSWORD="user123"; CE:variable is final
		System.out.println(fk.PASSWORD);
	}
	
	public final void hello() {
		System.out.println("Last hello of today");
	}	
}

//class FinalBaby extends FinalKeyword{ //FINAL CLASSES CANNOT BE EXTENDED
	
	//FINAL METHODS CANNOT BE OVERRIDDEN
//	public void hello() { CE
//		System.out.println("Sorry it not last helllo");
//	}
//}