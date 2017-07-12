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
		if (start == null) {
			return null;
		}
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

	public static void insertAfterGivenNode(Entity prevNode, int data) {
		Entity newNode = new Entity(data);
		/* 1. Check if the given Node is null */
		if (prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		/* 2. Make next of new Node as next of prev_node */
		newNode.next = prevNode.next;

		/* 3. make next of prev_node as new_node */
		prevNode.next = newNode;
	}

	public static void display(Entity start) {
		while (start != null) {
			System.out.print(start.data + "\t");
			start = start.next;
		}

	}

}
