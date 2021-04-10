package com.manish.javadev.geeks.linkedlist;

/**
 * Input : 1 2 3 4 5 Output : 3 1 2 4 5
 * 
 * Input : 1 2 3 4 5 6 Output : 4 1 2 3 5 6
 * 
 * @author kmamani
 *
 */
public class MakeMiddleNodeHeadInlinkedList {

	/* Driver function */
	public static void main(String args[]) {
		// Create a list of 5 nodes
		head = null;
		int i;
		for (i = 5; i > 0; i--)
			push(i);

		System.out.print(" list before: ");
		printList(head);

		setMiddleHead();

		System.out.print(" list After:  ");
		printList(head);

	}

	static Node head;

	/*
	 * Function to get the middle and set at beginning of the linked list
	 */
	static void setMiddleHead() {
		if (head == null)
			return;

		// To traverse list nodes one
		// by one
		Node slow = head;

		// To traverse list nodes by
		// skipping one.
		Node fast = head;

		// To keep track of previous of middle
		Node prev = null;
		while (fast != null && fast.next != null) {

			/* for previous node of middle node */
			prev = slow;
			/* move one node each time */
			slow = slow.next;

			/* move two node each time */
			fast = fast.next.next;

		}

		/* set middle node at head */
		prev.next = prev.next.next;
		slow.next = head;
		head = slow;
	}

	// To insert a node at the beginning of
	// linked list.
	static void push(int new_data) {
		/* allocate node */
		Node new_node = new Node(new_data);

		/* link the old list off the new node */
		new_node.next = head;

		/* move the head to point to the new node */
		head = new_node;
	}

	// A function to print a given linked list
	static void printList(Node ptr) {
		while (ptr != null) {
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
		System.out.println();
	}

	/* Link list node */
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

}
