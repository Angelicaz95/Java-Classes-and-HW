package com.syntax.class4;

import java.util.Scanner;

public class HMClass4Task2 {

	public static void main(String[] args) {
		// You're loan specialist and you need to ask user what is the amount of loan
		// needed.
		// If loan is less or equal to 200000 then you would lend the money
		// otherwise you would reject the client

		Scanner input = new Scanner(System.in);
		System.out.println("What is the amount of the loan needed?");
		double loan = input.nextDouble();

		if (loan <= 200000) {
			System.out.println("We would lend you the money");
		} else {
			System.out.println("We reject your loan");
		}

	}

}
