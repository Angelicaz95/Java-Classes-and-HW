package com.syntax.class7;

public class HomeWork1 {

	public static void main(String[] args) {
		// calculate the sum of all even numbers from from range 1 to 100
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sum+=i;
				}
			}
		System.out.println(sum);
	}

}
