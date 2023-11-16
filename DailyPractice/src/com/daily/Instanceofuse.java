package com.daily;

class Parants{
	void display() {
		System.out.println("This is parant class");
	}
}

interface Firstinstance{
	void show();
}

public class Instanceofuse extends Parants implements Firstinstance {
	void display() {
		System.out.println("This is child class");
	}
	@Override
	public void show() {
		System.out.println("this is show method of interface");
		
	}
	
	public static void main(String[] args) {
		Parants p=new Parants();
		Instanceofuse i= new Instanceofuse();
		System.out.println(p instanceof Parants);
		System.out.println(p instanceof Object);
		System.out.println(i instanceof Object);

			Firstinstance f=new Instanceofuse();
			System.out.println(f instanceof Instanceofuse);
			
			System.out.println(f instanceof Instanceofuse);
			System.out.println(f instanceof Firstinstance);
			System.out.println(i instanceof Firstinstance);
			
			Instanceofuse f1= (Instanceofuse) new Parants();
			System.out.println(f1 instanceof Instanceofuse);
	}
}