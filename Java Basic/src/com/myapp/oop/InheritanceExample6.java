package com.myapp.oop;

class K{
	public void show() {
		System.out.println("I am show method of K class");
	}	
}
class L extends K{
	@Override
	public void show() {
		System.out.println("I am show method of L class");
	}
}
public class InheritanceExample6 {
	public static void main(String[] args) {
		L l=new L();
		l.show();
	}
}
