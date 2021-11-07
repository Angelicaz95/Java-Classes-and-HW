package com.syntax.class10;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2d array is array of arrays
		String[][] groceries = {
				{ "banana", "apple", "mango" }, //0
				{ "potato", "tomato" },//1
				{ "milk", "cheese", "yogurt" }//2
				};
		for(String[]grocery:groceries) {
			for(String g:grocery) {
				System.out.println(g);
				
			}
		}

	}

}
