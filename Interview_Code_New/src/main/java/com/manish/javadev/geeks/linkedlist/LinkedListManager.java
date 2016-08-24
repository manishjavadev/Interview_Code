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

		System.out.println("===================");
		start = DefaultLinkedList.getDefaultLinkedList();
		System.out.println("Original List");
		InsertingNode.display(start);
		start = DeletingNode.deleteAtStart(10);
		System.out.println("");
		System.out.println("Deleted At Start");
		InsertingNode.display(start);

		start = DefaultLinkedList.getDefaultLinkedList();
		System.out.println("Original List");
		InsertingNode.display(start);
		start = DeletingNode.deleteInMiddile(40);

		System.out.println("");
		System.out.println("Delete At middile");
		InsertingNode.display(start);

		start = DefaultLinkedList.getDefaultLinkedList();
		System.out.println("Original List");
		InsertingNode.display(start);
		start = DeletingNode.deleteAtParticularPosition(3);

		System.out.println("");
		System.out.println("Delete At position");
		InsertingNode.display(start);

		start = DefaultLinkedList.getDefaultLinkedList();
		System.out.println("Original List");

		InsertingNode.display(start);
		int result = LengthOfLinkedListRecursive
				.findLengthUsingRecursive(start);

		System.out.println("");
		System.out.println("Getting length of LinkedList");
		System.out.println("Lenght = " + result);
		InsertingNode.display(start);

		start = DefaultLinkedList.getDefaultLinkedList();
		System.out.println("Original List");

		InsertingNode.display(start);
		result = LengthOfLinkedListRecursive.findLengthUsingIterative(start);

		System.out.println("");
		System.out.println("Getting length of LinkedList");
		System.out.println("Lenght = " + result);
		InsertingNode.display(start);

	}

}
