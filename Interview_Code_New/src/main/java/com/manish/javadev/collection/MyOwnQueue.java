package com.manish.javadev.collection;

/**
 * @author Manish
 *
 */

/**
 * THis program creating our own Queue feature like collection classes. But this
 * is user defined Queue Note: Queue means First in First out(means 0th index
 * always) Note: this is dynamic queue because once the size of array is full it
 * will call alterCapacity method and alter the size of array with double
 * capacity and do the operation
 */
public class MyOwnQueue {

	private int size;
	private int capacity;
	private Object elements[];

	public MyOwnQueue() {
		capacity = 10;
		elements = new Object[capacity];

	}

	public void addObject(Object obj) {
		if (size == 10) {
			alterCapacity();
		}
		elements[size++] = obj;
	}

	// Here i am altering the capacity of array
	// and copying array element in to temp array
	// and creating new array with modified size and
	// and again copying temp array in again in new modified(size) array
	private void alterCapacity() {
		capacity = capacity * 2;
		Object temp[] = elements;
		elements = new Object[capacity];
		for (int i = 0; i < temp.length; i++) {
			elements[i] = temp[i];
		}
	}

	public Object removeObjectFromQueue() {
		Object obj = elements[0];
		for (int i = 0; i < size-1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return obj;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < size; i++) {
			sb.append(elements[i] + ",");
		}
		return sb.substring(0, sb.length() - 1) + "]";
	}

	public static void main(String[] args) {

		MyOwnQueue s1 = new MyOwnQueue();
		s1.addObject("abc");
		s1.addObject("123");
		s1.addObject("bcd");
		s1.addObject("bcd2");
		s1.addObject("bcd3");
		System.out.println(s1);
		// Here i am calling remove method of queue
		System.out.println(s1.removeObjectFromQueue());
		System.out.println(s1);
	}
}
