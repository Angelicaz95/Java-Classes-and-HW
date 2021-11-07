package com.syntax.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		/* Create a Java program names Temperature check.Create a variable to store temperature.
		 * you program should check if temperature is below 32,
		 *  then it should print "Water will NOT freeze with temperature __"
		 */
		int temperature=35;
		if (temperature>32) {
			System.out.println("Water will NOT freeze with temperature "+temperature+".");
		} else {
			System.out.println("Water will freeze with temperature "+temperature+".");
		}
		
	}

}
