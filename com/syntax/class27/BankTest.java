package com.syntax.class27;

public class BankTest {

	public static void main(String[] args) {

		System.out.println(" ------  Object of trustable type ------ ");
		Trustable tr = new BOA();
		tr.trust();
		
		System.out.println(" ------  Object of Bank type ------ ");
		Bank b=new BOA();
		b.trust();
		b.deposit();
		b.withdraw();
		
		System.out.println(" ------  Object of Investments type ------ ");
		Investments i=new BOA();
		i.doInvestments();
		
		System.out.println(" ------  Object of BOA type ------ ");
		BOA boa=new BOA();
		boa.trust();
		boa.deposit();
		boa.withdraw();
		boa.doInvestments();
		boa.givesLoan();
	}
}