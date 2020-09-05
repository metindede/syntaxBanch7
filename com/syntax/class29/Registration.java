package com.syntax.class29;

/*
 * Create Registration Class in which you would have variables as email, userName and password 
 * that have an access scope only within its own class. 
 * After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password. 
Requirements: 
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length larger than 6 characters. 
Also valid password cannot contain userName.
 */

public class Registration {

	private String email, userName, password;

	static String mail = "yahoo";

	public void setEmail(String email) {
		if (email.contains(mail))// checking if it is contain "yahoo";
			this.email = email;
	}

	public String getEmail() {// get email
		return email;
	}

	public void setUserName(String userName) {// set username;
		if (!userName.isEmpty() && userName.length() > 6)
			this.userName = userName;
	}

	public String getUserName() {// get username;
		return userName;
	}

	public void setPassword(String password) {// set password
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println("Password should be larger than 6 characters");
			}
		} else {
			System.out.println("Password cannot be empty");
		}
	}

	public String getPassword() {// get password
		return password;
	}

}