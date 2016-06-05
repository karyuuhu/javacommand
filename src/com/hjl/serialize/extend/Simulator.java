package com.hjl.serialize.extend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Simulator {
	public static void main(String[] args) {
		new Simulator().go();
	}

	private void go() {
		Student student = new Student(new NewBook(2011, "moree"), "kevin");

		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("seria"));
			out.writeObject(student); //
			System.out.println("object has been written..");
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"seria"));
			Student studentRead = (Student) in.readObject();
			System.out.println("object read here:");
			System.out.println(studentRead);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}