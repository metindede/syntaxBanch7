package com.syntax.class24;

public class Degree {
	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}
}

class Masters extends Degree {

	void getPrerequisite() {
		System.out.println("To get a degree you need Bachelor degree");
	}

}

class Bachelors extends Degree {

}