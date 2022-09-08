package com.myapp.collect;

interface Consumer {
	public void show();
}

class ConsumerImpl implements Consumer {

	@Override
	public void show() {
		System.out.println("Show Method");

	}

}

public class AnonymousExample {

	public static void main(String[] args) {
		Consumer consumer = new ConsumerImpl();
		consumer.show();

		Consumer consumer2 = new Consumer() {
			@Override
			public void show() {
				System.out.println("Show....");

			}
		};

		consumer2.show();
	}
}
