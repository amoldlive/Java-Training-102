package com.myapp.eight;

@FunctionalInterface
interface Calculate {
	public double calc(int num1, int num2);
}

public class CalculatorExample {

	public static void main(String[] args) {

		Calculate add = (int num1, int num2) -> {
			return num1 + num2;
		};

		double result = add.calc(10, 20);
		System.out.println("Addition result : " + result);

		Calculate sub = (int num1, int num2) -> {
			return num1 - num2;
		};

		result = sub.calc(10, 20);
		System.out.println("Substraction result : " + result);

		/* mul div assignment */
	}

}
