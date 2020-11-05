package com.manish.javadev.geeks.linkedlist;

/**
 * @author Manish
 *
 */
/**
 * This program creating double linked list , and have two methods create the
 * node and also iterating the Linked List
 */
public class MyDoubleLinkedList {

	Element front, back;

	// createNode(Object data)
	public void createNode(Object data) {
		Element e = new Element(data);
		if (front == null)
			front = e;
		else
			back.next = e;
		e.pre = back;
		back = e;
	}

	// Iterate the double linked list
	public void iterate() {
		Element e = front;
		while (e != null) {
			System.out.println(e.data);
			e = e.next;
		}
	}
}

class Element {
	public Element pre, next;
	Object data;

	public Element(Object data) {
		this.data = data;
	}
}

class MyDoubleLinkedListManager {

	public static void main(String[] args) {
		// Here i am creating the object of MyDoubleLinkedList
		MyDoubleLinkedList mdl = new MyDoubleLinkedList();
		mdl.createNode(10);
		mdl.createNode(20);
		mdl.createNode(30);
		mdl.createNode(40);
		mdl.iterate();
	}
}
