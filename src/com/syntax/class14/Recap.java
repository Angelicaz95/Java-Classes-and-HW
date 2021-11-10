package com.syntax.class14;

import java.util.Arrays;

public class Recap {

	public static void main(String[] args) {
		// -1 error - if the character is not present in string (indexOf)
		// out of bound - if the index is not present 
		
		
		
		String name="Nasiri";
		System.out.println(name.indexOf("i", 4)); // only shows the second letter
		// System.out.println(name.substring(3, 3));  will not print anything 
		
		String sentence="This is a java class";
		System.out.println(sentence.split(" ").length);
		System.out.println(sentence.split(" ")[0]);
		System.out.println(Arrays.toString(sentence.split(" ")));
		System.out.println(sentence.split(" ")[3]);
		
		
		String fathersName="Daniel"; //7/2=>3
		String mothersName="Mary"; //2
		String isBoyGirl="girl";
		if(isBoyGirl.equalsIgnoreCase("Boy")) {
			String firstPart=fathersName.substring(0,fathersName.length()/2);
			String secondPart=mothersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		}else {
			String firstPart=mothersName.substring(0,fathersName.length()/2);
			String secondPart=fathersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		}
		String str="Hello";
		if(!str.isEmpty()) {
			if(str.length()%2!=0 && str.length()>=3) {
				System.out.println(str.charAt(str.length()/2));
				
			}
			
			
		}
		

		
		
	}

}
