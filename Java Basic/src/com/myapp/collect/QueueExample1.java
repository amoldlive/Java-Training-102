package com.myapp.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
	public static void main(String[] args) {

		//Basic Queue - LinkedLIst
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(80);
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		
		System.out.println("Queue : "+queue);
		
		System.out.println("Top Element : "+queue.peek()); // 80
		
		System.out.println("Removed Element : "+queue.poll());
		
		System.out.println("Queue : "+queue);

		queue.poll();
		queue.poll();
		
		System.out.println("Queue : "+queue);

		
		
	}
}
