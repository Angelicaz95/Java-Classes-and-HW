package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true; // outer if must be true for the nested if to be executed
		int dose=2;
		
		if(vaccine) { // outer if
			System.out.println("How many doses have you taken?");
			if(dose==1) { // nested if 
				System.out.println("When are you taking your second dose?");
			}else {
				System.out.println("You are fully vaccined");
			}
		}
		System.out.println("-----------------");
		
		String day="Monday";
		int date=13;
		int time=12;
		
		if(day.equals("Friday")) {
			System.out.println("I am going to the movies today");
			if(date==13) {
				System.out.println("I am watching a scary movie!");
			}else {
				System.out.println("I am watching a comedy");
			}
		}else {
			System.out.println("I am going to study");
			if(time>11) {
				System.out.println("I have to go to bed early");
			}
			
		}
		
		
	
		
		
		

	}

}
