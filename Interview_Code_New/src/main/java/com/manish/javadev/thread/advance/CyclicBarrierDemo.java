package com.manish.javadev.thread.advance;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {

		CyclicBarrier brrier = new CyclicBarrier(3);
		// objects on which the child thread has to run
		Job1 job1 = new Job1(brrier);
		Job2 job2 = new Job2(brrier);

		System.out.println("Number of parties required to trip the barrier = " + brrier.getParties());
		System.out.println("Sum of product and sum = " + (job1.getResult() + job2.getResult()));

		// creation of child thread
		Thread t1 = new Thread(job1);
		Thread t2 = new Thread(job2);

		// moving child thread to runnable state
		t1.start();
		t2.start();

		try {
			int await = brrier.await();
			System.out.println("Number of Thread reached " + await);
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

		// barrier breaks as the number of threadwaiting for the barrier
		// at this point = 3
		System.out.println("Sum of product and sum = " + (job1.getResult() + job2.getResult()));

		// Resetting the barrier
		brrier.reset();
		System.out.println("Barrier reset successful");
	}

}
