package com.inheritence.instanceof1;
class Dog{
	
}
public class Animal extends Dog {
	static void eat(Dog d) {
		if(d instanceof Dog ) {
			Animal a=(Animal) d;
			System.out.println("eating");
		}
	}
	public static void main(String[] args) {
		Dog n=new Animal();
		eat(n);

	}

}
