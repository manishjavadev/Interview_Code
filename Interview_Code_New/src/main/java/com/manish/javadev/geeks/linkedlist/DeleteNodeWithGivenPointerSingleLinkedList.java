package com.manish.javadev.geeks.linkedlist;

public class DeleteNodeWithGivenPointerSingleLinkedList {

	public static void main(String[] args) {
		Entity entity = DefaultLinkedList.getDefaultLinkedList();
		System.out.println("Before Delete");
		displayNodes(entity);
		deleteGivenNode(entity.next.next);
		System.out.println("\nAfter Delete");
		displayNodes(entity);

	}

	private static void displayNodes(Entity entity) {
		Entity tNode = entity;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}

	}

	private static void deleteGivenNode(Entity node) {
		System.out.println("\nDeleting node ::" + node.data);
		if (node == null) {
			return;
		}
		if (node.next != null) {
			Entity temp = node.next;
			node.data = temp.data;
			node.next = temp.next;
		}
	}
}
