package com.hjl.serialize.extend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Simulator3 {
	public static void main(String[] args) {
		new Simulator3().go();
	}

	private void go() {
		Student2 student = new Student2(new NewBook(2011, "moree"), "kevin");

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
			Student2 studentRead = (Student2) in.readObject();
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
