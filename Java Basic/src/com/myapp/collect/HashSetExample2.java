package com.myapp.collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*remove duplication*/
public class HashSetExample2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		set.addAll(list);

		System.out.println(set);

	}
}
