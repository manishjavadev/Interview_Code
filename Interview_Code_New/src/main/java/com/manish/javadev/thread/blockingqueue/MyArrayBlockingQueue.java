package com.manish.javadev.thread.blockingqueue;

/**
 * http://tutorials.jenkov.com/java-concurrency/blocking-queues.html
 * 
 * A blocking queue is a queue that blocks when you try to dequeue from it
 * and the queue is empty, or if you try to enqueue items to it and the queue is already full.
 * A thread trying to dequeue from an empty queue 
 * is blocked until some other thread inserts an item into the queue. 
 * A thread trying to enqueue an item in a full queue is blocked until some other thread
 * makes space in the queue,
 * either by dequeuing one or more items or clearing the queue completely. 
 * 
 * @author Manish Srivastava
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyArrayBlockingQueue {

	public static void main(String[] args) throws Exception {

		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);

		Producer producer = new Producer(bq);
		Consumer consumer = new Consumer(bq);

		Thread t1 = new Thread(producer);

		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();

		Thread.sleep(4000);

	}

}
