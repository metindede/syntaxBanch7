package com.syntax.class23;

class Country {
	
	String name;

	Country(String name){
		this.name=name;
	}
}

public class Italy extends Country {

	String food;
	
	Italy(String name,String food) {
		super(name); 
		this.food=food;
	}

	public static void main (String[] args){

		Italy obj=new Italy("Italy","Pasta");
	}
}
