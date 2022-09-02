package com.myapp.oop;

class D{
	public D(int i) {
		System.out.println("D -> Object created "+i);
	}
	public D(int i,String name) {
		System.out.println("D -> Object created "+i +"  : Name  : "+name);
	}
}
class E extends D{

	public E(int i) {
		super(i); //first line  // super constructor
		System.out.println("E -> Object created "+i);
	}
	
	public E(int i,String name) {
		super(i,name);
		System.out.println("E -> Object created "+i +"  : Name  : "+name);
	}
}
public class InheritanceExample3 {
	public static void main(String[] args) {
		E e=new E(10);
		System.out.println("**************");
		
		E e2=new E(10,"Test");
	}
}
