package com.manish.javadev.thread;

public class SharedDeadLock {

	public synchronized void test1(SharedDeadLock s2) throws InterruptedException {
		System.out.println("Test bigin");
		Thread.sleep(2000);
		// Thread1 require s2 Object lock, but s2 object lock is busy with
		// thread2
		s2.test2(this);
		System.out.println("Test1 End");
	}

	public synchronized void test2(SharedDeadLock s1) throws InterruptedException {
		System.out.println("Test2 bigin");
		Thread.sleep(2000);
		// Thread2 require s1 Object lock, but s1 object lock is busy with
		// thread1
		s1.test1(this);
		System.out.println("Test2 End");
	}

}
