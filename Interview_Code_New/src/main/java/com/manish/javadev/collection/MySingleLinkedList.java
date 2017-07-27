package com.manish.javadev.collection;

/**
 * @author Manish
 *
 */
/**
 * This program creating single linked list , and have two methods At object at
 * end and add Object AtStart and also iterating the Linked List
 */
public class MySingleLinkedList {

	ElementForSingle front, back;

	public void addObjectAtEnd(Object obj) {

		ElementForSingle e = new ElementForSingle();
		e.data = obj;
		// Here first checking front is empty or not if empty then
		// put start element reference in front,
		// back also pointing the new added element
		if (front == null) {
			front = e;
		} else {
			back.next = e;
		}
		// Here we are assigning the element reference to back
		back = e;
	}

	public void addObjectAtStart(Object obj) {
		ElementForSingle e = new ElementForSingle();
		e.data = obj;
		e.next = front;
		front = e;
	}

	// Here only iteration logic is there
	public void iterate() {
		ElementForSingle e = front;
		while (e != null) {
			System.out.print(e.data + ",");
			e = e.next;
		}
	}

	public static void main(String[] args) {
		// Here user defined linked list object
		MySingleLinkedList ml = new MySingleLinkedList();
		// Here I am adding object to linked list

		ml.addObjectAtEnd("abc");
		ml.addObjectAtEnd("122");
		ml.addObjectAtEnd("333");
		ml.addObjectAtEnd("444");

		// Here we are iterating the linkedlist
		ml.iterate();
		System.out.println("");

		// Here i am adding the object at start position
		ml.addObjectAtStart("1");
		ml.addObjectAtStart("2");
		ml.iterate();
	}

}

class ElementForSingle {
	Object data;
	ElementForSingle next;
}
