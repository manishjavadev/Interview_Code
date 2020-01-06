package com.manish.javadev.thread;

public class DeadLockDemo {
	public static void main(String[] args) {
		SharedDeadLock s1 = new SharedDeadLock();
		SharedDeadLock s2 = new SharedDeadLock();
		
		//Thread 1 Object
		DeadLockThread1 deadLockThread1 = new DeadLockThread1(s1, s2);
		deadLockThread1.start();
		System.out.println("Thread State  = " + deadLockThread1.getState());

		//Thread 2 Object
		DeadLockThread2 deadLockThread2 = new DeadLockThread2(s1, s2);
		deadLockThread2.start();
		System.out.println("Done");
	}

}
