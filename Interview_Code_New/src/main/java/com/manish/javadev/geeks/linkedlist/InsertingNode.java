package com.manish.javadev.geeks.linkedlist;

import java.util.Scanner;

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

		for (int i = 0; front != null && i < position - 1; i++) {
			front = front.next;
		}
		if (front == null) {
			return null;
		}
		entity.next = front.next;
		front.next = entity;

		return root;
	}

	public Entity insertAtGivenPosition(Entity root, int data, int position) {
		Entity entity = new Entity(data);
		Entity prev = null;
		Entity front = root;

		if (position == 1) {
			entity.next = root;
			return entity;
		}
		for (int i = 0; front != null && i < position - 1; i++) {
			prev = front;
			front = front.next;
		}
		if (front == null) {
			return null;
		}
		entity.next = prev.next;
		prev.next = entity;

		return root;
	}

	public Entity updateAtGivenKey(Entity root, int oldValue, int newValue) {
		Entity front = null;
		front = root;

		while (front != null && front.data != oldValue) {
			front = front.next;
		}
		if (front == null) {
			return null;
		}
		front.data = newValue;
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
		Entity root = null;
		Entity rootNode = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for insert at start");
		System.out.println("Enter 2 for insert at end");
		System.out.println("Enter 3 for insert after given node");
		System.out.println("Enter 4 for insert after given position");
		System.out.println("Enter 5 for insert at given position");
		System.out.println("Enter 6 to Update at given position");
		int decider = sc.nextInt();
		if (decider == 1) {
			System.out.println("\nInsert at Start with null root");
			root = insertingNode.insertAtStart(insertingNode.root, 5);
			display(root);
		}
		if (decider == 2) {
			System.out.println("\nInsert at End with actual root");
			root = insertingNode.insertAtEnd(insertingNode.root, 70);
			display(root);
		}
		if (decider == 3) {
			System.out.println("\nInsert after given node ");
			insertingNode.insertAfterGivenNode(insertingNode.root.next.next, 70);
			display(root);
		}
		if (decider == 4) {
			System.out.println("\nInsert after given position ");
			rootNode = DefaultLinkedList.getDefaultLinkedList();
			Entity resultRoot = insertingNode.insertAfterGivenPosition(rootNode, 5, 1);
			display(resultRoot);
		}
		if (decider == 5) {
			System.out.println("\nInsert at given position ");
			rootNode = DefaultLinkedList.getDefaultLinkedList();
			root = insertingNode.insertAtGivenPosition(rootNode, 40, 1);
			display(root);
		}

		if (decider == 6) {
			System.out.println("\nUpdate at given position ");
			// updateAtGivenKey(resultRoot, oldValue, newvalue );
			root = DefaultLinkedList.getDefaultLinkedList();
			root = insertingNode.updateAtGivenKey(root, 20, 90);
			display(root);
		}
	}
}
