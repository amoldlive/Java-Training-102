package com.myapp.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

class A implements Consumer<Entry<Integer, String>> {

	@Override
	public void accept(Entry<Integer, String> t) {
		System.out.println(t.getKey() + "  " + t.getValue());

	}

}

public class HashMapExample2 {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");

		Set<Entry<Integer, String>> set = map.entrySet();

		A a = new A();
		set.forEach(a);
	}
}
