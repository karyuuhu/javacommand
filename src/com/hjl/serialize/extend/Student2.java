package com.hjl.serialize.extend;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student2 implements Externalizable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NewBook book;
	private String name;

	public Student2() {
		System.out.println("Student default construct");
		this.name = "default Student Name";
	}

	public Student2(NewBook book, String name) {
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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		name = (String) in.readObject();
	}

}
