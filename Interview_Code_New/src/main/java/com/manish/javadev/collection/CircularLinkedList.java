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
		if (last == null) {
			last = e;
			e.next = last;
		} else {
			e.next = last.next;
			last.next = e;
		}
	}

	public void addAfter(Object data, int pos) {
		Node e = new Node(data);
		Node frontLast = last.next;
		for (int i = 0; frontLast != null && i < pos - 1; i++) {
			frontLast = frontLast.next;
		}

		if (frontLast == null) {
			return;
		}

		e.next = frontLast.next;
		frontLast.next = e;
		if (frontLast == last) {
			last = e;
		}
	}

}
