package com.syntax.class4;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an item you wish to purchase");
		String item=input.nextLine(); // next.LOine - to capture more than one word
		System.out.println("Please enter the price of the "+item);
		double price=input.nextDouble();
		System.out.println("You selected "+item+" priced at "+price);
		
		
		
		

	}

}
