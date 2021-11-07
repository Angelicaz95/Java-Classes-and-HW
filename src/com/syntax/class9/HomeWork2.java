package com.syntax.class9;

public class HomeWork2 {

	public static void main(String[] args) {
		String[] animals = { "Dog", "Cat", "Whale", "Lion", "Dolphin", "Horse" };
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		for (String a : animals) {
			System.out.print(a + " ");
		}
	}

}
