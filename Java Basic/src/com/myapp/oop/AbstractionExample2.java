package com.myapp.oop;

abstract class AbstractCalucator{
	abstract public void add(int i,int j);
	abstract public void sub(int i,int j);
	abstract public void div (int i,int j);
	abstract public void mul(int i,int j);
}
class MyCalculator extends AbstractCalucator{

	@Override
	public void add(int i, int j) {
		
		System.out.println(i+j);
	}

	@Override
	public void sub(int i, int j) {
		System.out.println(i-j);
		
	}

	@Override
	public void div(int i, int j) {
		System.out.println(i/j);
		
	}

	@Override
	public void mul(int i, int j) {
		System.out.println(i*j);
		
	}
	
}
public class AbstractionExample2 {
	public static void main(String[] args) {
		AbstractCalucator abstractCalucator=new MyCalculator();
		abstractCalucator.add(10, 20);
		abstractCalucator.sub(10, 20);
		abstractCalucator.mul(10, 20);
		abstractCalucator.div(10, 20);
	}
}
