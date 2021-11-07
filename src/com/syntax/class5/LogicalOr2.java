package com.syntax.class5;

import java.util.Scanner;

public class LogicalOr2 {

	public static void main(String[] args) {
		//  ask user to enter today's class; mon or fri - no class 
		// tue or wed - manual class 
		// sat&sun - java class 
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What day is it today?");
		String day=input.next();
		if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")) {
			System.out.println("You have no class today");
			
		} else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
			System.out.println("You have Manual Testing class today");
			
		} else if( day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			System.out.println("You have Java class today");
		} else if (day.equalsIgnoreCase("Thursday")){
			System.out.println("Time for a review class");
		} else {
			System.out.println("Invalid input");
		}
		
		

	}

}
