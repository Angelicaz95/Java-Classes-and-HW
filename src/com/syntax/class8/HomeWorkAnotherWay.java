package com.syntax.class8;

import java.util.Scanner;

public class HomeWorkAnotherWay {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		boolean answer=false;
		while(answer!=true) {
			System.out.println("Would you like to apply for a credit card?");
			answer=input.nextBoolean();
			if(answer==true) {
				System.out.println("You got it!");
				continue;
			}
		}
			
		}
	}
		