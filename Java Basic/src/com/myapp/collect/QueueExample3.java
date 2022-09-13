package com.myapp.collect;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample3 {
	public static void main(String[] args) {

		ArrayDeque<Integer> dQueue = new ArrayDeque<>();
		dQueue.offer(10);
		dQueue.offer(1);
		dQueue.offer(3);
		dQueue.offer(12);
		dQueue.offer(5);
		dQueue.offer(100);

		System.out.println("Queue : " + dQueue);

		System.out.println("Top Element : " + dQueue.peek()); // 10
		System.out.println("Top Element : " + dQueue.peekFirst()); // 10
		System.out.println("Top Element : " + dQueue.peekLast()); // 100

		dQueue.pollFirst(); // removes first element
		dQueue.pollLast(); // removes last element

		System.out.println("Queue : " + dQueue);

		dQueue.offer(25);

		System.out.println("Queue : " + dQueue);

		dQueue.offerFirst(36);

		System.out.println("Queue : " + dQueue);
		
		dQueue.offerLast(59);

		System.out.println("Queue : " + dQueue);

	}
}
