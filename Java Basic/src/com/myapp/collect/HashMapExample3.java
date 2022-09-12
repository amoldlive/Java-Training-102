package com.myapp.collect;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample3 {
	public static void main(String[] args) {

		// key - no duplication | values - duplication allowed
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");

		map.put(4, "Four");
		map.put(4, "Ten");
		map.put(5, "Four");
		map.put(6, "Four");

		System.out.println(map);

		Map<Integer, String> map2 = new HashMap<>();
		map2.putAll(map);

		System.out.println(map2);
		System.out.println("Value For Key 11 - >" + map2.getOrDefault(11, "Default Value"));
		System.out.println("Value For Key 11 - >" + map2.getOrDefault(4, "Default Value"));

	}
}
