package com.syntax.class7;

public class OddNumbers {

	public static void main(String[] args) {
		// print odd numbers between 20 and 50
		for(int a=20; a<=50; a++) {
			if(a%2!=0) {
				System.out.print(a+" ");
			}
		}
   System.out.println("Another way");
   for(int b=21; b<=50; b+=2) {
	   System.out.print(b+" ");
   }
	}

}
