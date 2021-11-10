package com.syntax.class14;

public class Demo2 {

	public static void main(String[] args) {
		String str="This is Batch 11. Batch 11 is good. Batch 11 is  good";
		System.out.println(str.replace("good","Great"));
		
		System.out.println(str.replaceFirst("good", "Great")); // will only replace first "good"
		
		
		
		String a="djhgkesrbglkdjbSHRGJTVMVFY245URTYE@#$%^";
		System.out.println(a.replaceAll("[0-5]", "*")); // can specify range
		System.out.println(a.replaceAll("[a-z]", "!")); // for replaceAll and split method ---> regular expression
		System.out.println(a.replaceAll("[A-Z]", ","));
		System.out.println(a.replaceAll("[A-Za-z]", "l"));
		
		System.out.println(a.replaceAll("[^a-zA-Z0-9]", "u")); // ^ ----> not symbol
		 String given="Hello Syntax friends";
		    System.out.println(given.replace("Hello", "Welcome").replace("family", "friends"));
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
