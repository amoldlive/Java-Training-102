package com.myapp.oop;

class A {
	public A() {
		System.out.println("A-> Constructor ...");
	}
}
class B extends A{
	public B() {
		System.out.println("B-> Constructor ...");
	}
}
class C extends B{
	public C() {
		System.out.println("C-> Constructor ...");
	}
}
public class InheritanceExample2 {
	public static void main(String[] args) {
		A a=new A();
		System.out.println("*******************");
		
		B b=new B();
		
		System.out.println("******************");
		
		C c=new C();
	}
}
