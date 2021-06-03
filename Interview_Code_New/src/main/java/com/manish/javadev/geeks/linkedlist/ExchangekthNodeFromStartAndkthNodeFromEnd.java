package com.manish.javadev.geeks.linkedlist;

/**
 * 
 * Example: if the linked list is 10->20->30->40->50->60->70->80 and k=3 Then
 * linked should be converted to 10->20->60->40->50->30->70->80 Boundary cases
 * had to be handled properly.
 * 
 * @author kmamani
 *
 */
public class ExchangekthNodeFromStartAndkthNodeFromEnd {

	static Entity start = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		int k = 2;
		ExchangekthNodeFromStartAndkthNodeFromEnd swapNodeList = new ExchangekthNodeFromStartAndkthNodeFromEnd();
		System.out.println("Before Swap");
		displayNodes();
		Entity first = start;
		Entity lastref = start;
		Entity firstRef = start;
		for (int i = 0; first != null && i < k - 1; i++) {
			first = first.next;
		}
		firstRef = first;

		while (first.next != null) {
			lastref = lastref.next;
			first = first.next;
		}
		System.out.println("\nPrint " + k + " Node From Last");
		System.out.println(lastref.data);

		swapNode(firstRef.data, lastref.data);
		System.out.println("\nAfter Swap");
		displayNodes();
		System.out.println("Done");

	}

	public static void displayNodes() {
		Entity tNode = start;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	/*
	 * Function to swap Nodes x and y in linked list by changing links
	 */
	private static void swapNode(int first, int second) {
		Entity prevx = null;
		Entity prevy = null;

		Entity currx = start;
		Entity curry = start;
		if (first == second) {
			return;
		}
		// Search for x (keep track of prevX and CurrX)
		while (currx != null && currx.data != first) {
			prevx = currx;
			currx = currx.next;
		}
		// Search for y (keep track of prevY and currY)
		while (curry != null && curry.data != second) {
			prevy = curry;
			curry = curry.next;
		}
		// If either x or y is not present, nothing to do
		if (currx == null || curry == null)
			return;

		// If x is not head of linked list
		if (prevx == null) {
			start = curry;
		} else {
			prevx.next = curry;
		}
		// If y is not head of linked list
		if (prevy == null) {
			start = currx;
		} else {
			prevy.next = currx;
		}
		// Swap next pointers
		Entity tmp = currx.next;
		currx.next = curry.next;
		curry.next = tmp;
	}

}
