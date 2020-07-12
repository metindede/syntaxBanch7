package com.syntax.class19_1;
//to import shortcut is cmd+shif+o for Mac
//ctrl+shif+o for Windows
import com.syntax.class19.Employee;

public class AccessingEmployeeMembers {

public static void main(String[] args) {

Employee emp=new Employee();
emp.lastName="Oliva";//accessing public variables within different package 
emp.name="Luis";//accessing public variables within different package

//emp.age --> protected not visible within different package
//emp.salary--> default not visible within different package
//emp.ssn--> private not visible within different package

emp.displayName();//public method

}
}