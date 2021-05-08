package com.manish.javadev.thread.advance;

import java.util.concurrent.CyclicBarrier;

/**
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
