package com.myapp.collect;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println(list);

		list.forEach((val) -> System.out.println(val));
	}
}
