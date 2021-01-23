package com.manish.javadev.thread;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class EvenOddDemo {
	public static void main(String[] args) {
		SharedEvenAndOdd s1 = new SharedEvenAndOdd();

		EvenThread even = new EvenThread(s1);
		OddThread odd = new OddThread(s1);
		even.start();
		odd.start();
		try {
			even.join();
			odd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Done");
	}

}

class EvenThread extends Thread {
	SharedEvenAndOdd s1 = null;
	int index = 0;

	public EvenThread(SharedEvenAndOdd s1) {
		this.s1 = s1;
	}

	public void run() {
		while (index++ < 13) {
			s1.printEven();
		}
	}
}

class OddThread extends Thread {
	SharedEvenAndOdd s1 = null;
	int index = 0;

	public OddThread(SharedEvenAndOdd s1) {
		this.s1 = s1;
	}

	public void run() {
		while (index++ < 13) {
			s1.printOdd();
		}
	}
}

class SharedEvenAndOdd {
	boolean evenOddFlag = false;
	int number = 1;
	// char ch = 'A';

	public synchronized void printEven() {
		if (!evenOddFlag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// System.out.println("Even Thread = " + (char) (ch + number++));
		System.out.println("Even Thread = " + number++);
		evenOddFlag = false;
		notify();
	}

	public synchronized void printOdd() {
		if (evenOddFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// System.out.println("Odd Thread = " + (char) (ch + number++));
		System.out.println("Odd Thread = " + number++);
		evenOddFlag = true;
		notify();
	}

}
