package com.anotation;

class Animal {
	void eatsomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal {
	void eatsomething() {
		System.out.println("eating foods");
	}// should be eatSomething
}

class TestAnnotation1 {
	public static void main(String args[]) {
		Animal a = new Dog();
		a.eatsomething();
		Animal b = new Animal();
		b.eatsomething();
		Dog c = new Dog();
		c.eatsomething();
	}
}
