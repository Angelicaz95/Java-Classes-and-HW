package com.syntax.class13;

public class ClassTasks {

	public static void main(String[] args) {

		String userName = "angie";
		String password = "12345678";
		String confirmedPassword = "123456789";

		if (!(userName.isEmpty() || password.isEmpty())) {

			if (password.length() >= 8) {
				
				if (!password.contains(userName)) {
					
					if (password.equals(confirmedPassword)) {
						
						System.out.println("Your username and password has been created");

					} else {
						System.out.println("Passwords do not match");
					}
				} else {
					System.out.println("Password cannot contain Username");
				}
			} else {
				System.out.println("Password is too short");
			}
		} else {
			System.out.println("Username and Password cannot be empty");

		}

	}

}
