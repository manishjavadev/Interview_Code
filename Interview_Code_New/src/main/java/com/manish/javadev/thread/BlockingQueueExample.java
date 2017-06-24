package com.manish.javadev.thread;

import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) throws Exception {

		BlockingQueue bq = new ArrayBlockingQueue(10);

		Producer producer = new Producer(bq);
		Consumer consumer = new Consumer(bq);

		new Thread(producer).start();

		new Thread(consumer).start();

		Thread.sleep(4000);

	}

}
