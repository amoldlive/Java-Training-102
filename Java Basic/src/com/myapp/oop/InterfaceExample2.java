package com.myapp.oop;

interface MobileInterface {
	void on();

	void off();

	void silent();

	void volumeUp();

	void volumeDown();

}

class Samsung implements MobileInterface {

	@Override
	public void on() {
		System.out.println("Phone Switched On ...");
	}

	@Override
	public void off() {
		System.out.println("Phone Switched Off ...");
	}

	@Override
	public void silent() {
		System.out.println("Not Supported ...");
	}

	@Override
	public void volumeUp() {
		System.out.println("Volume Up ...");
	}

	@Override
	public void volumeDown() {
		System.out.println("Volume Down ...");
	}

}

public class InterfaceExample2 {
	public static void main(String[] args) {
		MobileInterface samsungMobile = new Samsung();
		samsungMobile.on();
		samsungMobile.silent();
		samsungMobile.volumeDown();
		samsungMobile.volumeUp();
		samsungMobile.off();
	}
}
