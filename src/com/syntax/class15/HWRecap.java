package com.syntax.class15;

public class HWRecap {

	public static void main(String[] args) {
		//1. 
		String str="The sunset is beautiful today";
		System.out.println(str.replace(" ", ""));
		System.out.println(str);// will print spaces. String can't be changed
		str=str.replace("\\s", "");
		System.out.println(str);
		StringBuilder str2=new StringBuilder("The sunset is beautiful today");
		System.out.println(str2.reverse()); // if you call a method in SB class, it changes the value  the original variable
		System.out.println(str2);
		
		//3. 
		String c="Is it Saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(c.split("[?.!]").length);
		
		//4
		String a="This is a sentence i want to reverse";
		String[] arr=a.split(" ");
		for(String word:arr) {
			StringBuilder b=new StringBuilder(word);
			System.out.print(b.reverse()+" ");
			
			
			// 5
			String reverse="aba";
			StringBuilder d=new StringBuilder(reverse);
			d.reverse();
			if(reverse.equals(d.toString())) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not a palindrome");
				
				
			}
			
			//6
			String name1="Hormat";
			String name2="Sorbon";
		name1=name1+name2;
		name2=name1.replace(name2, "");
		name1=name1.replace(name2, "");
		System.out.println(name1+" "+name2);
			
			
			
		}
		
		
		
		

	}

}
