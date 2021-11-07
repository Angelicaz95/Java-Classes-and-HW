package com.syntax.class6;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the country");
		String country = input.next();
		String food = null;
		switch (country) {
		case "Ukraine":
			food = "Varenyky";
			break;
		case "Italy":
			food = "Pizza";
			break;
		case "Mexico":
			food = "Tacos";
			break;
		case "USA":
			food = "Burgers";
			break;
		default:
			food = "Unknown";

		}
		if (!food.equals("Unknown")) {
			System.out.println("Your favorite food is " + food);
		}

	}
}