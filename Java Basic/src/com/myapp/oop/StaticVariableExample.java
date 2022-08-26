package com.myapp.oop;

class Circle {
	
	int r=5;
	static double PI=3.14;
	double instancePI=3.14;
	
	public static double getPIValue() {
		return PI;
	}
	public  double getInstancePIValue() {
		return instancePI;
	}
	public void calculateArea(int radius) {
		r=radius;
		double area=getInstancePIValue()*r*r;
		System.out.println("Area Of Circle : "+area);
	}
	
	public static void printArea(int radius) {
		//r=radius;
		//double area=getInstancePIValue()*radius*radius;
		double area=getPIValue()*radius*radius;
		System.out.println("Area Of Circle : "+area);
	}
}

public class StaticVariableExample {
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.calculateArea(6);
		
		Circle circle2=new Circle();
		circle.calculateArea(8);
		
		Circle circle3=new Circle();
		circle.calculateArea(10);
		
		Circle circle4=new Circle();
		circle.calculateArea(4);
		
		Circle.printArea(10); //static method
	}
}
