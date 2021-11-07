package com.syntax.class10;

public class Project8 {

	public static void main(String[] args) {
		// Fibonacci series
		// 0 1 1 2 3 5 8 13 21 34
		int previousNumber = 0;
		int currentNumber = 1;
		int sum = 0;
		int numbersToPrint = 10;
		System.out.println(previousNumber);
		System.out.println(currentNumber);
		for (int i = 0; i < numbersToPrint - 2; i++) {
			sum = currentNumber + previousNumber;
			System.out.println(sum + " ");
			previousNumber=currentNumber;
			currentNumber=sum;

		}

	}

}
