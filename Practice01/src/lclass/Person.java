package lclass;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = -8635186209261425708L;
	
	String name;
	int age;
	char gender;
	String password;
	
	public Person() {
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
