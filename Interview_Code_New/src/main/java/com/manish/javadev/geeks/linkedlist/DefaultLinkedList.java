package com.manish.javadev.geeks.linkedlist;

public class DefaultLinkedList {
	public static Entity getDefaultLinkedList() {

		Entity entity1 = new Entity(10);
		Entity entity2 = new Entity(20);
		Entity entity3 = new Entity(30);
		Entity entity4 = new Entity(40);
		Entity entity5 = new Entity(50);
		Entity entity6 = new Entity(60);
		entity1.next = entity2;
		entity2.next = entity3;
		entity3.next = entity4;
		entity4.next = entity5;
		entity5.next = entity6;
		return entity1;

	}

}
