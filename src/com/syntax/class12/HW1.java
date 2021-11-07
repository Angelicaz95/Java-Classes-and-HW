package com.syntax.class12;

public class HW1 {

	int method1(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

	void method2(int c) {
		if (c % 2 == 0) {
			System.out.println(c + " is an even number");

		} else {
			System.out.println(c + " is an odd number");
		}

	}

	void method3(String country) {
		String greetings = null;
		switch (country.toLowerCase()) {
		case "usa":
			greetings = "Hello";
			break;
		case "uk":
			greetings = "Cheers mate";
			break;
		case "ukraine":
			greetings = "Pryvit";
			break;
		case "spain":
			greetings = "Hola";
			break;

		}
		System.out.println(greetings);

	}

	public static void main(String[] args) {
		HW1 object = new HW1();
		
		int biggerNumber=object.method1(15, 8);
		System.out.println(biggerNumber);
		

		

		object.method2(2);
		
		object.method3("ukraine");

	}

}
