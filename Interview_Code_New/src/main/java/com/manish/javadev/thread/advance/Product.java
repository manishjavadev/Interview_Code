package com.manish.javadev.thread.advance;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Product implements Runnable {

	public static int product = 0;
	private CyclicBarrier cyclicBarrier;

	public Product(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	public void run() {
		product = 2 * 3;
		try {
			System.out.println("Number of parties waiting at the barrier " + "at this point = "
					+ cyclicBarrier.getNumberWaiting());
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
