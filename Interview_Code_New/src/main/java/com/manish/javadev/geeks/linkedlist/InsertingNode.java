package com.manish.javadev.geeks.linkedlist;

public class InsertingNode {
	Entity root = DefaultLinkedList.getDefaultLinkedList();

	public Entity insertAtStart(Entity root, int data) {
		Entity entity = new Entity(data);
		entity.next = root;
		return entity;
	}

	public Entity insertAtEnd(Entity root, int data) {
		Entity node = new Entity(data);
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

	public Entity insertAfterGivenPosition(Entity root, int data, int position) {
		Entity entity = new Entity(data);
		Entity front = root;
		if (front != null && position == 0) {
			entity.next = front.next;
			front.next = entity;
			return root;
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

	public Entity insertAtGivenPosition(Entity root, int data, int position) {
		Entity entity = new Entity(data);
		Entity front = root;

		if (position == 0) {
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

	public Entity updateAtGivenKey(Entity root, int oldValue, int newValue) {
		Entity prev = null, start;
		start = root;

		while (start != null && start.data != oldValue) {
			prev = start;
			start = start.next;
		}
		if (start == null || prev == null) {
			return null;
		}
		start.data = newValue;
		return root;
	}

	public Entity insertAfterGivenNode(Entity prevNode, int data) {
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
		InsertingNode insertingNode = new InsertingNode();

		System.out.println("\nInsert at Start with null root");
		Entity root = insertingNode.insertAtStart(insertingNode.root, 5);
		display(root);

		System.out.println("\nInsert at Start with actual root");
		root = DefaultLinkedList.getDefaultLinkedList();
		root = insertingNode.insertAtStart(insertingNode.root, 5);
		display(root);

		System.out.println("\nInsert at End with actual root");
		root = insertingNode.insertAtEnd(insertingNode.root, 70);
		display(root);

		System.out.println("\nInsert after given node ");
		insertingNode.insertAfterGivenNode(insertingNode.root.next.next, 70);
		display(root);

		System.out.println("\nInsert after given position ");
		Entity rootNode = DefaultLinkedList.getDefaultLinkedList();
		Entity resultRoot = insertingNode.insertAfterGivenPosition(rootNode, 75, 1);
		display(resultRoot);

		System.out.println("\nInsert at given position ");
		root = insertingNode.insertAtGivenPosition(new Entity(10), 70, 1);
		display(root);

		System.out.println("\nUpdate at given position ");
		// updateAtGivenKey(resultRoot, oldValue, newvalue );
		root = DefaultLinkedList.getDefaultLinkedList();
		root = insertingNode.updateAtGivenKey(root, 20, 90);
		display(root);

	}
}
