package com.manish.javadev.geeks.linkedlist;

public class DeletingNode {
	public static Entity start, end;

	public static Entity deleteAtStart(int data) {
		start = DefaultLinkedList.getDefaultLinkedList();
		if (start == null) {
			return null;
		} else if (start.data == data) {
			start = start.next;
		}
		return start;
	}

	@SuppressWarnings("unused")
	public static Entity deleteAtParticularPosition(int position) {
		start = DefaultLinkedList.getDefaultLinkedList();
		Entity front = start;
		for (int i = 0; i < position - 1; i++) {
			while (front.next == null) {
				System.out
						.println("There are less element from entered position");
			}
			front = front.next;
			break;
		}
		front.next = front.next.next;

		return start;
	}

	public static Entity deleteInMiddile(int data) {
		start = DefaultLinkedList.getDefaultLinkedList();
		Entity front = start;
		Entity prev = null;
		if (front != null && front.data == data) {
			front = front.next;
		}
		while (front != null && front.data != data) {
			prev = front;
			front = front.next;
		}
		if (front == null) {
			return null;
		}
		prev.next = front.next;
		return start;
	}

	public static void display(Entity start) {
		while (start != null) {
			System.out.print(start.data + "\t");
			start = start.next;
		}

	}

}
