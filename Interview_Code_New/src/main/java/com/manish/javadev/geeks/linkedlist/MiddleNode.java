package com.manish.javadev.geeks.linkedlist;

/**
 * Find The Middle of LinkedList
 * 
 * @author Manish Servistava
 *
 */
public class MiddleNode {

	public static void main(String[] args) {
		Entity root = new Entity(10);
		root.next = new Entity(20);
		root.next.next = new Entity(30);
		root.next.next.next = new Entity(40);
		root.next.next.next.next = new Entity(50);
		root.next.next.next.next.next = new Entity(60);
		root.next.next.next.next.next.next = new Entity(70);
		// root.next.next.next.next.next.next.next = new Entity(80);
		Entity result = getMiddleNode(root);
		System.out.println("Middle Node of inkedlist " + result.data);
	}

	private static Entity getMiddleNode(Entity root) {
		Entity fast = root;
		Entity slow = root;

		if (root == null) {
			return null;
		}
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
