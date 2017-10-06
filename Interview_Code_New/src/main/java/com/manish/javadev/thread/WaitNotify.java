package com.manish.javadev.thread;

public class WaitNotify {
	public synchronized void test1() {
		System.out.println("Test1 begin");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test1 end");
	}

	public synchronized void test2() {
		notify();
	}

}
