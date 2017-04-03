package com.manish.javadev.thread;

public class DeadLockSharedResources {
	public synchronized void test1(DeadLockSharedResources d2)
			throws InterruptedException {
		System.out.println("Test bigin");
		Thread.sleep(2000);
		d2.test2(this);
		System.out.println("Test1 End");
	}

	public synchronized void test2(DeadLockSharedResources d1)
			throws InterruptedException {
		System.out.println("Test2 bigin");
		Thread.sleep(2000);
		d1.test1(this);
		System.out.println("Test2 End");
	}

}
