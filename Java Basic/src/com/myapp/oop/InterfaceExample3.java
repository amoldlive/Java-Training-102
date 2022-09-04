package com.myapp.oop;

interface Engine {
	public void start();

	public void stop();

	// default method | java -8 | non mandatory for implementation
	public default void tuneEngine() {
		testMyEngine();
		tuneL1();
		tuneL2();
		System.out.println("Default engine tuning ...");
	}

	// java-8
	public static void wipers() {
		System.out.println("Wipers started ....");
	}

	// java-9 // within interface //default implementation which we can use within
	// the interface
	private void testMyEngine() {
		System.out.println("Testing Engine in Advance Mode.....");
	}

	private void tuneL1() {
		System.out.println("Tuning Level L1 ....");
	}

	private void tuneL2() {
		System.out.println("Tuning Level L2 ....");
	}
}

class Hyndai_Normal implements Engine {

	@Override
	public void start() {
		System.out.println("Engine Start....");

	}

	@Override
	public void stop() {
		System.out.println("Engine Stop....");

	}

}

class Hyndai_Turbo implements Engine {

	@Override
	public void start() {
		System.out.println("Turbo Engine Start...");

	}

	@Override
	public void stop() {
		System.out.println("Turbo Engine Stop...");

	}

	@Override
	public void tuneEngine() {
		System.out.println("Turbo Engine Tuned...");

	}

}

public class InterfaceExample3 {
	public static void main(String[] args) {
		Engine normal = new Hyndai_Normal();
		normal.start();
		normal.tuneEngine();
		normal.stop();
		Engine.wipers();

		System.out.println("****************");
		Engine turbo = new Hyndai_Turbo();
		turbo.start();
		turbo.tuneEngine();
		turbo.stop();
		Engine.wipers();
	}
}
