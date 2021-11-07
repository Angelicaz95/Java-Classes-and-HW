package com.syntax.class9;

public class HomeWork4 {

	public static void main(String[] args) {
		int[] numbers = { 5, 6, 2, 89, 567, 342 };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

		}

		System.out.println("The sum of all integers in the array is " + sum);

		for (int num : numbers) {
			sum1 += num;

		}
		System.out.println("The sum of all integers in the array is "+sum1);
	}

}
