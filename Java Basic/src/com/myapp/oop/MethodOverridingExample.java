package com.myapp.oop;

class Bike {
	private String color="Black";
	private boolean isSelfStart=false;
	private double price=100000;
	private double cc=145;
	
	 void getBike() {
		System.out.println("Bike - Color : "+color+" | isSelfStart : "+isSelfStart+" | price : "+price +" | CC : "+cc);
	}
	public void getBike(String bikeModel) {
		System.out.println("Bike : "+bikeModel+  " - Color : "+color+" | isSelfStart : "+isSelfStart+" | price : "+price +" | CC : "+cc);
	}
	
	public Object getName() {
		return "dummyName";
	}
}
class HondaBike extends Bike{
	@Override
	public void getBike() {
		System.out.println("Creating Honda Bike");
	}
	
	@Override // annotation
	public void getBike(String bikeModel) {
		System.out.println("Bike : "+bikeModel+" - next gen");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Softronix";
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.getBike();
		bike.getBike("R1 V5");
		
		
		HondaBike bike2=new HondaBike();
		bike2.getBike();
		bike2.getBike("Unicorn-101");
	}
}
