package com.manish.javadev.geeks.linkedlist;

public class FindNthNodeFromLastDemo {
	Entity entity = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		FindNthNodeFromLastDemo fnd = new FindNthNodeFromLastDemo();
		fnd.displayNodes();
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
		int len = getLength(entity);
		for (i = 0; i < (len - nthNode + 1) - 1; i++) {
			front = front.next;
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
