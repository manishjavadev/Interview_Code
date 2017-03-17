package com.manish.javadev.geeks.linkedlist;

public class InsertingNode {
	public static Entity start, end;

	public static Entity insertAtStart(int data) {
		Entity node = new Entity(data);
		start = DefaultLinkedList.getDefaultLinkedList();
		if (start == null) {
			start = node;
		} else {
			node.next = start;
			start = node;
		}
		return start;
	}

	public static Entity insertAtEnd(int data) {
		Entity node = new Entity(data);
		start = DefaultLinkedList.getDefaultLinkedList();
		Entity front = start;
		if (start == null) {
			start = node;
		} else {
			while (front.next != null) {
				front = front.next;
			}
			front.next = node;
		}
		end = node;
		return start;
	}

	public static Entity insertInMiddile(int data, int after) {
		Entity entity = new Entity(data);
		start = DefaultLinkedList.getDefaultLinkedList();
		Entity front = start;
		for (int i = 0; i < after - 1; i++) {
			if (front.next == null) {
				System.out.println("There are less from enter position");
				return start;
			}
			front = front.next;
		}
		entity.next = front.next;
		front.next = entity;

		return start;
	}

	public static void display(Entity start) {
		while (start != null) {
			System.out.print(start.data + "\t");
			start = start.next;
		}

	}

}
