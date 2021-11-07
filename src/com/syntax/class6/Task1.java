package com.syntax.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country = input.nextLine();
		String language = null;
		switch (country.toLowerCase()) {
		case "ukraine":
			language = "Ukrainian";
			break;
		case "france":
			language = "French";
			break;
		case "italy":
			language = "Italian";
			break;
		case "united states":
			language = "English";
			break;
		case "spain":
			language = "Spanish";
			break;
			default:
				language="Invalid";
		}
if(!language.equals("Invalid")) {
	System.out.println("If you are from "+country+" you speak "+language+" language.");
}else {
	System.out.println("Please try another country!");
}
	}

}
