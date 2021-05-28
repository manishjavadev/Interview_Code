package com.manish.javadev.geeks.linkedlist;

/**
 * Check The LinkedList is Palindrome or not
 * 
 * @author Manish Servistava
 *
 */
public class PalindromeLinkedList1 {

	public static void main(String[] args) {
		Entity root = getOddList();
		//Entity root = getEvenList();
		boolean palindrome = isPalindrome(root);
		if (palindrome) {
			System.out.println("Yes Linkedlist is palindrome");
		} else {
			System.out.println("Yes Linkedlist is not a palindrome");
		}

	}

	private static Entity getOddList() {
		Entity root = new Entity(10);
		root.next = new Entity(20);
		root.next.next = new Entity(30);
		root.next.next.next = new Entity(40);
		root.next.next.next.next = new Entity(30);
		root.next.next.next.next.next = new Entity(20);
		root.next.next.next.next.next.next = new Entity(10);
		return root;
	}

	private static Entity getEvenList() {
		Entity root = new Entity(10);
		root.next = new Entity(20);
		root.next.next = new Entity(30);

		root.next.next.next = new Entity(30);
		root.next.next.next.next = new Entity(20);
		root.next.next.next.next.next = new Entity(10);
		return root;
	}

	static boolean isPalindrome(Entity root) {
		Entity fast = root, slow = root;
		while (fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    if (fast != null) { // odd nodes: let right half smaller
	        slow = slow.next;
	    }
	    slow = reverse(slow);
	    fast = root;
	    while (slow != null) {
	        if (fast.data != slow.data) {
	            return false;
	        }
	        fast = fast.next;
	        slow = slow.next;
	    }
	    return true;
	}

	private static Entity reverse(Entity head) {
		
		Entity prev = null;
		while (head != null) {
			Entity next = head.next;
	        head.next = prev;
	        prev = head;
	        head = next;
	    }
	    return prev;
	}
}
