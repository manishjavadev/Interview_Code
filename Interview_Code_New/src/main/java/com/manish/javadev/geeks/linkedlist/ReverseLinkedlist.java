package com.manish.javadev.geeks.linkedlist;
/**
 * Reverse The LinkedList
 * @author Manish Servistava
 *
 */
public class ReverseLinkedlist {

	public static void main(String[] args) {
		Entity root = DefaultLinkedList.getDefaultLinkedList();
		displayNodes(root);
		System.out.println("\nAfter Reverse Display Agian");
		root = reverseNodes(root);
		displayNodes(root);

	}

	public static void displayNodes(Entity root) {
		Entity tNode = root;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	private static Entity reverseNodes(Entity root) {
		Entity prev = null;
		Entity curr = root;
		Entity next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return root = prev;
	}
}
