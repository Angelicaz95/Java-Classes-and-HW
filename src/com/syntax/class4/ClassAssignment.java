package com.syntax.class4;

public class ClassAssignment {

	public static void main(String[] args) {
		boolean hasDiploma = true;
		double gpaScore = 3.5;

		if (hasDiploma) {
			System.out.println("Congratulations!");
			if (gpaScore >= 3.5) {
				System.out.println("You are eligible for scholarship!");
			} else {
				System.out.println("You should have studied harder!");
			}
		} else {
			System.out.println("Get a degree!");
		}

	}

}
