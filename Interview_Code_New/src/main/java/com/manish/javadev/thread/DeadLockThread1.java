package com.manish.javadev.thread;

public class DeadLockThread1 extends Thread {
	SharedDeadLock s1 = null;
	SharedDeadLock s2 = null;

	public DeadLockThread1(SharedDeadLock s1,SharedDeadLock s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		try {
			s1.test1(s2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
