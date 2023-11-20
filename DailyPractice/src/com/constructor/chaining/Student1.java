package com.constructor.chaining;

public class Student1 {
	int id;
	String nameString;
	public Student1() {
	}
	public Student1(int a , String n) {
		id=a;
		nameString=n;
	}
	void display() {
		System.out.println(id);
		System.out.println(nameString);
	}

	public static void main(String[] args) {
		Student1 student1=new Student1(287,"Prahlad");
		Student1 student12=new Student1();
		student12.id=student1.id;
		student12.nameString=student1.nameString;
		student1.display();
		student12.display();

	}
}
