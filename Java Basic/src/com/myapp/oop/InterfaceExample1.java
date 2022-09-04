package com.myapp.oop;

interface TypeC {
	// variable
	public static final int watt = 24;

	// methods -abstract methods
	public void inject();

	public void eject();
}

class Mobile implements TypeC {

	@Override
	public void inject() {
		System.out.println("Mobile - > PORT USED : CABLE INJECTED : POWER "+watt);
	}

	@Override
	public void eject() {
		System.out.println("Mobile - > PORT AVAILABLE : CABLE EJECTED: POWER "+watt);
	}

}
class Laptop implements TypeC{

	@Override
	public void inject() {
		System.out.println("Laptop - > PORT USED : CABLE INJECTED: POWER "+watt);
		
	}

	@Override
	public void eject() {
		System.out.println("Laptop - > PORT AVAILABLE : CABLE EJECTED: POWER "+watt);
		
	}
	
}
public class InterfaceExample1 {
	public static void main(String[] args) {
		TypeC mobile=new Mobile();
		mobile.inject();
		mobile.eject();
		
		TypeC laptop=new Laptop();
		laptop.inject();
		laptop.eject();
	}
}
