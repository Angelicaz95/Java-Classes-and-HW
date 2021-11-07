package com.syntax.class10;

public class TwoDArraysDemo {

	public static void main(String[] args) {
		// 2D array of groceries
		String[][] groceries = { { "banana", "apple", "mango" }, { "potato", "tomato" },
				{ "milk", "cheese", "yogurt" } };

		System.out.println(groceries.length);
		System.out.println(groceries[2][2]); // printing yogurt
		// i want to find how many elements my first array has

		System.out.println("# of elements in the first array " + groceries[0].length);
		System.out.println("# of elements in the first array " + groceries[1].length);
		System.out.println("# of elements in the first array " + groceries[2].length);

		// how do we get all elements from 2D array??
		// outer loop - rows
		// inner loop - columns
		int total=0;
		for (int i = 0; i < groceries.length; i++) {
			for (int j = 0; j < groceries[i].length; j++) {
				System.out.print(groceries[i][j] + " ");
				total++;
			}
			System.out.println();
		}
		
		System.out.println();

	}

}
