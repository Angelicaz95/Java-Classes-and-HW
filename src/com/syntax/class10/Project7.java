package com.syntax.class10;

public class Project7 {

	public static void main(String[] args) {
		// prime number
		// all negative numbers are not prime
		// number 0 and 1 are not prime numbers 
		// if a positive number is not divisible by any other number than it is prime 
		int number = 15;
		boolean isPrime = true;
		if (number > 1) {
			for (int i = 2; i < number; i++) { // starting with 2, because every number is divisible by 1
				if (number % 2 == 0) {
					isPrime = false;

					break;

				}
			}

		} else {
			isPrime = false;

		}
		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}

	}

}
