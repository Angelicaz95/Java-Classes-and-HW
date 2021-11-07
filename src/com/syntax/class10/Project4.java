package com.syntax.class10;

import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) {
		// Create an array on double values using scanner and calculate the sum of all stored elements in that array.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number of elements you want to store in your array");
		int size=input.nextInt();
		double sum=0.0;
		
		double[] numbers=new double[size];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Please enter the number to store in the array");
			numbers[i]=input.nextDouble();
			sum+=numbers[i];
			
		}
		System.out.println("The sum of all stored elements in the array is "+sum);
		
		

	}

}
