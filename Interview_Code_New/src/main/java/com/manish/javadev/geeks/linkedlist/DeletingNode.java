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

	public Entity deleteGivenKey(Entity root, int data) {
		Entity prev = null, start;
		start = root;
		if (start == null) {
			return null;
		}
		while (start != null && start.data != data) {
			prev = start;
			start = start.next;
		}
		prev.next = start.next;
		return root;
	}

	public Entity deleteAtParticularPosition(Entity root, int position) {
		Entity front = root;
		if (root == null)
			return null;
		if (position == 0) {
			root = front.next;
			return root;
		}
		// Find previous node of the node to be deleted
		for (int i = 0; front != null && i < position - 1; i++) {
			front = front.next;
		}
		if (front == null || front.next == null)
			return null;
		front.next = front.next.next; // Unlink the deleted node from list
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
		Entity root = deletingNode.deleteAtStart(deletingNode.root);
		display(root);

		System.out.println("\nDelete at End");
		root = deletingNode.deleteAtEnd(deletingNode.root);
		display(root);

		System.out.println("\nDelete at 0 position");
		root = deletingNode.deleteAtParticularPosition(deletingNode.root, 0);
		display(root);

		System.out.println("\nDelete at 3 position");
		root = deletingNode.deleteAtParticularPosition(null, 3);
		display(root);

		System.out.println("\nDelete particular key like 30");
		root = deletingNode.deleteGivenKey(null, 30);
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
