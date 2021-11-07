package com.syntax.class10;

public class HomeWork4 {

	public static void main(String[] args) {
		String[][] groceries = { 
				{ "potatoes", "carrots", "kale", "cucumbers" },
				{ "bananas", "orange", "kiwi", "peach" }, 
				{ "yogurt", "milk", "creamer" },
				{ "cookies", "chocolate", "muffins", "cake" }, };

		for (int i = 0; i < groceries.length; i++) {
			for (int j = 0; j < groceries[i].length; j++) {
				System.out.print(groceries[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------");

		for (String[] groceryList : groceries) {
			for (String g : groceryList) {
				System.out.print(g + " ");
			}
			System.out.println();
		}
		
	}

}
