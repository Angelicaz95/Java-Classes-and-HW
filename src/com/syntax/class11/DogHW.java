package com.syntax.class11;

public class DogHW {
	String breed;
	String name;
	String color;
	int age;
	char gender;

	void play() {
		if (breed.equals("Labrador") || breed.equals("Husky")) {
			System.out.println(breed + " is very active and likes to play");
		} else {
			System.out.println(breed + " likes to play fetch");
		}
	}

	void eat() {
		System.out.println(breed + " is known to eat a lot and quickly");
	}

	void walkOutside() {
		if (breed.equals("Husky") || breed.equals("Labrador")) {
			System.out.println(breed + " enjoys long walks outside");
		} else {
			System.out.println(breed + " prefers short walks outside");
		}
	}

	public static void main(String[] args) {

		DogHW husky = new DogHW();
		husky.name = "Oliver";
		husky.breed = "Husky";
		husky.age = 2;
		husky.color = "grey";
		husky.walkOutside();
		husky.play();
		System.out.println("----------------");
		DogHW bulldog = new DogHW();
		bulldog.name = "Oscar";
		bulldog.breed = "Bulldog";
		bulldog.age = 5;
		bulldog.gender = 'M';
		bulldog.eat();
		bulldog.play();
		System.out.println("----------------");
		DogHW labrador = new DogHW();
		labrador.breed = "Labrador";
		labrador.name = "Stark";
		labrador.age = 3;
		labrador.gender = 'M';
		labrador.play();
		labrador.walkOutside();
		labrador.eat();

	}

}
