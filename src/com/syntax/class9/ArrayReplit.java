package com.syntax.class9;

import java.util.Scanner;

public class ArrayReplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter how many elements you want to store inside array of cars");
		
		int size=scan.nextInt();
		
		String[] cars=new String[size];
		// storing elements inside the array of cars
		for(int i=0; i<cars.length;i++) {
			System.out.println("Please enter your cars");
			cars[i]=scan.next();
		} // retrieve all stored elements 
		
		
		for(String a:cars) {
			System.out.print(a+" ");
			
			
		}
		

	}

}
