package com.manish.javadev.leetcode.top.hundread;

public class PalindromeLinkedList {
	Node head;
	Node slow_ptr, fast_ptr, second_half;

	class Node {
		char data;
		Node next;

		Node(char d) {
			data = d;
			next = null;
		}
	}

	/**
	 * STEP-1 : Get the middle element
	 * 
	 * STEP-2 : Reverse the middle element
	 * 
	 * STEP-3 : Compare first and second half
	 * 
	 * @param head
	 * @return
	 */
	boolean isPalindrome(Node head) {
		slow_ptr = head;
		fast_ptr = head;
		boolean res = true;

		Node middile = getMiddile(head);
		System.out.println(middile.data);

		Node second = middile.next;
		middile.next = null;
		second = reverse(second, null);
		System.out.println("Second ::" + second.data);

		res = compareLists(head, second); // compare

		return res;
	}

	private Node getMiddile(Node crr) {
		Node slow = crr;
		Node fast = crr;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private Node reverse(Node root, Node prev) {

		if (root == null) {
			return root;
		}
		if (root.next == null) {
			root.next = prev;
			return root;
		}
		Node next = root.next;
		root.next = prev;
		prev = root;
		return reverse(next, prev);
	}

	void reverse() {
		Node prev = null;
		Node current = second_half;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		second_half = prev;
	}

	/* Function to check if two input lists have same data */
	boolean compareLists(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;

		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else
				return false;
		}

		if (temp2 == null)
			return true;
		return false;
	}

	public void push(char new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList(Node ptr) {
		while (ptr != null) {
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}

	/* Driver program to test the above functions */
	public static void main(String[] args) {
		/* Start with the empty list */
		PalindromeLinkedList llist = new PalindromeLinkedList();

		char str[] = { 'a', 'b', 'a', 'c', 'a', 'b', 'a' };

		for (int i = 0; i < 7; i++) {
			llist.push(str[i]);
			llist.printList(llist.head);
		}
		if (llist.isPalindrome(llist.head) != false) {
			System.out.println("Is Palindrome");
			System.out.println("");
		} else {
			System.out.println("Not Palindrome");
			System.out.println("");
		}
	}
}
