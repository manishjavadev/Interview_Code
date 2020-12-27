package com.manish.javadev.geeks.linkedlist;

public class LinkedListHasCycle {
	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	public boolean hashCycle(Node rootNode) {
		// list is empty.
		if (rootNode == null)
			return false;
		// create two references.
		Node slow, fast;

		// make both refer to the start of the list.
		slow = fast = rootNode;

		while (true) {
			// 1 move.
			slow = slow.next;
			// 2 move.
			if (fast.next != null) {
				fast = fast.next.next;
			} else {
				// next node is null no cycle in list.
				return false;
			}
			// If slow and fast overlaps then we have cycle in list
			if (slow == fast)
				return true;
		}
	}

	public static void main(String[] args) {
		Node rootNode = new Node(1);
		rootNode.next = new Node(2);
		rootNode.next.next = new Node(3);
		Node cycleNode = new Node(4);
		rootNode.next.next.next = cycleNode;
		rootNode.next.next.next.next = new Node(5);
		rootNode.next.next.next.next.next = new Node(6);
		rootNode.next.next.next.next.next.next = new Node(7);
		rootNode.next.next.next.next.next.next.next = cycleNode;
		LinkedListHasCycle llhc = new LinkedListHasCycle();
		boolean result = llhc.hashCycle(rootNode);
		System.out.println("Linked List Hash Cycle   = " + result);
	}
}
