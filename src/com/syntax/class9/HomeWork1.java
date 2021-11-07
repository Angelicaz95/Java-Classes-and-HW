package com.syntax.class9;

public class HomeWork1 {

	public static void main(String[] args) {
		String[] cars = { "Audi", "Mercedes", "Tesla", "Toyota", "Hyundai", "Mazda" };

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");

		}

		System.out.println();

		for (String c : cars) {
			System.out.print(c + " ");
		}

	}

}
