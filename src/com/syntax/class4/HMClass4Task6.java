package com.syntax.class4;

import java.util.Scanner;

public class HMClass4Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many years have you worked in the company?");
		double years = input.nextDouble();
		System.out.println("What is your annual salary?");
		double salary = input.nextDouble();
		if (years >= 5) {
			System.out.println("You are eligible for the bonus");
			if (salary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("You are not eligible for a bonus");
		}

	}

}
