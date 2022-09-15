package com.myapp.eight;

@FunctionalInterface
interface Flower {
	public void flowerName(String name);
	// can contain default implementation

	// default method
	public default void name() {
		System.out.println("Default Flower Name  : LILTY");
	}
}

public class FlowerExample {
	public static void main(String[] args) {
		Flower flower = (name) -> {
			System.out.println("Flower Name : " + name);
		};
		flower.flowerName("Rose");

		flower.name();

	}
}
