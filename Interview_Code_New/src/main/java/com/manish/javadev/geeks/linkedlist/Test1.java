package com.manish.javadev.geeks.linkedlist;

public class Test1 {
	public static void main(String[] args) {
		// 10  20  30  
		Entity entity = DefaultLinkedList.getDefaultLinkedList();
		System.out.println("Before Delete");
		displayNodes(entity);
		deleteGivenNode(entity.next.next);
		System.out.println("\nAfter Delete");
		displayNodes(entity);
	}

	private static Entity deleteGivenNode(Entity node) {
		if(node == null) {
			return null;
		}
		
			Entity temp  = node.next;
			node.data = temp.data;
			node.next = temp.next;
		
		
		return node;
	}

	private static void displayNodes(Entity entity) {
		while (entity != null) {
			System.out.println(entity.data);
			entity = entity.next;
		}
		
	}

}
