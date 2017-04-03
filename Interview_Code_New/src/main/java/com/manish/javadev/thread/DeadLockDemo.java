package com.manish.javadev.thread;

public class DeadLockDemo {
	public static void main(String[] args) {
		DeadLockSharedResources d1 = new DeadLockSharedResources();
		DeadLockSharedResources d2 = new DeadLockSharedResources();
		DeadLockThread1 deadLockThread1 = new DeadLockThread1(d1, d2);
		deadLockThread1.start();
		System.out.println("Thread State  = " + deadLockThread1.getState());

		DeadLockThread2 deadLockThread2 = new DeadLockThread2(d1, d2);
		deadLockThread2.start();
		System.out.println("Done");
	}

}
