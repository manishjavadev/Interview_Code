package com.manish.javadev.thread.advance;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable {
	CountDownLatch countDownLatch;
	String[] items;

	public FoodProcessor(CountDownLatch countDownLatch, String[] items) {
		this.countDownLatch = countDownLatch;
		this.items = items;
	}

	public void run() {
		for (int i = 0; i < items.length; i++) {
			System.out.println("Before processing the item value of countdownlatch :" + countDownLatch.getCount());
			try {
				Thread.sleep(10000);
				countDownLatch.countDown();
				System.out.println("Item :" + items[i] + "  is prepared");
				System.out.println("After processing the item value of countdownlatch :" + countDownLatch.getCount());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
