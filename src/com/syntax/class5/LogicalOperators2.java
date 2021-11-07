package com.syntax.class5;

import java.util.Scanner;

public class LogicalOperators2 {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any number");
		int num = input.nextInt();
		if (num < 1) {
			System.out.println("Number is 0 or negative");
		} else if (num >= 1 && num <= 10) {
			System.out.println(num + " is small");
		} else if (num >= 11 && num <= 100) {
			System.out.println(num + " is medium");
		} else if (num >= 101 && num <= 1000) {
			System.out.println(num + " is large");
		} else if (num >= 1001) {
			System.out.println(num + " is xLarge");

		}
	}

}
