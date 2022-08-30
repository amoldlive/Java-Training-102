package com.myapp.oop;

class DummyCar {

	public DummyCar(String name) {
		super();
		// TODO Auto-generated constructor stub
	}

}

class Car {

	String color;
	boolean isInfotainmentAvailable;
	boolean isAlloyWheelsAvailable;
	String model;

	public Car() {
		color = "white";
		isInfotainmentAvailable = false;
		isAlloyWheelsAvailable = false;
		model = "basic";
		System.out.println("Car with default configuration");
		System.out.println("color : " + color);
		System.out.println("isInfotainmentAvailable : " + isInfotainmentAvailable);
		System.out.println("isAlloyWheelsAvailable : " + isAlloyWheelsAvailable);
		System.out.println("model : " + model);

	}

	public Car(String customColor) {
		color = customColor;
		isInfotainmentAvailable = false;
		isAlloyWheelsAvailable = false;
		model = "basic-2";
		System.out.println("Car with default configuration");
		System.out.println("color : " + color);
		System.out.println("isInfotainmentAvailable : " + isInfotainmentAvailable);
		System.out.println("isAlloyWheelsAvailable : " + isAlloyWheelsAvailable);
		System.out.println("model : " + model);

	}

	public Car(String customColor, boolean customInfotainmentAvailable) {
		color = customColor;
		isInfotainmentAvailable = customInfotainmentAvailable;
		isAlloyWheelsAvailable = false;
		model = "Adv-1";
		System.out.println("Car with default configuration");
		System.out.println("color : " + color);
		System.out.println("isInfotainmentAvailable : " + isInfotainmentAvailable);
		System.out.println("isAlloyWheelsAvailable : " + isAlloyWheelsAvailable);
		System.out.println("model : " + model);

	}

	public Car(String customColor, boolean customInfotainmentAvailable, boolean customAlloyWheelsAvailable) {
		color = customColor;
		isInfotainmentAvailable = customInfotainmentAvailable;
		isAlloyWheelsAvailable = customAlloyWheelsAvailable;
		model = "Adv-2";
		System.out.println("Car with default configuration");
		System.out.println("color : " + color);
		System.out.println("isInfotainmentAvailable : " + isInfotainmentAvailable);
		System.out.println("isAlloyWheelsAvailable : " + isAlloyWheelsAvailable);
		System.out.println("model : " + model);

	}

}

public class CarManufacturing {
	public static void main(String[] args) {
		// scanner
		Car car1 = new Car();
		System.out.println("*****************");
		Car car2 = new Car("Black");
		System.out.println("*****************");
		Car car3 = new Car("RED", true);
		System.out.println("*****************");
		Car car4 = new Car("RED", true, true);

		DummyCar dummyCar = new DummyCar("default constructor will not be available");
	}
}
