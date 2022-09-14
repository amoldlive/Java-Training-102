package com.myapp.eight;

//what is functional interface

//functional interface

@FunctionalInterface
interface Animal {
	public void sound(String soundName);
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		// Cat cat = new Cat();
		// cat.sound("Meow Meow");

		Animal cat = new Animal() {

			@Override
			public void sound(String soundName) {
				System.out.println("SoundName : " + soundName);

			}
		};

		cat.sound("Meow Meow");

		Animal dog = (String soundName) -> {
			System.out.println("SoundName : " + soundName);
		};

		dog.sound("Bhow Bhow");

		// java -8 lambda expression
		Animal cow = (soundName) -> System.out.println("SoundName : " + soundName);
		cow.sound("Humba HUmba");
	}
}
