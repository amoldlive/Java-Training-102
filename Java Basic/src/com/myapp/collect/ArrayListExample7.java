package com.myapp.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class MyIterator implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}

public class ArrayListExample7 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Nagpur");
		list.add("Delhi");
		list.add("Pune");

		MyIterator iterator = new MyIterator();
		// list.forEach(iterator);

		// list.forEach(new MyIterator());

		/*
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});

		 */
		
		
		list.forEach((t)-> {
				System.out.println(t);

			});

	}
}
