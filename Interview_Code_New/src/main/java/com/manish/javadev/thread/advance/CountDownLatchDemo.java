package com.manish.javadev.thread.advance;

import java.util.concurrent.CountDownLatch;

/**
 * https://www.geeksforgeeks.org/countdownlatch-in-java/
 * 
 * CountDownLatch is used to make sure that a task waits for other threads
 * before it starts.
 * 
 * To understand its application, let us consider a server where the main task
 * can only start when all the required services have started.
 * 
 * @author Manish Srivastava
 *
 */
public class CountDownLatchDemo {
	public static void main(String[] args) {
		String[] item = { "Mashroom", "Paneer Tikka", "Gril Chicken" };
		CountDownLatch countDownLatch = new CountDownLatch(item.length);
		Thread foodProcessorThread = new Thread(new FoodProcessor(countDownLatch, item));
		foodProcessorThread.start();

		try {
			System.out.println("Order is received and is being processed");
			countDownLatch.await();
			System.out.println("Order is Processed successfuly and is ready to get dispatched");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
