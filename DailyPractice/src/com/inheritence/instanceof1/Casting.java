package com.inheritence.instanceof1;
class Parant{
	void show(Parant p) {
		child child=(child)	p;
		System.out.println("This is Parant method");
	}
}
class child extends Parant{
	void show(Parant p) {
		child child=(child)	p;
		System.out.println("This is Child method");
	}
}
public class Casting {
	public static void main(String[] args) {
		Parant p1=new child();
		p1.show(p1);
		
		Parant p2=new Parant();
		//p2.show(p2);
		
	}
	
}
