package com;

public class Student extends Superperson {

	int age;

	@Override
	public String toString() {
		return "Student [age=" + age + ", pname=" + pname + ", syear=" + syear + "]";
	}

	public Student(String pname, int syear, int age) {
		super(pname, syear);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
