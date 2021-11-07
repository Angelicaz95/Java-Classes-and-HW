package com.syntax.class7;

import java.util.Scanner;

public class GuessNumberWithWhileLoop {
	public static void main(String[] args) {

		int secretNumber = 78;
		Scanner input = new Scanner(System.in);
		int userNumber;
		System.out.println("Please guess my secret number");
		userNumber=input.nextInt();
		
		while (userNumber!=secretNumber) {
			System.out.println("Please enter my secret number");
			userNumber=input.nextInt();
		}
		System.out.println("You got it!!!!");
	}

}
