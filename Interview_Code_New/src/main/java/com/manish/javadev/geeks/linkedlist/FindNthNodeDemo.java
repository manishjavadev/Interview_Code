package com.manish.javadev.geeks.linkedlist;

public class FindNthNodeDemo {
	Entity entity = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		FindNthNodeDemo fnd = new FindNthNodeDemo();
		// fnd.displayNodes();
		Entity entity = fnd.getNthNode(3);
		if (entity == null) {
			System.out.println("Linked List is smaller than searching node");
		} else {
			System.out.println("identified node is " + entity.data);
		}
	}

	public void displayNodes() {
		Entity tNode = entity;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	private Entity getNthNode(int nthNode) {
		Entity front = DefaultLinkedList.getDefaultLinkedList();
		for (int i = 0; front != null && i < nthNode - 1; i++) {
			front = front.next;
		}
		if (front == null) {
			return null;
		}
		return front;
	}

}
