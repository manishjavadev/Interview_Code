package com.manish.javadev.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	int index;
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