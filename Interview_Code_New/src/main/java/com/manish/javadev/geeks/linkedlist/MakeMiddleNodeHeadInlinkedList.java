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

	public static void main(String args[]) {
		head = null;
		int i;
		for (i = 6; i > 0; i--)
			push(i);

		System.out.print(" list before: ");
		printList(head);

		setMiddleHead();

		System.out.print(" list After:  ");
		printList(head);

	}
	static Node head;
	static void setMiddleHead() {
		if (head == null)
			return;
		Node slow = head;
		Node fast = head;
		Node prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = slow.next;
		slow.next = head;
		head = slow;
	}
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	static void printList(Node ptr) {
		while (ptr != null) {
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
		System.out.println();
	}
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

}
