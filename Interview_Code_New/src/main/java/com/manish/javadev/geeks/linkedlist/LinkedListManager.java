package com.manish.javadev.geeks.linkedlist;

public class LinkedListManager {
	public static void main(String[] args) {
		LinkedListManager linkedListManager = new LinkedListManager();
		linkedListManager.doOperation();
	}

	private void doOperation() {
		Entity start = InsertingNode.insertInMiddile(35, 3);
		InsertingNode.display(start);

	}

}
