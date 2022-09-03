package com.myapp.oop;

class M {
	int value = 10;

	public void print() {
		System.out.println("M - > value : " + value);
	}
}

class N extends M {
	int value = 20;

	public void print() {
		System.out.println("M Value : - > "+super.value);
		System.out.println("N - > value : " + value);
	}
	
	public void print2() {
		super.print();
	}
}

public class InheritanceExample7 {
	public static void main(String[] args) {
		N n = new N();
		n.print();
		n.print2();
		
		
		M n2=new N(); 
	}
}
