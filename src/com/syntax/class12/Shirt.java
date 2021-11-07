package com.syntax.class12;

public class Shirt {
	 String color;
	char size;
	public static void putOn() {
		System.out.println("Shirt is on");
	}
	public static void takeOff() {
		System.out.println("Shirt is off");
	}
	
	
	 void setColor(String newColor) {
		color=newColor;
	}
	 
	 
	 Shirt(String color, char size){
		 this.color=color;
		 this.size=size;
		 
		 
	 }

	}

