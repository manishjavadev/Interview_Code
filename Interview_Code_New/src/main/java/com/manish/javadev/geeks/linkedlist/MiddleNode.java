package com.manish.javadev.geeks.linkedlist;
/**
 * Find The Middle of LinkedList
 * 
 * @author Manish Servistava
 *
 */
public class MiddleNode {

	public static void main(String[] args) {
		Entity entity = DefaultLinkedList.getDefaultLinkedList();
		Entity result = getMiddleNode(entity);
		System.out.println("Middle Node of inkedlist " + result.data);
	}

	private static Entity getMiddleNode(Entity root) {
		int counter = 0;
		Entity entity = root;
		Entity middle = root;

		if (root == null) {
			return null;
		}
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
