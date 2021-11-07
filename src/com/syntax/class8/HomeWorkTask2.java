package com.syntax.class8;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Would you like to apply for a credit card?");
		String answer=input.next();
		while(!answer.equalsIgnoreCase("yes")) {
			System.out.println("Would you like to apply for a credit card?");
			answer=input.next();
		}
		System.out.println("You got it, thank you!");
		
	
	} 
	
	}
	


