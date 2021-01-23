package com.manish.javadev.thread;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class DeadLockDemo {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();

		// Thread 1 Object
		ThreadOne thread1 = new ThreadOne(s1, s2);
		thread1.start();
		System.out.println("Thread State  = " + thread1.getState());

		// Thread 2 Object
		ThreadTwo thread2 = new ThreadTwo(s1, s2);
		thread2.start();
		System.out.println("Done");
	}

}

class Shared {

	public synchronized void test1(Shared s2) throws InterruptedException {
		System.out.println("Test bigin");
		Thread.sleep(2000);
		// Thread1 require s2 Object lock, but s2 object lock is busy with
		// thread2
		s2.test2(this);
		System.out.println("Test1 End");
	}

	public synchronized void test2(Shared s1) throws InterruptedException {
		System.out.println("Test2 bigin");
		Thread.sleep(2000);
		// Thread2 require s1 Object lock, but s1 object lock is busy with
		// thread1
		s1.test1(this);
		System.out.println("Test2 End");
	}

}

class ThreadOne extends Thread {
	Shared s1 = null;
	Shared s2 = null;

	public ThreadOne(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		try {
			s1.test1(s2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadTwo extends Thread {
	Shared s1 = null;
	Shared s2 = null;

	public ThreadTwo(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		try {
			s2.test2(s1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
