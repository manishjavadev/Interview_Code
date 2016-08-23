package com.manish.javadev.geeks.linkedlist;

public class LinkedListManager {
	public static void main(String[] args) {
		LinkedListManager linkedListManager = new LinkedListManager();
		linkedListManager.doOperation();
	}

	private void doOperation() {
		Entity start = InsertingNode.insertInMiddile(35, 3);
		System.out.println("Insert In middile");
		InsertingNode.display(start);

		start = InsertingNode.insertAtStart(5);
		System.out.println("");
		System.out.println("Insert In Start");
		InsertingNode.display(start);
		start = InsertingNode.insertAtEnd(5);
		System.out.println("");
		System.out.println("Insert At End");
		InsertingNode.display(start);

	}

}
