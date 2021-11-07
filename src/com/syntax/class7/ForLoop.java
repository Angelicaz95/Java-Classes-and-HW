package com.syntax.class7;

public class ForLoop {

	public static void main(String[] args) {
		// say hi 5 times
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
		}

		System.out.println(" ---- print numbers from 1 to 20 --------");
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println("   from 100 to 20 ");
		for (int i = 100; i >= 20; i--) {
			System.out.println(i + " ");
		}

		System.out.println(" print only even numbers from 1 to 50");
		for (int a = 1; a <= 50; a++) {
			if (a % 2 == 0) {
				System.out.print(a + " ");

			}
		}
		
		
		System.out.println(" another way ");
		for( int b=2; b<=50; b+=2) {
			System.out.print(b+" ");
		}
	}
}
