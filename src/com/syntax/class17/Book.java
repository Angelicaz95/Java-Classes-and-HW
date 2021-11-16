package com.syntax.class17;

public class Book {
	String name;
	String author;
	String genre;
	int numberOfPages;

	public Book(String name, String author) {

		this.name = name;
		this.author = author;

	}

	public Book(String name, String author, String genre, int numberOfPages) {

		this(name, author);
		this.genre = genre;
		this.numberOfPages = numberOfPages;
	}

	public void printInfo() {
		System.out.println("The name of the book is " + name + ".");
		System.out.println("The author of the book is " + author + ".");

	}
}
