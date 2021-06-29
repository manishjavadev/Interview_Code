package com.manish.javadev.geeks.linkedlist;

/**
 * Pre-requisite 1) Merge Two sorted List code
 * https://www.youtube.com/watch?v=6vFEuO1pfJA
 * 
 * 2) FInd the middle of linked list code
 * https://www.youtube.com/watch?v=jEfzUFcgGkk
 * 
 * https://www.youtube.com/watch?v=DEvWhHgBjL0
 * 
 * 
 * @author kmamani
 *
 */
public class SortLinkedList {

	// Driver Code
	public static void main(String[] args) {
		Node head = new Node(7);
		Node temp = head;
		temp.next = new Node(10);
		temp = temp.next;
		temp.next = new Node(5);
		temp = temp.next;
		temp.next = new Node(20);
		temp = temp.next;
		temp.next = new Node(3);
		temp = temp.next;
		temp.next = new Node(2);
		temp = temp.next;
		System.out.print("\nBefore Sorted Linked List is: \n");
		display(head);
		// Apply merge Sort
		head = mergeSort(head);
		System.out.print("\nSorted Linked List is: \n");
		display(head);
	}

	static Node mergeSort(Node head) {
		if (head.next == null)
			return head;

		Node mid = findMid(head);
		Node head2 = mid.next;
		mid.next = null;
		Node newHead1 = mergeSort(head);
		Node newHead2 = mergeSort(head2);
		Node finalHead = merge(newHead1, newHead2);

		return finalHead;
	}

	// Function to merge two linked lists
	static Node merge(Node head1, Node head2) {
		Node start = new Node(-1);
		Node temp = start;
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				temp.next = head1;
				head1 = head1.next;
			} else {
				temp.next = head2;
				head2 = head2.next;
			}
			temp = temp.next;
		}
		temp.next = head1 != null ? head1 : head2;

		return start.next;
	}

	static Node findMid(Node root) {
		Node fast = root;
		Node slow = root;

		if (root == null) {
			return null;
		}
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	// Display to print list
	static void display(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	// Node Class
	static class Node {
		int data;
		Node next;

		Node(int key) {
			this.data = key;
			next = null;
		}
	}

}
