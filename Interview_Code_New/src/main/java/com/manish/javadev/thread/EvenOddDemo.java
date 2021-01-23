package com.manish.javadev.thread;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class EvenOddDemo {
	public static void main(String[] args) {
		SharedEvenAndOdd s1 = new SharedEvenAndOdd();

		EvenThread et = new EvenThread(s1);
		OddThread ot = new OddThread(s1);
		et.start();
		ot.start();
		try {
			et.join();
			ot.join();
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
