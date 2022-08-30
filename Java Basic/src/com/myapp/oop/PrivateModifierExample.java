package com.myapp.oop;

//accessible within the class
class Phone {
	private int phoneId=10;	//private
	int serialNumber=101;  //default
	
	public Phone(){
		System.out.println(phoneId);
	}
}

public class PrivateModifierExample {
	public static void main(String[] args) {
		Phone phone=new Phone();
		phone.serialNumber=102;
		System.out.println(phone.serialNumber);
		//System.out.println(phone.phoneId);
	}
}
