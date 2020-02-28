package com.manish.javadev.geeks.linkedlist;

/**
 * http://www.geeksforgeeks.org/swap-nodes-in-a-linked-list-without-swapping-
 * data/
 * 
 * 
 * Swap nodes in a linked list without swapping data Given a linked list and two
 * keys in it, swap nodes for two given keys. Nodes should be swapped by
 * changing links. Swapping data of nodes may be expensive in many situations
 * when data contains many fields.
 * 
 * It may be assumed that all keys in linked list are distinct.
 * 
 * Examples:
 * 
 * Input: 10->15->12->13->20->14, x = 12, y = 20 Output: 10->15->20->13->12->14
 * 
 * Input: 10->15->12->13->20->14, x = 10, y = 20 Output: 20->15->12->13->10->14
 * 
 * Input: 10->15->12->13->20->14, x = 12, y = 13 Output: 10->15->13->12->20->14
 * This may look a simple problem, but is interesting question as it has
 * following cases to be handled. 1) x and y may or may not be adjacent. 2)
 * Either x or y may be a head node. 3) Either x or y may be last node. 4) x
 * and/or y may not be present in linked list.
 * 
 * How to write a clean working code that handles all of the above
 * possibilities.
 * 
 * We strongly recommend to minimize your browser and try this yourself first.
 * 
 * The idea it to first search x and y in given linked list. If any of them is
 * not present, then return. While searching for x and y, keep track of current
 * and previous pointers. First change next of previous pointers, then change
 * next of current pointers. Java implementations of this approach.
 * 
 * 
 * 
 * @author m.d.srivastava
 * 
 */
public class SwapNodeInLinkedList {
	Entity start = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		SwapNodeInLinkedList swapNodeList = new SwapNodeInLinkedList();
		swapNodeList.doSwap();
	}

	private void doSwap() {
		System.out.println("Before Swap");
		displayNodes();
		int first = 20;
		int second = 40;
		System.out.println("\nWe are going to swap " + first + "  and " + second);
		swapNode(20, 40);
		System.out.println("\nAfter Swap");
		displayNodes();

	}

	public void displayNodes() {
		Entity tNode = start;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	/*
	 * Function to swap Nodes x and y in linked list by changing links
	 */
	private void swapNode(int first, int second) {
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
