package com.syntax.class7;

public class EvenNumbers {

	public static void main(String[] args) {
		// print even numbers from 20 to 1
		for (int a = 20; a >= 1; a -= 2) {
			System.out.print(a + " ");
		}
		System.out.println("Another way ");
		for( int a=20; a>=1; a--) {
			if(a%2==0) {
				System.out.print(a+" ");
			}
		}
	}

}
