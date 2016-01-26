package com.manish.javadev.collection;

class Node {
	Object data;
	Node next;

	public Node(Object data) {
		this.data = data;
	}
}

public class CircularLinkedList {
	Node last = null;

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.createList(20);
		cll.createList(30);
		cll.createList(40);
		cll.createList(50);
		cll.createList(60);

	}

	private void createList(Object data) {
		Node e = new Node(data);
		e.data = data;
		if (last == null) {
			last = e;
			e.next = last;
		} else {
			e.next = last.next;
			last.next = e;
			last = e;
		}
	}

	public void addBegning(Object data) {
		Node e = new Node(data);
		e.data = data;
		e.next = last.next;
		last.next = e;
	}

	public void addAfter(Object data, int pos) {
		Node e = new Node(data);
		e.data = data;
		Node em = last.next;
		for (int i = 0; i < pos - 1; i++) {
			if (em.next == last.next) {
				return;
			}
			em = em.next;
		}

		e.next = em.next;
		em.next = e;
		if (em == last) {
			last = e;
		}
	}

}
