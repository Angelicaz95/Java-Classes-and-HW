package com.syntax.class5;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter current time");

		int time = input.nextInt();

		if (time >= 1 && time <= 11) {
			System.out.println("Morning");
		} else if (time >= 12 && time <= 15) {
			System.out.println("Afternoon");
		} else if (time >= 16 && time <= 20) {
			System.out.println("Evening");
		} else if (time >= 21 && time <= 24) {
			System.out.println("Night");
		} else {
			System.out.println("Time entered is invalid");
		}
		System.out.println("------------------------------");

		String timeOfDay=null;
		if (time >= 1 && time <= 11) {
			timeOfDay = "Morning";
		} else if (time >= 12 && time <= 15) {
			timeOfDay = "Afternoon";
		} else if (time >= 16 && time <= 20) {
			timeOfDay = "Evening";
		} else if (time >= 21 && time <= 24) {
			timeOfDay = "Night";
	
		}
		System.out.println("Right now is " + timeOfDay);
	}

}
