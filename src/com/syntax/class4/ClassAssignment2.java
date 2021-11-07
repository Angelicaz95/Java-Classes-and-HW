package com.syntax.class4;

public class ClassAssignment2 {

	public static void main(String[] args) {
		double morgageRate = 6;
		double morgagePrice = 155000;
		if (morgageRate > 4.5) {
			System.out.println("User will not buy a house");

		} else {
			System.out.println("User will consider buying a house");
			if (morgagePrice > 200000) {
				System.out.println("User will take a loan");
			} else {
				System.out.println("User will pay cash");
			}

		}

		System.out.println("+++++++++++++++++++++++++++++"); // come back to this!

		double morgageRate1 = 6;
		double morgagePrice1 = 155000;
		if (morgageRate < 4.5) {
			System.out.println("User will not buy a house");
			if (morgagePrice > 200000) {
				System.out.println("User will take a loan");
			} else {
				System.out.println("User will pay cash");
			}
		} else {
			System.out.println("User will consider buying a house");

		}

	}
}
