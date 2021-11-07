package com.syntax.class8;

public class HomeWork1 {

	public static void main(String[] args) {
		int eSum = 0;
		int oSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				eSum += i;
			} else {
				oSum += i;
			}
		}
		System.out.println("Sum of even numbers is " + eSum);
		System.out.println("Sum of odd numbers is " + oSum);
	}

}
