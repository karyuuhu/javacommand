package com.hjl.serialize.extend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Simulator2 {
	public static void main(String[] args) {
		new Simulator2().go();
	}

	private void go() {
		Student student = new Student(new NewBook(2011, "moree"), "kevin");

		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("seria"));
			out.writeObject(student);
			// 清除流中保存的写入对象的记录
			out.reset();
			student.setName("test1");
			out.writeObject(student);
			// 清除流中保存的写入对象的记录
			out.reset();
			student.setName("test2");
			out.writeObject(student);
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
			Student test1 = (Student) in.readObject();
			Student test2 = (Student) in.readObject();
			System.out.println("object read here:");
			System.out.println("Student1's name: " + studentRead.getName());
			System.out.println("Student2's name: " + test1.getName());
			System.out.println("Student3's name: " + test2.getName());
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