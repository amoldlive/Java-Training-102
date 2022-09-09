package com.myapp.collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println(list); // duplication , // insertion order

		System.out.println("******************");

		// list iterator not supported
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(30);
		
		set.add(null); // 1 time
		System.out.println(set); // no duplication , // no insertion order

		set.add(null); // no exception thrown
	}
}
