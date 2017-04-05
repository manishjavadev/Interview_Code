package com.manish.javadev.geeks.linkedlist;

public class FindNthNodeDemo {
	Entity entity = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		FindNthNodeDemo fnd = new FindNthNodeDemo();
		//fnd.displayNodes();
		Entity entity = fnd.getNthNode(3);
		System.out.println("identified node is " + entity.data);
	}

	public void displayNodes() {
		Entity tNode = entity;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	private Entity getNthNode(int nthNode) {
		Entity front = entity;
		int i = 0;
		for (i = 0; i < nthNode - 1; i++) {
			if (front.next == null) {
				System.out.println("There are less node from enter position");
				return null;
			}
			front = front.next;
		}

		return front;
	}

}
