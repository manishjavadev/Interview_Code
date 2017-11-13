package com.manish.javadev.thread.advance;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args) {
		String[] item = { "Mashroom", "Paneer Tikka", "Gril Chiken" };
		CountDownLatch countDownLatch = new CountDownLatch(item.length);
		Thread foodProcessorThread = new Thread(new FoodProcessor(countDownLatch, item));
		foodProcessorThread.start();

		try {
			System.out.println("Order is received and is being processed");
			countDownLatch.await();
			System.out.println("Order is Processed successfuly and is ready to get dispatched");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
