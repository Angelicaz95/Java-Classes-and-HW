package com.syntax.class10;

public class Project3 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */

		int[][] numbers = { 
				{ 20, 56, 40, 120, 99, 33 }, 
				{ 10, 16, 42, 11, 185, 1 }, 
				};

		int sumEven = 0;
		int sumOdd = 0;

		for (int[] num : numbers) {
			for (int n : num) {
				if (n % 2 == 0) {
					sumEven += n;

				}
			}
		}
		System.out.println("The sum of all even numbers is " + sumEven);

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 != 0) {
					sumOdd += numbers[i][j];
				}
			}
		}
		System.out.println("The sum of all odd numbers is " + sumOdd);

	}

}
