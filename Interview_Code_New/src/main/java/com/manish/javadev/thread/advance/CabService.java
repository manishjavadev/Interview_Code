package com.manish.javadev.thread.advance;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CabService implements Runnable {
	CyclicBarrier cyclicBarrier;

	CabService(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "  .." + "has arived");
			System.out.println("Number of parties required to trip the barrier = " + cyclicBarrier.getParties());

			try {
				/**
				 * Once all the Thread did not call await method, then below of
				 * line 33 is not going to execute
				 * 
				 * 1) Once first thread will call await method then
				 * cyclicBarrier check how many thread is in waiting state till
				 * now 1
				 * 
				 * 2) Once second thread will call await method then
				 * cyclicBarrier check how many thread is in waiting state till
				 * now 2
				 * 
				 * 3) Once second thread will call await method then
				 * cyclicBarrier check how many thread is in waiting state till
				 * now 3
				 * 
				 * Once cyclicBarrier found 3 thread are in waiting state then
				 * cyclicBarrier execute the remaining code.
				 */
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
