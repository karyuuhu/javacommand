package com.hjl.serialize.extend;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NewBook book;
	private String name;

	public Student() {
		System.out.println("Student default construct");
		this.name = "default Student Name";
	}

	public Student(NewBook book, String name) {
		super();
		this.book = book;
		this.name = name;
	}

	public NewBook getBook() {
		return book;
	}

	public void setBook(NewBook book) {
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [book=" + book + ", name=" + name + "]";
	}
}
