package com.manish.javadev.thread.advance;

import java.util.concurrent.CyclicBarrier;

public class Sum implements Runnable {

	public static int sum = 0;
	CyclicBarrier cyclicBarrier;

	public Sum(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	public void run() {
		System.out.println("Is the barrier broken? - " + cyclicBarrier.isBroken());
		sum = 10 + 20;
		try {
			System.out.println("Number of parties waiting at the barrier " + "at this point = "
					+ cyclicBarrier.getNumberWaiting());
			cyclicBarrier.await();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
