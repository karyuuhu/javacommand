package com.hjl.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo1 {
	public static void main(String[] args) {
		// Write Obj to file
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
			oos.writeObject(Singleton.getSingleton());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Read Obj from file
		Singleton newInstance = null;
		ObjectInputStream ois = null;
		try {
			File file = new File("tempFile");
			ois = new ObjectInputStream(new FileInputStream(file));
			newInstance = (Singleton) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 判断是否是同一个对象
		System.out.println(newInstance == Singleton.getSingleton());
	}
}
