package com.myapp.oop;

interface Test1 {
	public void show();

	public default void print() {
		System.out.println("Test-1 >> Default");
	}
}

interface Test2 {
	public void show();

	public default void print() {
		System.out.println("Test-1 >> Default");
	}
}

class TestImpl implements Test1, Test2 {

	@Override
	public void show() {
		System.out.println("TetsImpl Show() ---");

	}

	public void print() {
		System.out.println("My Implmentation...");
		Test2.super.print();
	}
}

public class InterfaceExample5 {
	public static void main(String[] args) {
		TestImpl impl = new TestImpl();
		impl.show();
		impl.print();
	}
}
