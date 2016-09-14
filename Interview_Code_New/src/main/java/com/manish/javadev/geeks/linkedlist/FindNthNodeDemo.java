package com.manish.javadev.geeks.linkedlist;

public class FindNthNodeDemo {
	Entity entity = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		FindNthNodeDemo fnd = new FindNthNodeDemo();
		fnd.displayNodes();
		int result = fnd.getNthNode(2);
		System.out.println("identified node is " + result);
	}

	public void displayNodes() {
		Entity tNode = entity;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	private int getNthNode(int nthNode) {
		Entity start = entity;
		int i = 0;
		for (i = 0; i < nthNode - 1; i++) {
			if (start == null) {
				System.out
						.println("Linked list node number is less than entered number");
			}
			start = start.next;
		}

		return start.data;
	}

}
