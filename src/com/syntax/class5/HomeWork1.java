package com.syntax.class5;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String season = null;

		System.out.println("Please enter your birth month");
		String month = input.next();
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Fall";
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			season = "Winter";
		}else {
			season="Invalid";
			
		}
		if (season != null) {

			System.out.println("You were born in " + season + " season.");

		}

	}
}
