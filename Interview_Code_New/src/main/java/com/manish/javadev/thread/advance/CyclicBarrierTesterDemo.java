package com.manish.javadev.thread.advance;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTesterDemo {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier newBarrier = new CyclicBarrier(2);
		// parent thread

		Product product = new Product(newBarrier);
		Sum sum = new Sum(newBarrier);

		// creation of child thread
		Thread t1 = new Thread(product);

		Thread t2 = new Thread(sum);

		// moving child thread to runnable state
		t1.start();
		t2.start();
		Thread.sleep(2000);

		System.out.println("Sum of product and sum = " + (Product.product + Sum.sum));

		newBarrier.reset();
		System.out.println("Barrier reset successful");

	}

}