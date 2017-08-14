package com.manish.javadev.geeks.linkedlist;

public class DeletingNode {
	public static Entity start, end;

	public static Entity deleteAtStart(Entity root) {
		Entity start = root;
		if (start == null) {
			return null;
		} else {
			start = start.next;
		}
		return start;
	}

	public static Entity deleteAtEnd(Entity root) {
		Entity prev = null, start;
		start = root;
		if (start == null) {
			return null;
		}
		while (start.next != null) {
			prev = start;
			start = start.next;
		}
		prev.next = null;
		return root;
	}

	public static Entity deleteAtParticularPosition(Entity root, int position) {
		Entity front = root;
		Entity prev = null;
		for (int i = 0; i < position - 1; i++) {
			if (front.next == null) {
				System.out
						.println("There are less element from entered position");
				return null;
			}
			prev = front;
			front = front.next;
		}
		prev.next = front.next;
		return root;
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
		root = deleteAtStart(root);
		display(root);

		System.out.println("\nDelete at End");
		root = DefaultLinkedList.getDefaultLinkedList();
		root = deleteAtEnd(root);
		display(root);
		root = DefaultLinkedList.getDefaultLinkedList();
		root = deleteAtParticularPosition(root, 7);
		display(root);

	}

}
