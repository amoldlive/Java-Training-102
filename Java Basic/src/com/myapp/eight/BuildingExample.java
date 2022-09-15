package com.myapp.eight;

@FunctionalInterface
interface Building {
	public void build(int floor);
}

public class BuildingExample {
	public static void main(String[] args) {

		Building building = (int floor) -> {
			System.out.println("Building is under construction : Floors : " + floor);
		};
		building.build(5);

	}
}
