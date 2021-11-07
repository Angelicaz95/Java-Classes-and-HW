package com.syntax.class12;

public class HW3 {
	int method(int a) {
		
		boolean isPrime = true;
		if (a > 1) {
			for (int i = 2; i < a; i++) {
				if (a % 2 == 0) {
					isPrime = false;
					break;
					}
			}
		} else {
			isPrime = false;
		}
		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
		return a;
		
	}

	public static void main(String[] args) {
		HW3 object=new HW3();
		
		System.out.println(object.method(11));
		

	}

}
