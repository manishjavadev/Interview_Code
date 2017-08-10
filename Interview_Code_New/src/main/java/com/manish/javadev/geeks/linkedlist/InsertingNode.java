package com.manish.javadev.geeks.linkedlist;

public class InsertingNode {
	public static Entity root, end;

	public static Entity insertAtStart(int data) {
		Entity node = new Entity(data);
		root = DefaultLinkedList.getDefaultLinkedList();
		if (root == null) {
			root = node;
		} else {
			node.next = root;
			root = node;
		}
		return root;
	}

	public static Entity insertAtEnd(int data) {
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

	public static boolean insertInMiddile(Entity root, int data, int after) {
		Entity entity = new Entity(data);
		if (root == null) {
			return false;
		}
		Entity front = root;
		for (int i = 0; i < after - 1; i++) {
			if (front == null) {
				System.out.println("There are less from enter position");
				return false;
			}
			front = front.next;
		}
		entity.next = front.next;
		front.next = entity;

		return true;
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

	public static void main(String[] args) {
		Entity rootNode = new Entity(10);
		rootNode.next = new Entity(20);
		rootNode.next.next = new Entity(30);
		rootNode.next.next.next = new Entity(40);
		rootNode.next.next.next.next = new Entity(50);
		rootNode.next.next.next.next.next = new Entity(60);
		insertInMiddile(rootNode, 70, 3);
		display(rootNode);
	}

}
