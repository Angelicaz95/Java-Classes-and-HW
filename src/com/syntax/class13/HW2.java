package com.syntax.class13;

public class HW2 {
	// Create a String and if the String is not empty perform the following:
	// if the String has an odd number of characters and has 3 or more characters,
	// print the character in the middle of the String.

	public static void main(String[] args) {

		String a = "Angie";
		if (!a.isEmpty()) {
			if (!(a.length() % 2 == 0) && a.length() >= 3) {
				int i = 0;
				i = (a.length() / 2) ;

				System.out.println(a.charAt(i));

			}
		}else {
			System.out.println("String is empty");

	}
}
}