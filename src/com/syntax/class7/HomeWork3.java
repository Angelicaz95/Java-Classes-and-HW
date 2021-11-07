package com.syntax.class7;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("What would you like to buy?");
		String item=input.next();
		System.out.println("What is the price?");
		double price=input.nextDouble();
		System.out.println("Please enter the amount you're paying");
		double payment=input.nextDouble();
		double change;
		
		do {
			
			if (payment>price) {
				System.out.println("Here is your change "+(payment-price));
				break;
			} else if (payment<price) {
				System.out.println("You still owe $"+(price-payment));
				System.out.println("Please enter the amount you're adding");
				change=input.nextDouble();
			}
			
			
		}while(payment!=price);
			
		System.out.println("Thank you for shopping!");
				
		
	}
	}

	
		
