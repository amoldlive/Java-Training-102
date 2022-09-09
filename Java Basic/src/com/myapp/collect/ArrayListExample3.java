package com.myapp.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample3 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Nagpur-1");
		list.add("Nagpur-2");
		list.add("Nagpur-3");
		list.add("Nagpur-4");
		list.add("Delhi");
		list.add("Pune");

		Iterator<String> iterator = list.iterator();
		System.out.println(iterator.hasNext()); // true
		System.out.println(iterator.next()); // Nagpur-1
		System.out.println(iterator.next()); // Nagpur-2
		System.out.println(iterator.next()); // Nagpur-3
		// System.out.println(iterator.previous()); // no backword direction supported

		ListIterator<String> listIterator = list.listIterator();
		System.out.println(listIterator.hasNext()); // true
		System.out.println(listIterator.next()); // Nagpur-1
		System.out.println(listIterator.next()); // Nagpur-2
		System.out.println(listIterator.hasPrevious()); // true
		System.out.println(listIterator.previous()); // Nagpur-2
		System.out.println(listIterator.previous()); // Nagpur-1

	}
}
