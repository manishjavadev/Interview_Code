package com.manish.javadev.thread;

/**
 * http://www.geeksforgeeks.org/volatile-keyword-in-java/
 * 
 * https://dzone.com/articles/java-volatile-keyword-0
 * 
 * volatile keyword in Java Using volatile is yet another way (like
 * synchronized, atomic wrapper) of making class thread safe. Thread safe means
 * that a method or class instance can be used by multiple threads at the same
 * time without any problem.
 * 
 * 
 * Declaring a volatile Java variable means: The value of this variable will
 * never be cached thread-locally: all reads and writes will go straight to
 * "main memory"; Access to the variable acts as though it is enclosed in a
 * synchronized block, synchronized on itself.
 * 
 * class SharedObj {
 * 
 * // Changes made to sharedVar in one thread
 * 
 * // may not immediately reflect in other thread
 * 
 * static int sharedVar = 6;
 * 
 * }
 * 
 * class SharedObj {
 * 
 * // volatile keyword here makes sure that
 * 
 * // the changes made in one thread are
 * 
 * // immediately reflect in other thread
 * 
 * static volatile int sharedVar = 6;
 * 
 * }
 * 
 * 
 * 
 * ==========
 * 
 * Overview volatile is probably the less known/understood/documented keyword in
 * Java. I have recently read an article on one of my favourite blog about the
 * volatile keyword. The author shows a piece of code where the volatile keyword
 * seems to have an influence. This example was not easy to understand and the
 * role of the volatile keyword on the behaviour of the JVM was not really
 * defined. So I have decided to browse the web to find a better code example
 * for the volatile keyword. After one hour, nothing! Only wrong examples,
 * articles comparing volatile with synchronized and other confused examples
 * where the author seems as lost as the reader...
 * 
 * Basic Example The following show a basic example where volatile is required
 * 
 * 
 * Explanation So what happens? Each thread has its own stack, and so its own
 * copy of variables it can access. When the thread is created, it copies the
 * value of all accessible variables in its own memory. The volatile keyword is
 * used to say to the jvm
 * "Warning, this variable may be modified in an other Thread". Without this
 * keyword the JVM is free to make some optimizations, like never refreshing
 * those local copies in some threads. The volatile force the thread to update
 * the original variable for each variable. The volatile keyword could be used
 * on every kind of variable, either primitive or objects! Maybe the subject of
 * another article, more detailed...
 * 
 * Never used volatile and never met this problem...
 * 
 * Like all threads issues, it happens under specials circumstances. Really
 * special for this one... My example has big chances to show mainly because the
 * ChangeListener thread is busy, thanks to the loop, and the JVM consider that
 * this thread has no time for updating the local variables. Executing some
 * synchronized methods or adding an other variable which is volatile (or even
 * executing some simple lines of code) could modify the JVM behavior and
 * "correct" this problem...
 * 
 * Should I do a big refactor to identify all variables who needs volatile?
 * 
 * Be pragmatic! If you think your project needs it, do it. I think that the
 * essential is to be aware of that, to know what is the goal of each keyword of
 * the java language in order to take the good decisions.
 * 
 * With the volatile keyword the output is :
 * 
 * Incrementing chv to 1 Got Change for chv : 1
 * 
 * Incrementing chv to 2 Got Change for chv : 2 Incrementing chv to 3
 * Got Change for chv : 3 Incrementing chv to 4 Got Change for chv : 4
 * Incrementing chv to 5 Got Change for chv : 5 Without the volatile
 * keyword the output is :
 * 
 * Incrementing chv to 1 Incrementing chv to 2 Incrementing chv to 3
 * Incrementing chv to 4 Incrementing chv to 5 .....And the change
 * listener loop infinitely...
 * 
 * 
 * 
 * @author Manish Srivastava
 * 
 */
public class VolatileTest {

	private volatile int chv = 0;

	public static void main(String[] args) {
		VolatileTest vt = new VolatileTest();
		vt.new ChangeListener().start();
		vt.new ChangeMaker().start();
	}

	class ChangeMaker extends Thread {

		@Override
		public void run() {

			while (chv < 5) {
				System.out.print("Incrementing chv to\t");
				System.out.println(chv + 1);
				chv = chv + 1;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	class ChangeListener extends Thread {
		@Override
		public void run() {
			int localVal = chv;
			while (localVal < 5) {
				if (localVal != chv) {
					System.out.print("Got Change for chv\t ");
					System.out.println(chv);
					localVal = chv;
				}
			}
		}
	}
}
