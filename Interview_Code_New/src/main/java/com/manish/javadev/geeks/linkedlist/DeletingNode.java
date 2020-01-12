package com.manish.javadev.geeks.linkedlist;

public class DeletingNode {
	public static Entity start, end;
	Entity root = DefaultLinkedList.getDefaultLinkedList();

	public Entity deleteAtStart(Entity root) {
		if (root == null)
			return root;
		else
			root = root.next;
		return root;
	}

	public Entity deleteAtEnd(Entity root) {
		Entity prev = null, front;
		front = root;
		if (front == null || front.next == null) {
			return null;
		}
		while (front.next != null) {
			prev = front;
			front = front.next;
		}

		prev.next = front.next;
		return root;
	}

	public Entity deleteGivenKey(Entity root, int data) {
		Entity prev = null, front;
		front = root;
		if (front != null && front.data == data) {
			return front.next;
		}
		while (front != null && front.data != data) {
			prev = front;
			front = front.next;
		}
		if (front == null) {
			return null;
		}
		prev.next = front.next;
		return root;
	}

	public Entity deleteAtParticularPosition(Entity root, int position) {
		Entity prev = null;
		Entity front = root;
		if (front != null || position == 1)
			return front.next;
		for (int i = 0; front != null && i < position - 1; i++) {
			prev = front;
			front = front.next;
		}
		if (front == null)
			return null;
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
		DeletingNode deletingNode = new DeletingNode();

		System.out.println("\nDelete at Start root");
		Entity root = deletingNode.deleteAtStart(DefaultLinkedList.getDefaultLinkedList());
		display(root);

		System.out.println("\nDelete at End");
		root = deletingNode.deleteAtEnd(DefaultLinkedList.getDefaultLinkedList());
		display(root);

		System.out.println("\nDelete at 0 position");
		root = deletingNode.deleteAtParticularPosition(DefaultLinkedList.getDefaultLinkedList(), 0);
		display(root);

		System.out.println("\nDelete at 3 position");
		root = deletingNode.deleteAtParticularPosition(DefaultLinkedList.getDefaultLinkedList(), 3);
		display(root);

		System.out.println("\nDelete at 2 position");
		root = deletingNode.deleteAtParticularPosition(DefaultLinkedList.getDefaultLinkedList(), 2);
		display(root);

		System.out.println("\nDelete at 1 position");
		root = deletingNode.deleteAtParticularPosition(DefaultLinkedList.getDefaultLinkedList(), 1);
		display(root);

		System.out.println("\nDelete particular key like 20");
		root = deletingNode.deleteGivenKey(DefaultLinkedList.getDefaultLinkedList(), 20);
		display(root);

	}
	/**
	 * 
	 * Delete at Start root 20 30 40 50 60
	 * 
	 * Delete at End 10 20 30 40 50
	 * 
	 * Delete at 0 position 20 30 40 50
	 * 
	 * Delete at 3 position
	 * 
	 * 
	 * Delete particular key like 30
	 * 
	 */

}
