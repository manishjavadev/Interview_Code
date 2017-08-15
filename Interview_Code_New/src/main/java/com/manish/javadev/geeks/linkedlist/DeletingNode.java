package com.manish.javadev.geeks.linkedlist;

public class DeletingNode {
	public static Entity start, end;

	public static void deleteAtStart(Entity root) {
		Entity start = root;
		if (start == null) {
			return;
		} else {
			start = start.next;
		}
	}

	public static void deleteAtEnd(Entity root) {
		Entity prev = null, start;
		start = root;
		if (start == null) {
			return;
		}
		while (start.next != null) {
			prev = start;
			start = start.next;
		}
		prev.next = null;
	}

	public static void deleteAtParticularPosition(Entity root, int position) {
		Entity front = root;
		if (root == null)
			return;
		if (position == 0) {
			root = front.next;
			return;
		}
		// Find previous node of the node to be deleted
		for (int i = 0; front != null && i < position - 1; i++) {
			front = front.next;
		}
		if (front == null || front.next == null)
			return;
		front.next = front.next.next; // Unlink the deleted node from list
	}

	public static void display(Entity start) {
		while (start != null) {
			System.out.print(start.data + "\t");
			start = start.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Entity root = DefaultLinkedList.getDefaultLinkedList();
		System.out.println("\nDelete at Start root");
		deleteAtStart(root);
		display(root);

		System.out.println("\nDelete at End");
		root = DefaultLinkedList.getDefaultLinkedList();
		deleteAtEnd(root);
		display(root);
		root = DefaultLinkedList.getDefaultLinkedList();
		deleteAtParticularPosition(root, 3);
		display(root);

	}

}
