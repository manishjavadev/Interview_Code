package com.manish.javadev.thread.blockingqueue;

public class SharedPrinter3Thread {
	int number = 1;
	int numOfThreads;
	int numInSequence;

	SharedPrinter3Thread(int numInSequence, int numOfThreads) {
		this.numInSequence = numInSequence;
		this.numOfThreads = numOfThreads;
	}

	public void printNum(int result) {
		synchronized (this) {
			while (number < numInSequence - 1) {
				while (number % numOfThreads != result) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " - " + number++);
				this.notifyAll();
			}
		}
	}
}

class SeqRunnable implements Runnable {
	SharedPrinter3Thread sp;
	int result;

	SeqRunnable(SharedPrinter3Thread sp, int result) {
		this.sp = sp;
		this.result = result;
	}

	@Override
	public void run() {
		sp.printNum(result);
	}
}
