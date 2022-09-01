package com.myapp.oop;

class LaserShow{
	private int tiketCharge=10;
	private int parkingCharge=10;
	
	public void show() {
		System.out.println("Laser Show Total Charges :  "+(tiketCharge+parkingCharge));
	}
	
	public void show(int tiketCharge) {
		this.tiketCharge=tiketCharge;
		System.out.println("Laser Show Total Charges :  "+(tiketCharge+parkingCharge));
	}
	
	public void show(int tiketCharge,int parkingCharge) {
		this.tiketCharge=tiketCharge;
		this.parkingCharge=parkingCharge;
		System.out.println("Laser Show Total Charges :  "+(tiketCharge+parkingCharge));
	}
	
	public void show(int tiketCharge,int parkingCharge,String vehicalNumber) {
		this.tiketCharge=tiketCharge;
		this.parkingCharge=parkingCharge;
		System.out.println("Vehical Number : "+vehicalNumber);
		System.out.println("Laser Show Total Charges :  "+(tiketCharge+parkingCharge));
	}
}
public class MethodOverloadingExample {
	public static void main(String[] args) {
		LaserShow laserShow=new LaserShow();
		laserShow.show();
		laserShow.show(20);
		laserShow.show(20, 30);
		laserShow.show(20, 30, "MH-49 BT-4100");
	}
}
