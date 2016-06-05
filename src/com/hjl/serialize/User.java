package com.hjl.serialize;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private String name;
    private int age;
    private Date birthday;
    private static String country;
    private transient String gender;
    
    private static final long serialVersionUID = -6849794470754667710L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		User.country = country;
	}

	@Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", country=" + country +
                ", birthday=" + birthday +
                '}';
    }
}
