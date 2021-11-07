package com.syntax.class6;

public class SwitchCase2 {

	public static void main(String[] args) {
		char gender = 'f';
		String description;

		switch (gender) {
		case 'm':
			description = "Male";
			break;
		case 'f':
			description = "Female";
			break;
		default:
			description = "Unknown";

		}
		System.out.println(gender+" means "+description);
	}

}
