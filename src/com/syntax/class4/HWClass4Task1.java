package com.syntax.class4;

import java.util.Scanner;

public class HWClass4Task1 {

	public static void main(String[] args) {
		/*
		 * Create a Java program to capture 2 numbers from a user and define which
		 * number is largest
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int number1 = input.nextInt();
		System.out.println("Please enter your second number");
		int number2 = input.nextInt();
		if (number1 > number2) {
			System.out.println("First number is bigger than second number");
		} else if (number1 < number2) {
			System.out.println("Second number is bigger than first number");

		} else {
			System.out.println("The numbers you have entered are equal");
		}
	}

}
