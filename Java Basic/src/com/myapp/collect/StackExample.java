package com.myapp.collect;

import java.util.Stack;

//write your own stack | Last In First Out {LIFO} 
public class StackExample {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		// push
		// pop
		// peek
		stack.push(10); // F
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60); // L

		System.out.println(stack.peek());

		int topData = stack.pop();
		System.out.println("Top Data : " + topData);

		System.out.println(stack.peek());
	}
}
