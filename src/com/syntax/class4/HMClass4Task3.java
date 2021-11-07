package com.syntax.class4;

import java.util.Scanner;

public class HMClass4Task3 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older, you will issue a driver license to them. Otherwise you will
		 * offer them to get a learner's permit.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to DMV! What is your age?");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("We can issue a driver license for you");
		} else {
			System.out.println("You can only get learner's permit");
		}

	}

}
