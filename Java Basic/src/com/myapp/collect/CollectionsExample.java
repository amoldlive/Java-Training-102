package com.myapp.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(80);
		list.add(50);
		list.add(20);
		list.add(90);
		list.add(10);
		list.add(20);

		System.out.println("Unsorted : " + list);

		Collections.sort(list);

		System.out.println("Sorted : " + list);

		int location = Collections.binarySearch(list, 50);
		System.out.println("Location of 50 : " + location);

		 location = Collections.binarySearch(list, 20);
		System.out.println("Location of 20 : " + location);
	}
}
