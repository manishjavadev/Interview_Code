package com.manish.javadev.thread.advance;

import java.util.concurrent.CyclicBarrier;

/**
 * 
 * https://ishaanone.blogspot.com/2018/07/what-do-you-know-about-cyclicbarrier-in.html
 * 
 * https://www.geeksforgeeks.org/java-util-concurrent-cyclicbarrier-java/#:~:text=CyclicBarrier%20is%20used%20to%20make,combined%20in%20the%20parent%20thread.
 * 
 * getParties: Returns the number of parties required to trip this barrier.
 * Syntax: public int getParties() Returns: the number of parties required to
 * trip this barrier
 * 
 * reset: Resets the barrier to its initial state. Syntax: public void reset()
 * Returns: void but resets the barrier to its initial state. If any parties are
 * currently waiting at the barrier, they will return with a
 * BrokenBarrierException.
 * 
 * isBroken: Queries if this barrier is in a broken state. Syntax: public
 * boolean isBroken() Returns: true if one or more parties broke out of this
 * barrier due to interruption or timeout since construction or the last reset,
 * or a barrier action failed due to an exception; false otherwise.
 * 
 * getNumberWaiting: Returns the number of parties currently waiting at the
 * barrier. Syntax: public int getNumberWaiting() Returns: the number of parties
 * currently blocked in await()
 * 
 * await: Waits until all parties have invoked await on this barrier. Syntax:
 * public int await() throws InterruptedException, BrokenBarrierException
 * Returns: the arrival index of the current thread, where index getParties() –
 * 1 indicates the first to arrive and zero indicates the last to arrive.
 * 
 * await: Waits until all parties have invoked await on this barrier, or the
 * specified waiting time elapses. Syntax:
 * 
 * 
 * public int await(long timeout, TimeUnit unit) throws InterruptedException,
 * BrokenBarrierException, TimeoutException Returns: the arrival index of the
 * current thread, where index getParties() – 1 indicates the first to arrive
 * and zero indicates the last to arrive
 * 
 * 
 * CyclicBarrier is one of the Java Concurrency Utility.
 * 
 * It was introduced in java 5 It falls under java.util.concurrency package
 * 
 * Using this we can synchronised the threads which are processing through some
 * algorithm
 * 
 * Using this we can make threads wait at a point of code until specific number
 * of threads have reached that point of code.
 * 
 * Threads will be ordered to wait on call of await() method CyclicBarrier can
 * be instantiated as:
 * 
 * CyclicBarrier obj = new CyclicBarrier(n) where n is an integer and also that
 * specific number.
 * 
 * 
 * @author Manish Srivastava
 *
 */
public class CyclicBarrierCabBookingDemo {
	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		Thread t1 = new Thread(new CabService(cyclicBarrier), "Passenger1");
		t1.start();
		Thread.sleep(7000);
		Thread t2 = new Thread(new CabService(cyclicBarrier), "Passenger2");
		t2.start();
		Thread.sleep(7000);
		Thread t3 = new Thread(new CabService(cyclicBarrier), "Passenger3");
		t3.start();
		Thread.sleep(7000);

	}

}
