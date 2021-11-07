package com.syntax.class10;

public class Project5 {

	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		// (use 2 different loops).
		String[] countries = { "Ukraine", "USA", "Italy", "Spain", "France", "Serbia" };
		String capital = null;

		for (int i = 0; i < countries.length; i++) { // can use switch as well. countries[i] in condition 
			if (countries[i].equals("Ukraine")) {
				capital = "Kyiv";
			} else if (countries[i].equals("USA")) {
				capital = "Washington DC";
			} else if (countries[i].equals("Italy")) {
				capital = "Rome";
			} else if (countries[i].equals("Spain")) {
				capital = "Madrid";
			} else if (countries[i].equals("France")) {
				capital = "Paris";
			} else if (countries[i].equals("Serbia")) {
				capital = "Belgrade";
			}
			System.out.println("The capital of " + countries[i] + " is " + capital + ".");
		}

		System.out.println("--------------");
		
	for(String c:countries) {
		if(c.equals("Ukraine")) {
			capital="Kyiv";	
		}else if(c.equals("USA")) {
			capital="Washington DC";
			}else if(c.equals("Italy")) {
				capital="Rome";
			}else if(c.equals("Spain")) {
				capital="Madrid";
			}else if(c.equals("France")) {
				capital="Paris";
			}else if(c.equals("Serbia")) {
				capital="Belgrade";
				
		}
		System.out.println("The capital of " + c + " is " + capital + ".");
	}
			}
			
		
		
	}


