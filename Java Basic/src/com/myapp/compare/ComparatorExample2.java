package com.myapp.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingSorter implements Comparator<Integer> {

	@Override
	public int compare(Integer num1, Integer num2) {
		if (num1 == num2) {
			return 0;
		} else if (num1 > num2) {
			return -1;
		} else {
			return 1;
		}
	}

}

public class ComparatorExample2 {
	public static void main(String[] args) {

		/* Sort list in descending order */
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(4);

		System.out.println("Original List : " + list);

		DescendingSorter descendingSorter = new DescendingSorter();
		Collections.sort(list, descendingSorter);

		System.out.println("Sorted List : " + list);

	}
}
