package com.syntax.class5;

import java.util.Scanner;

public class LargestNumberEnhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first number");

		int num1 = input.nextInt();
		System.out.println("Please enter your second number");

		int num2 = input.nextInt();
		System.out.println("Please enter your third number");
		int num3 = input.nextInt();
		int largest = 0;

		if (num1 >= num2 && num1 > num3) {
			largest = num1;

		} else if (num2 > num1 && num2 >= num3) {
			largest = num2;

		} else if (num3 >= num1 && num3 > num2) {
			largest = num3;
			boolean isEven;
			if (largest % 2 == 0) {
				isEven = true;
			} else {
				isEven = false;

			}
			System.out.println(largest + " number is even");

		}

	}
}
