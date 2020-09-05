package com.syntax.class22_1;

import com.syntax.class21.Cat;
import com.syntax.class22.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Employee.companyName="Google";
		
		//new ScrumTeam();no available because it is deafult
		//new Cat();
		
		WaterFallTeam wt=new WaterFallTeam();
		WaterFallTeam.companyName="Amazon";
	}
}