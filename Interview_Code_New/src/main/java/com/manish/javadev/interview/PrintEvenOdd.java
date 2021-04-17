package com.manish.javadev.interview;

public class PrintEvenOdd {

	boolean flag = false;
	int number = 1;

	// t1
	public synchronized void printEven() throws InterruptedException {
		if (flag) {
			this.wait();
		}
		System.out.println("Thread 1 :: " + number++);// 1, 3
		flag = true;
		this.notify();
	}

	// t2
	public synchronized void printOdd() throws InterruptedException {
		if (!flag) {
			this.wait();
		}
		System.out.println("Thread 2 :: " + number++);// 1, 3
		flag = false;
		this.notify();
	}
}
