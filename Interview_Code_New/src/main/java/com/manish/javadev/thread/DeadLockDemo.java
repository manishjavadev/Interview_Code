package com.manish.javadev.thread;

public class DeadLockDemo {
	public static void main(String[] args) {
		SharedDeadLock d1 = new SharedDeadLock();
		SharedDeadLock d2 = new SharedDeadLock();
		DeadLockThread1 deadLockThread1 = new DeadLockThread1(d1, d2);
		deadLockThread1.start();
		System.out.println("Thread State  = " + deadLockThread1.getState());

		DeadLockThread2 deadLockThread2 = new DeadLockThread2(d1, d2);
		deadLockThread2.start();
		System.out.println("Done");
	}

}
