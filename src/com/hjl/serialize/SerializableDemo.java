package com.hjl.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializableDemo {
	public static void main(String[] args) throws IOException {
		// Initializes The Object
		User user = new User();
		User.setCountry("China");
		user.setName("jialong");
		user.setGender("male");
		// user.setCountry("China");
		user.setAge(23);
		user.setBirthday(new Date());
		System.out.println(user);

		// Write Obj to File
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
			oos.writeObject(user);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			oos.close();
		}

		// Read Obj from File
		File file = new File("tempFile");
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			User newUser = (User) ois.readObject();
			System.out.println(User.getCountry());
			System.out.println(newUser);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			ois.close();
			file.delete();
		}

	}
}
