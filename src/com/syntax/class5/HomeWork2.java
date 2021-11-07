package com.syntax.class5;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String grade=null;
		
		System.out.println("Please enter your quiz score");
		double quiz=input.nextInt();
		System.out.println("Please enter your mid term score");
		double midTerm=input.nextInt();
		System.out.println("Please enter your final score");
		double finalScore=input.nextInt();
		if((quiz+midTerm+finalScore)/3>=90) {
			grade="A";
		}else if((quiz+midTerm+finalScore)/3>=70 && (quiz+midTerm+finalScore)/3<90) {
			grade="B";
		}else if((quiz+midTerm+finalScore)/3>=50 && (quiz+midTerm+finalScore)/3<70) {
			grade="C";
		}else if((quiz+midTerm+finalScore)/3<50) {
			grade="F";
			
		} System.out.println("Your grade is "+grade);
		

	}

}
