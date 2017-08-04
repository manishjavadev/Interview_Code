package com.manish.javadev.geeks.linkedlist;

public class LinkedlistRecursiveReverse {
	static Entity head;

	public static void main(String[] args) {
		Entity rootNode = new Entity(10);
		rootNode.next = new Entity(20);
		rootNode.next.next = new Entity(30);
		rootNode.next.next.next = new Entity(40);
		rootNode.next.next.next.next = new Entity(50);
		rootNode.next.next.next.next.next = new Entity(60);
		rootNode = reverseUtil(rootNode, null);
		displayNodes(rootNode);

	}

	public static void displayNodes(Entity entity) {
		Entity front = entity;
		while (front != null) {
			System.out.print(front.data + " ");
			front = front.next;
		}
	}

	// A simple and tail recursive function to reverse
	// a linked list. prev is passed as NULL initially.
	static Entity reverseUtil(Entity curr, Entity prev) {
		/* If last node mark it head */
		if (curr.next == null) {
			head = curr;
			/* Update next to prev node */
			curr.next = prev;
			return head;
		}

		/* Save curr->next node for recursive call */
		Entity next = curr.next;

		/* and update next .. */
		curr.next = prev;

		return reverseUtil(next, curr);
	}
}
