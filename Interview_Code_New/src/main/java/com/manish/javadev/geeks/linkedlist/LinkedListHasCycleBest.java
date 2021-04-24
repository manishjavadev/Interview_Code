package com.manish.javadev.geeks.linkedlist;

public class LinkedListHasCycleBest {
	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private static boolean hashCycle(Node root) {
		Node fast = root;
		Node slow = root;

		if (root == null) {
			return false;
		}
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
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
		boolean result = LinkedListHasCycleBest.hashCycle(rootNode);
		System.out.println("Linked List Hash Cycle   = " + result);
	}
}
