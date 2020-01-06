package com.manish.javadev.geeks.linkedlist;

/**
 * Write a function to get the intersection point of two Linked Lists. There are
 * two singly linked lists in a system. By some programming error the end node
 * of one of the linked list got linked into the second list, forming a inverted
 * Y shaped list. Write a program to get the point where two linked list merge.
 * 
 * @author m.d.srivastava
 * 
 */
public class IntersectionPointOfTwoLinkedList {

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private Node getNode() {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;

		if (c1 > c2) {
			d = c1 - c2;
			return getIntersectionNode(d, head1, head2);
		} else {
			d = c2 - c1;
			return getIntersectionNode(d, head2, head1);
		}
	}

	/*
	 * function to get the intersection point of two linked lists head1 and
	 * head2 where head1 has d more nodes than head2
	 */
	private Node getIntersectionNode(int d, Node node1, Node node2) {
		int i;
		Node current1 = node1;
		Node current2 = node2;
		for (i = 0; i < d && current1 != null; i++) {
			current1 = current1.next;
		}
		while (current1 != null && current2 != null) {
			if (current1.data == current2.data) {
				return current1;
			}
			current1 = current1.next;
			current2 = current2.next;
		}
		return null;
	}

	/*
	 * Takes head pointer of the linked list and returns the count of nodes in
	 * the list
	 */
	int getCount(Node node) {
		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	public static void main(String[] args) {
		IntersectionPointOfTwoLinkedList list = new IntersectionPointOfTwoLinkedList();

		// creating first linked list
		list.head1 = new Node(10);
		list.head1.next = new Node(20);
		list.head1.next.next = new Node(30);
		list.head1.next.next.next = new Node(40);
		list.head1.next.next.next.next = new Node(50);
		list.head1.next.next.next.next.next = new Node(60);
		list.head1.next.next.next.next.next.next = new Node(70);

		// creating second linked list
		list.head2 = new Node(35);
		list.head2.next = new Node(40);
		list.head2.next.next = new Node(50);
		list.head2.next.next.next = new Node(60);
		list.head2.next.next.next.next = new Node(70);

		System.out.println("The node of intersection is " + list.getNode().data);

	}

}
