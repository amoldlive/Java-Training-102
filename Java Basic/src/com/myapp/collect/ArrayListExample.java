package com.myapp.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListExample {
	public static void main(String[] args) {
		// collection used wrapper classes

		List<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(9);
		numberList.add(8);
		numberList.add(7);

		System.out.println("Size  : " + numberList.size());

		// way -1
		for (int i = 0; i < numberList.size(); i++) {
			System.out.print(numberList.get(i) + " \t");
		}

		System.out.println("\n********************");

		// way-2 --enhanced for loop
		for (Integer data : numberList) {
			System.out.print(data + "\t");
		}

		System.out.println("\n********************");

		// way-3 -> java 8+
		numberList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + "\t");
			}
		});

		System.out.println("\n********************");

		// way-3 -> java 8+
		numberList.forEach((t) -> System.out.print(t + "\t"));

		System.out.println("\n*******using iterator*************");

		// way-4
		Iterator<Integer> iterator = numberList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}

		System.out.println("\n*******using List Iterator iterator*************");

		// way-4
		Iterator<Integer> listiterator = numberList.listIterator();
		while (listiterator.hasNext()) {
			System.out.print(listiterator.next() + "\t");
		}

	}
}
