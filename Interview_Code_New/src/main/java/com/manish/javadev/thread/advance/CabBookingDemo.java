package com.manish.javadev.thread.advance;

import java.util.concurrent.CyclicBarrier;

public class CabBookingDemo {
	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		Thread t1 = new Thread(new CabService(cyclicBarrier), "Passenger1");
		t1.start();
		Thread.sleep(2000);
		Thread t2 = new Thread(new CabService(cyclicBarrier), "Passenger2");
		t2.start();
		Thread.sleep(2000);

		Thread t3 = new Thread(new CabService(cyclicBarrier), "Passenger3");
		t3.start();
		Thread.sleep(2000);
	}

}
