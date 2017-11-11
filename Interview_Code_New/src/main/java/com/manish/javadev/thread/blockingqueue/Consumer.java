package com.manish.javadev.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	protected BlockingQueue<Integer> queue = null;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while (true) {
				System.out.println("Consumed: " + queue.take());
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}