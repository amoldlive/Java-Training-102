package com.myapp.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {

		// no duplication
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");

		map.put(1, "One");

		System.out.println(map);

		System.out.println("Value OF Key -2 : " + map.get(2));

		System.out.println("Size of the map : " + map.size());

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for (Entry entry : entrySet) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		System.out.println("*******JAVA-8********");

		entrySet.forEach((entry) -> System.out.println(entry.getKey() + " " + entry.getValue()));

		System.out.println("*******MAP-JAVA-8********");
		map.forEach((k, v) -> System.out.println(k + "  " + v));

	}
}
