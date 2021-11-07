package com.syntax.class8;

import java.util.Scanner;

public class HomeWorkTask3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int evenSum=0;
		int oddSum=0;
		System.out.println("Please enter the first number of the range");
		int number1=input.nextInt();
		System.out.println("Please enter second number of the range");
		int number2=input.nextInt();
		
		
		while( number1<=number2) {
			
			if(number1%2==0) {
				evenSum+=number1;
			}else if(number1%2!=0) {
				oddSum+=number1;
			
			} number1++;
		
		}
		
		System.out.println("The sum of even numbers from the range you've entered is "+evenSum);
		System.out.println("The sum of odd numbers from the range you've enetered is "+oddSum);

	}

}
