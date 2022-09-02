package com.myapp.oop;

class I{
	public static void show() {
		System.out.println("I am show methid of I class");
	}
}
class J extends I{
	
}
public class InheritanceExample5 {
	public static void main(String[] args) {
		J j=new J();
		j.show(); // we can inherit static methods and properties
	}
}
