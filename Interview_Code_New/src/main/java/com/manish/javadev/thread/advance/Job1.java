package com.manish.javadev.thread.advance;

import java.util.concurrent.CyclicBarrier;

public class Job1 implements Runnable {
	public int product = 0;
	private CyclicBarrier barrier;

	public Job1(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	public void run() {
		product = 2 * 3;
		try {
			barrier.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getResult() {
		return product;
	}
}