package com.myapp.oop;

class Fruit {

	public static void printFruitName(String fruitName) {
		System.out.println("Fruit Name : " + fruitName);
	}

	public void printFruitName1(String fruitName) {
		System.out.println("Fruit Name : " + fruitName);
	}
}

public class StaticMethodExample {
	public static void main(String[] args) {
			Fruit.printFruitName("Apple");
			//Fruit.printFruitName1("Apple");
			
			Fruit fruit=new Fruit();
			fruit.printFruitName1("Orange");
	}
}
