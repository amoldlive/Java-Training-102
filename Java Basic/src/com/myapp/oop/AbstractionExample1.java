package com.myapp.oop;

//abstract class
abstract class Animal {

	// abstract
	abstract public void sound();

	// non abstract
	public void show() {
		System.out.println("I am Show Method");
	}
}

//abstract class with nonabstract methods
abstract class Test {
	// non abstract
	public void show() {
		System.out.println("I am Show Method");
	}

	// non abstract
	public void print() {
		System.out.println("I am print Method");
	}
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("Banking ....");

	}

}

abstract class Fog extends Animal {

}

class Fog2 extends Fog {

	@Override
	public void sound() {
		System.out.println("Crack Crack ......");

	}

}

public class AbstractionExample1 {
	public static void main(String[] args) {
		// Animal animal=new Animal() ; // cant create object of abstract class

		Animal dog1 = new Dog();
		dog1.sound();
		dog1.show();

		Animal fog = new Fog2();
		fog.sound();
	}
}
