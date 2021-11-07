package com.syntax.class4;

import java.util.Scanner;

public class HMClass4Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		String answer = input.next();
		

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the card?");
			double balance = input.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off your balance immidiately");
			} else {
				System.out.println("You can spend more");
			}
		} else {
			System.out.println("We can offer you a credit card!");
		}

	}

}