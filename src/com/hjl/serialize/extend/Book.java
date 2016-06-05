package com.hjl.serialize.extend;

//public class Book implements Serializable {
public class Book {
	private int isbn;

	public Book() {
		// isbn = 888;
		System.out.println("Book class no-arg constructor invoked..");
	}

	public Book(int isbn) {
		super();
		this.isbn = isbn;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return " Book=[isbn=" + isbn + "]";
	}

}
