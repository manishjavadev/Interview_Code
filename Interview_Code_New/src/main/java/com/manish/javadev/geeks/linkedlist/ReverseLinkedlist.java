package com.manish.javadev.geeks.linkedlist;

public class ReverseLinkedlist {
	Entity entity = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		ReverseLinkedlist revLinkedList = new ReverseLinkedlist();
		revLinkedList.displayNodes();
		System.out.println("\nAfter Reverse Display Agian");
		revLinkedList.reverseNodes();
		revLinkedList.displayNodes();

	}

	public void displayNodes() {
		Entity tNode = entity;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	private void reverseNodes() {
		Entity p1, p2, p3 = null;
		p1 = entity;
		p2 = p1.next;
		p3 = p2.next;
		p1.next = null;
		p2.next = p1;
		while (p3 != null) {
			p1 = p2;
			p2 = p3;
			p3 = p3.next;
			p2.next = p1;
		}
		entity = p2;

	}

}
