package com.manish.javadev.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class Consumer implements Runnable {
	protected BlockingQueue<Integer> queue = null;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while (true) {
				System.out.println("Consumed: " + queue.take());
				System.out.println("Done");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}