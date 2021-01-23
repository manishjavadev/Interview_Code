package com.manish.javadev.thread;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class ConsumerProducerDemo {
	public static void main(String[] args) {
		SharedConsumerProducer s1 = new SharedConsumerProducer();

		Consumer consumer = new Consumer(s1);
		Producer producer = new Producer(s1);
		consumer.start();
		producer.start();
		try {
			consumer.join();
			producer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Done");
	}

}

class Consumer extends Thread {
	SharedConsumerProducer s1 = null;
	int index = 0;

	public Consumer(SharedConsumerProducer s1) {
		this.s1 = s1;
	}

	public void run() {
		while (index++ < 50) {
			s1.consume();
		}
	}
}

class Producer extends Thread {
	SharedConsumerProducer s1 = null;
	int index = 0;

	public Producer(SharedConsumerProducer s1) {
		this.s1 = s1;
	}

	public void run() {
		while (index++ < 50) {
			s1.produce();
		}
	}
}

class SharedConsumerProducer {
	boolean produceConsumeFlag = false;
	int number = 1;
	// char ch = 'A';

	public synchronized void consume() {
		if (!produceConsumeFlag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consume ::: " + number);
		produceConsumeFlag = false;
		notify();
	}

	public synchronized void produce() {
		if (produceConsumeFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number++;
		System.out.println("Produce ::: " + number);
		produceConsumeFlag = true;
		notify();
	}
}
