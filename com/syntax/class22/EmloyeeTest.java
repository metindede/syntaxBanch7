package com.syntax.class22;

public class EmloyeeTest {
public static void main(String[] args) {
		
		ScrumTeam obj1 = new ScrumTeam();
		ScrumTeam.companyName="Facebook";
		obj1.fullName="John Doe";
		obj1.salary = 70000;
		//obj1.ssn- not visible
		obj1.getPaid();
		obj1.work();
		
		obj1.attendMeetings();
		obj1.ceremonies = "Scrum meetings";
		obj1.workBuildingSoft();
		
		ProductOwner obj2 = new ProductOwner();
		//ProductOwner.companyName grandchild have an access TOO
		obj2.salary = 100000;
		obj2.getPaid();
		obj2.work();
		
		obj2.ceremonies = "Scrum meetings";
		obj2.attendMeetings();
		obj2.workBuildingSoft();
		
		obj2.communicate();
	}
}