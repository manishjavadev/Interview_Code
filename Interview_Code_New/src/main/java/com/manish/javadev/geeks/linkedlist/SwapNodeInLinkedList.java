package com.manish.javadev.geeks.linkedlist;

public class SwapNodeInLinkedList {
	Entity entity = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		SwapNodeInLinkedList swapNodeList = new SwapNodeInLinkedList();
		swapNodeList.doSwap();
	}

	private void doSwap() {
		System.out.println("Before Swap");
		displayNodes();
		int first = 20;
		int second = 40;
		System.out.println("\nWe are going to swap " + first + "  and "
				+ second);
		swapNode(20, 40);
		System.out.println("\nAfter Swap");
		displayNodes();

	}

	public void displayNodes() {
		Entity tNode = entity;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	private void swapNode(int first, int second) {
		Entity prevx = null;
		Entity prevy = null;

		Entity currx = entity;
		Entity curry = entity;
		if (first == second) {
			return;
		}
		while (currx != null && currx.data != first) {
			prevx = currx;
			currx = currx.next;
		}
		while (curry != null && curry.data != second) {
			prevy = curry;
			curry = curry.next;
		}
		if (prevx != null) {
			prevx.next = curry;
		} else {
			entity = curry;
		}
		if (prevy != null) {
			prevy.next = currx;
		} else {
			entity = currx;
		}
		Entity temEntity = currx.next;
		currx.next = curry.next;
		curry.next = temEntity;

	}

}
