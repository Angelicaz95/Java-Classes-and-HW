package com.syntax.class7;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		// lets create a secret number from 1 to 100
		// lets ask user to guess my secret number
		// keep asking till he guesses
		int secretNumber = 78;
		Scanner input = new Scanner(System.in);
		int userNumber;

		do {
			System.out.println("Please guess my secret number from 1 to 100");
			userNumber = input.nextInt();
		} while (userNumber != secretNumber);
		System.out.println("You got it!!!");

	}

}
