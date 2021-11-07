package com.syntax.class11;

public class Phone {
	String model;
	String operatingSystem;
	String color;
	int capacity;
	boolean faceID;

	void takePictures() {
		System.out.println("You can take high quality pictures using " + model + ".");

	}

	void playGames() {
		System.out.println("User can download and play any games on the phone" + ".");

	}

	void setAlarm() {
		System.out.println("Set the alarm for 8AM");
	}

	public static void main(String[] args) {
		Phone iPhone = new Phone();
		iPhone.model = "iPhone 13 Pro";
		iPhone.operatingSystem = "iOS";
		iPhone.color = "Blue";
		iPhone.capacity = 256;
		iPhone.faceID = true;

		iPhone.takePictures();
		iPhone.playGames();
		System.out.println("-----------------");

		Phone googlePixel = new Phone();
		googlePixel.model="Google Pixel 6 Pro";
		googlePixel.operatingSystem="Chrome OS";
		googlePixel.capacity=512;
		googlePixel.color="Black";
		
		googlePixel.setAlarm();
		googlePixel.takePictures();
		System.out.println("----------------------");
		

		Phone android = new Phone();
		android.model="Samsung Galaxy S21 Ultra ";
		android.operatingSystem="Android";
		android.color="White";
		android.capacity=256;
		android.faceID=true;
		
		android.takePictures();
		android.playGames();
		

	}

}
