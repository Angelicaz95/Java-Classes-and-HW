package com.syntax.class12;

public class HW2 {
	String createEmail(String name, String lastName, String email) {
		String fullEmail=name.toLowerCase()+lastName.toLowerCase()+"@"+email;

		return fullEmail;

	}

	public static void main(String[] args) {
		HW2 object = new HW2();
		String x = object.createEmail("Tyrion", "Lannister", "gmail.com");
		System.out.println(x);

	}

}
