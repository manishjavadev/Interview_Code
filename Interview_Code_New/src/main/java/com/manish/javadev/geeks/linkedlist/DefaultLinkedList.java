package com.manish.javadev.geeks.linkedlist;

public class DefaultLinkedList {
	public static Entity getDefaultLinkedList() {

		Entity root = new Entity(10);
		root.next = new Entity(20);
		root.next.next = new Entity(30);
		root.next.next.next = new Entity(40);
		root.next.next.next.next = new Entity(50);
		root.next.next.next.next.next = new Entity(60);
		//root.next.next.next.next.next.next = new Entity(70);
		//root.next.next.next.next.next.next.next = new Entity(80);
		return root;

	}
}
