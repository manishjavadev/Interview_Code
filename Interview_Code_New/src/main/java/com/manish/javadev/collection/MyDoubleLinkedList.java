package com.manish.javadev.collection;

/**
 * @author Manish
 *
 */
/**
 * This program creating double linked list , and have two methods create the
 * node and also iterating the Linked List
 */
public class MyDoubleLinkedList {

	Element start, end;

	public static void main(String[] args) {
		// Here i am creating the object of MyDoubleLinkedList
		MyDoubleLinkedList mdl = new MyDoubleLinkedList();
		mdl.createNode(10);
		mdl.createNode(20);
		mdl.createNode(30);
		mdl.createNode(40);
		mdl.iterate();
	}

	// createNode(Object data)
	public void createNode(Object data) {
		Element node = new Element(data);
		if (start == null)
			start = node;
		else {
			end.right = node;
			node.left = end;
		}
		end = node;
	}

	// Iterate the double linked list
	public void iterate() {
		Element e = start;
		while (e != null) {
			System.out.println(e.data);
			e = e.right;
		}
	}
}

class Element {
	public Element left, right;
	Object data;

	public Element(Object data) {
		this.data = data;
	}
}
