package com.syntax.class6;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		double a = input.nextDouble();
		System.out.println("Please enter second number");
		double b = input.nextDouble();
		System.out.println("Please enter the operator");
		String operator = input.next();
		Double calculations = 0.0;

		if (operator.equals("+")) {
			calculations = a + b;
		} else if (operator.equals("-")) {
			calculations = a - b;
		} else if (operator.equals("*")) {
			calculations = a * b;
		} else if (operator.equals("/")) {
			calculations = a / b;
		} else {
			System.out.println("Invalid operator");
		}
		if (operator.equals("-") || operator.equals("+") || operator.equals("*") || operator.equals("/")) {
			System.out.println(calculations + " is the result of the calculation of the numbers you have entered");
		} else {
			System.out.println("You have entered invalid information");
		}

	}

}
