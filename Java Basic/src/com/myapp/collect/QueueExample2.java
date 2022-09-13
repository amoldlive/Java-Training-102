package com.myapp.collect;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample2 {
	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(1);
		queue.add(3);
		queue.add(12);
		
		//top -> 10 1 3 12
		
			
		
		// Basic Queue - LinkedLIst
		Queue<Integer> pQueue = new PriorityQueue<>(); //natural sorting algoritham priority
		pQueue.offer(10);
		pQueue.offer(1);
		pQueue.offer(3);
		pQueue.offer(12);
		
		//top -> 1   3  10 12
		System.out.println("P Queue : "+pQueue); // meaningless
		
		System.out.println("Priority Queue Top Element : "+pQueue.peek()); //1
		
		pQueue.poll();
		
		System.out.println("Priority Queue Top Element : "+pQueue.peek()); // 3

	}
}
