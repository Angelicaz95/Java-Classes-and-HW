package com.syntax.class8;

public class breakKeyword {

	public static void main(String[] args) {
		boolean summer=true;
		int temp=75;
		while(summer) {
			System.out.println("I am happy, I love summer");
			temp+=5;
			if(temp>=100) {
				System.out.println("Nah, it is too hot");
				break;
			}
			
		}

	}

}
