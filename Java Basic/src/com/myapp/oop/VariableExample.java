package com.myapp.oop;

class VariableTypes {

	int i;
	float f;
	boolean b;
	String s;

	public void print() {

		int i2=0;
		float f2=0.0f;
		boolean b2=false;

		System.out.println("int -> " + i);
		System.out.println("float -> " + f);
		System.out.println("boolean -> " + b);
		System.out.println("String -> " + s);

		System.out.println("Local int -> " + i2);
		System.out.println("Local float -> " + f2);
		System.out.println("Local boolean -> " + b2);
	}
	public void print2() {
		System.out.println("int -> " + i);
	
		//accessible
		//System.out.println("Local int -> " + i2);
	}

}//exit

public class VariableExample {
	public static void main(String[] args) {
		VariableTypes types = new VariableTypes();
		types.print();
		types.print2();
		System.out.println("instance int : "+types.i);
		System.out.println("instance float : "+types.f);
		
		//not accessible
		//System.out.println("instance float : "+types.i2);
	}
}
