package com.manish.javadev.geeks.linkedlist;

public class InsertingNode {
	public static Entity root, end;

	public static Entity insertAtStart(Entity root, int data) {
		Entity entity = new Entity(data);
		entity.next = root;
		return entity;
	}

	public static Entity insertAtEnd(Entity root, int data) {
		Entity node = new Entity(data);
		root = DefaultLinkedList.getDefaultLinkedList();
		Entity front = root;
		if (root == null) {
			return node;
		}
		while (front.next != null) {
			front = front.next;
		}
		front.next = node;
		return root;
	}

	public static Entity insertAfterGivenPosition(Entity root, int data,
			int position) {
		Entity entity = new Entity(data);
		if (root != null && position == 0) {
			entity.next = root.next;
			root.next = entity;
			return root;
		}
		Entity front = root;
		for (int i = 0; front != null && i < position - 1; i++) {
			front = front.next;
		}
		if (front == null || root.next == null) {
			return null;

		}
		entity.next = front.next;
		front.next = entity;

		return root;
	}

	public static Entity insertAtGivenPosition(Entity root, int data,
			int position) {
		Entity entity = new Entity(data);
		Entity front = root;
		if (root == null && position == 0) {
			root = entity;
			return root;
		}
		if (root != null && position == 0) {
			entity.next = root;
			return entity;
		}

		for (int i = 0; front != null && i < position - 1; i++) {
			front = front.next;
		}
		if (front == null || front.next == null) {
			return null;
		}
		entity.next = front.next;
		front.next = entity;

		return root;
	}

	public static Entity insertAfterGivenNode(Entity prevNode, int data) {
		Entity newNode = new Entity(data);
		/* 1. Check if the given Node is null */
		if (prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return null;
		}

		/* 2. Make next of new Node as next of prev_node */
		newNode.next = prevNode.next;

		/* 3. make next of prev_node as new_node */
		prevNode.next = newNode;
		return prevNode;
	}

	public static void display(Entity root) {
		Entity start = root;
		while (start != null) {
			System.out.print(start.data + "\t");
			start = start.next;
		}

	}

	public static void main(String[] args) {
		Entity root = DefaultLinkedList.getDefaultLinkedList();
		System.out.println("\nInsert at Start with null root");
		root = insertAtStart(null, 5);
		display(root);

		System.out.println("\nInsert at Start with actual root");
		root = DefaultLinkedList.getDefaultLinkedList();
		root = insertAtStart(root, 5);
		display(root);

		System.out.println("\nInsert at End with actual root");
		root = DefaultLinkedList.getDefaultLinkedList();
		root = insertAtEnd(root, 70);
		display(root);

		System.out.println("\nInsert after given node ");
		root = DefaultLinkedList.getDefaultLinkedList();
		insertAfterGivenNode(root.next.next, 70);
		display(root);

		System.out.println("\nInsert after given position ");
		root = DefaultLinkedList.getDefaultLinkedList();
		root = insertAfterGivenPosition(root, 70, 7);
		display(root);

		System.out.println("\nInsert at given position ");
		root = DefaultLinkedList.getDefaultLinkedList();
		root = insertAtGivenPosition(new Entity(10), 70, 1);
		display(root);
	}

}
