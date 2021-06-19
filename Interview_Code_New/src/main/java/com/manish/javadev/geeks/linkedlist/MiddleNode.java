package com.manish.javadev.geeks.linkedlist;

/**
 * Find The Middle of LinkedList
 * 
 * @author Manish Servistava
 *
 */
public class MiddleNode {

	public static void main(String[] args) {
		Entity entity = DefaultLinkedList.getDefaultLinkedList();
		Entity result = getMiddleNode(entity);
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
