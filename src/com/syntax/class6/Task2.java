package com.syntax.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade=input.next();
		String explanation;
		
		switch(grade.toUpperCase()) {
		case "A":
			explanation="Excellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			break;
			default:
				explanation="Not Acceptable";
				
		}
		if(!explanation.equals("Not Acceptable")) {
			System.out.println(grade+" grade means "+explanation);
		}else {
			System.out.println("You entered invalid info");
		}

	}

}
