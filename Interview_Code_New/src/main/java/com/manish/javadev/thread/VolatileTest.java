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
 * Incrementing MY_INT to 1 Got Change for MY_INT : 1
 * 
 * Incrementing MY_INT to 2 Got Change for MY_INT : 2 Incrementing MY_INT to 3
 * Got Change for MY_INT : 3 Incrementing MY_INT to 4 Got Change for MY_INT : 4
 * Incrementing MY_INT to 5 Got Change for MY_INT : 5 Without the volatile
 * keyword the output is :
 * 
 * Incrementing MY_INT to 1 Incrementing MY_INT to 2 Incrementing MY_INT to 3
 * Incrementing MY_INT to 4 Incrementing MY_INT to 5 .....And the change
 * listener loop infinitely...
 * 
 * 
 * 
 * @author m.d.srivastava
 * 
 */
public class VolatileTest {

	private static volatile int MY_INT = 0;

	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}

	static class ChangeMaker extends Thread {

		@Override
		public void run() {

			int local_value = MY_INT;
			while (MY_INT < 5) {
				System.out.print("Incrementing MY_INT to\t");
				System.out.println(local_value + 1);
				MY_INT = ++local_value;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	static class ChangeListener extends Thread {
		@Override
		public void run() {
			int local_value = MY_INT;
			while (local_value < 5) {
				if (local_value != MY_INT) {
					System.out.print("Got Change for MY_INT\t ");
					System.out.println(MY_INT);
					local_value = MY_INT;
				}
			}
		}
	}
}
