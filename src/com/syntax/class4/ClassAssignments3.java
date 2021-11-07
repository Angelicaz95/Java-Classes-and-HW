package com.syntax.class4;

public class ClassAssignments3 {

	public static void main(String[] args) {
		int age=18;
		int weight=120;
		if(age>=18) {
			System.out.println("You are eligible to donate the blood");
			if(weight>110) {
				System.out.println("You are eligible");
				
			}else {
				System.out.println("We cannot accept this patient");
			}
		}else {
			System.out.println("You are not eligible to donate the blood");
		}

	}

}
