package com.manish.javadev.geeks.linkedlist;

import java.util.Stack;

/**
 * Check The LinkedList is Palindrome or not
 * 
 * @author Manish Servistava
 *
 */
public class PalindromeLinkedList {

	public static void main(String[] args) {
		Entity root = new Entity(10);
		root.next = new Entity(20);
		root.next.next = new Entity(30);
		root.next.next.next = new Entity(40);
		root.next.next.next.next = new Entity(30);
		root.next.next.next.next.next = new Entity(20);
		root.next.next.next.next.next.next = new Entity(10);
		boolean palindrome = isPalindrome(root);
		if (palindrome) {
			System.out.println("Yes Linkedlist is palindrome");
		} else {
			System.out.println("Yes Linkedlist is not a palindrome");
		}

	}

	static boolean isPalindrome(Entity head) {
		Entity front = head;
		boolean ispalin = true;
		Stack<Integer> stack = new Stack<Integer>();

		while (front != null) {
			stack.push(front.data);
			front = front.next;
		}

		while (head != null) {
			int tmp = stack.pop();
			if (head.data != tmp) {
				ispalin = false;
				break;
			}
			head = head.next;
		}
		return ispalin;
	}
}
