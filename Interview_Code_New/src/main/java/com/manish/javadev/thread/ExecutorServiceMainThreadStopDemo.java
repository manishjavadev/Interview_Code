package com.manish.javadev.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMainThreadStopDemo {
	static int test = 0;

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		executorService.execute(new Runnable() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("1");
					/*
					 * System.out.println(Thread.currentThread().getId());
					 * System.out.println("Asynchronous task1");
					 */
					test++;
				}

			}
		});
		executorService.execute(new Runnable() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("2");
					test++;
				}

			}
		});
		executorService.execute(new Runnable() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("3");
					test++;
				}

			}
		});
		System.out.println("================Going to Stop===================");
		Thread.currentThread().stop();
	}

}
