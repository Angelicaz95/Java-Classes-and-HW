package com.syntax.class4;

public class MoreNestedIf {

	public static void main(String[] args) {
		boolean replCompleted=true;
		int assignments=5;
		if(replCompleted) {
			System.out.println("Great job!");
			if(assignments<16) {
				System.out.println("You did an amazing work");
			} else if(assignments<10) {
				System.out.println("You did good but you should do more");
			}else if(assignments<6) {
				System.out.println("You need to do more homework");
			}else {
				System.out.println("Why?");
			}
			
			
		}else {
			System.out.println("Please make sure you do your homework");
		}
		

	}

}
