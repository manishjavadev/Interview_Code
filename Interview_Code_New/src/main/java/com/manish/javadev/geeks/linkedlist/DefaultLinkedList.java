package com.manish.javadev.geeks.linkedlist;

public class DefaultLinkedList {
	public static Entity getDefaultLinkedList() {

		Entity entity1 = new Entity(10);
		Entity entity2 = new Entity(20);
		Entity entity3 = new Entity(30);
		Entity entity4 = new Entity(40);
		entity1.next = entity2;
		entity2.next = entity3;
		entity3.next = entity4;
		return entity1;

	}

}