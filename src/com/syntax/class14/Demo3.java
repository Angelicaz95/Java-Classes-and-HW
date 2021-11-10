package com.syntax.class14;

public class Demo3 {

	public static void main(String[] args) {
		String str="The rain has started here sel";
		System.out.println(str.charAt(5)); // prints the character with index 5
		System.out.println(str.indexOf("s")); // prints the index of the first occurrence of "s"
		System.out.println(str.indexOf("s", 12)); // prints the index of the second occurrence of "s"
		System.out.println(str.indexOf("s", str.indexOf("s")+1)); // prints the index of the second occurrence of "s"
		System.out.println(str.indexOf("s", str.indexOf("s")+3)); // prints the third occurrence 
		System.out.println(str.indexOf("here"));  // if the index is not available, it will return -1
		
		
		// substring 
		System.out.println(str.substring(0, 8)); // will not include 8
		
		// trim
		String s="        Hello World     "; // will remove spaces before and after
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", "")); // will remove all spaces
		String date="01-01-2017"; // 01/01/2017
		System.out.println(date.replace("-", "/"));
		
		
		// split
		
		String test="Hello_World_Test";  
		String test1[]=test.split("_");
		for(int i=0; i<test1.length; i++) {
			System.out.print(test1[i]+" ");
			
			
			String x="Hello";
			String y="World";
			int a=100;
			int b=200;
			
			System.out.println(x+y); // HelloWorld
			System.out.println(a+b); // 300
			System.out.println(x+y+a+b); //HelloWorld100200
			System.out.println(a+b+x+y); //300HelloWorld
			
		}
	
		
		
		
		
		

	}

}
