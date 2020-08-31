package com.manish.javadev.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class Producer implements Runnable {
	int number = 0;
	int index = 0;
	private BlockingQueue<Integer> bq = null;

	public Producer(BlockingQueue<Integer> queue) {
		this.bq = queue;
	}

	public void run() {

		try {
			while (index++ <= 15) {
				produce();
				Thread.sleep(100);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void produce() throws InterruptedException {
		System.out.println("Producer Produced Number" + number);
		bq.put(number++);

	}

	public void setBlockingQueue(BlockingQueue<Integer> bq) {
		this.bq = bq;
	}

}