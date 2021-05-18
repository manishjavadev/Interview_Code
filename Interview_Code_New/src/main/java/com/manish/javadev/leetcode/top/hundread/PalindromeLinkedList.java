package com.manish.javadev.leetcode.top.hundread;

import java.util.Stack;

import com.manish.javadev.geeks.linkedlist.Entity;

public class PalindromeLinkedList {
	public static void main(String[] args) {
		Entity root = new Entity(10);
		root.next = new Entity(20);
		root.next.next = new Entity(30);
		root.next.next.next = new Entity(40);
		root.next.next.next.next = new Entity(30);
		root.next.next.next.next.next = new Entity(20);
		root.next.next.next.next.next.next = new Entity(30);
		boolean palindrome = isPalindrome(root);
		if (palindrome) {
			System.out.println("Yes Linkedlist is palindrome");
		} else {
			System.out.println("Yes Linkedlist is not a palindrome");
		}

	}

	static boolean isPalindrome(Entity head) {
		Entity crr = head;
		Stack<Entity> stack = new Stack<Entity>();
		while (crr != null) {
			stack.push(crr);
			crr = crr.next;
		}
		while (head != null) {
			Entity top = stack.pop();
			if (top.data != head.data) {
				return false;
			}
			head = head.next;
		}

		return true;

	}

}
