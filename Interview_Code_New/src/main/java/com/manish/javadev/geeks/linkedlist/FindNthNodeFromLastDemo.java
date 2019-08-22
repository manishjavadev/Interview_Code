package com.manish.javadev.geeks.linkedlist;

public class FindNthNodeFromLastDemo {
	Entity entity = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		FindNthNodeFromLastDemo fnd = new FindNthNodeFromLastDemo();
		// fnd.displayNodes();
		Entity entity = fnd.getNthNodeFromLast(3);
		if (null == entity) {
			System.out.println("Number lesser than entered number");
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

	private Entity getNthNodeFromLast(int nthNode) {
		Entity front = entity;
		int i = 0;
		int len = getLength(entity);
		if (len > nthNode) {
			for (i = 0; i < (len - nthNode); i++) {
				front = front.next;
			}
		} else if (len == nthNode) {
			while (front.next != null) {
				front = front.next;
			}
			return front;
		} else {
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
