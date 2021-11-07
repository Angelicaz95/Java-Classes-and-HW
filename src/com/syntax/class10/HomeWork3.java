package com.syntax.class10;

public class HomeWork3 {

	public static void main(String[] args) { 
		String[][] cars = { { "Tesla", "Jeep", "Dodge", "Ford" },
				{ "Mercedes", "Volkswagen", "Audi", "BMW" },
				{ "Kia", "Hyundai", "Renault" },
				{ "Fiat", "Ferrari", "Lamborghini" }, };
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");

			}
			System.out.println();
			
		}
		System.out.println("-------------------");
		for (String[] car : cars) {
			for (String c : car) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}
}