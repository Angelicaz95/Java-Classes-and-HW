package com.syntax.class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		String answer=input.next();
		if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("yep") || answer.equalsIgnoreCase("yeah")) {
		System.out.println("Please tell me the balance");
		

	}

}
}
