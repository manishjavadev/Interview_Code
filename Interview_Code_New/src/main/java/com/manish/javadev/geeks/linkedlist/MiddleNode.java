package com.manish.javadev.geeks.linkedlist;

public class MiddleNode {
	Entity entity = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		MiddleNode middleNode = new MiddleNode();
		Entity entity = middleNode.getMiddleNode();
		System.out.println("Middle Node of inkedlist " + entity.data);
	}

	private Entity getMiddleNode() {
		int counter = 0;
		Entity entity = this.entity;
		Entity middle = this.entity;
		while (entity.next != null) {
			counter++;
			if (counter % 2 == 0) {
				middle = middle.next;
			}
			entity = entity.next;
		}
		return middle;
	}

}
