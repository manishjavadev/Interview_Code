package com.manish.javadev.thread.advance;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Job2 implements Runnable {
	public int sum = 0;
	private CyclicBarrier barrier;

	public Job2(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	public void run() {
		// check if newBarrier is broken or not
		System.out.println("Is the barrier broken? - " + barrier.isBroken());
		sum = 10 + 20;
		try {
			barrier.await(3000, TimeUnit.MILLISECONDS);

			// number of parties waiting at the barrier
			System.out.println(
					"Number of parties waiting at the barrier " + "at this point = " + barrier.getNumberWaiting());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getResult() {
		return sum;
	}
}