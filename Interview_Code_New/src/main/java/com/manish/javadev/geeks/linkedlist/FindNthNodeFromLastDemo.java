package com.manish.javadev.geeks.linkedlist;

public class FindNthNodeFromLastDemo {

	public static void main(String[] args) {
		FindNthNodeFromLastDemo fnd = new FindNthNodeFromLastDemo();
		// fnd.displayNodes();
		Entity entity = fnd.getNthNodeFromLast(3);
		if (null == entity) {
			System.out.println("Linkedlist smaller than nth entered number");
		} else {
			System.out.println("identified node is " + entity.data);
		}

	}

	public void displayNodes() {
		Entity tNode = DefaultLinkedList.getDefaultLinkedList();
		;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	private Entity getNthNodeFromLast(int nthNode) {
		Entity front = DefaultLinkedList.getDefaultLinkedList();
		int i = 0;
		int len = getLength(front);
		// check if value of n is not more than length of the linked list
		if (len < nthNode) {
			return null;
		}
		// get the (len-n+1)th node from the beginning
		for (i = 0; front != null && i < (len - nthNode); i++) {
			front = front.next;
		}
		if (front == null) {
			return null;
		}
		return front;
	}

	private int getLength(Entity root) {
		int count = 0;
		while (root != null) {
			count++;
			root = root.next;
		}
		return count;
	}
}
