package com.manish.javadev.thread.advance;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CabService implements Runnable {
	private CyclicBarrier cyclicBarrier;

	CabService(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "  .." + "has arived");
			System.out.println("Number of parties required to trip the barrier = " + cyclicBarrier.getParties());

			try {
				
				// number of parties waiting at the barrier
				System.out.println("Number of parties waiting at the barrier " + "at this point = "
						+ cyclicBarrier.getNumberWaiting());
				cyclicBarrier.await();

			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "  .." + "is going to board the cab");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
