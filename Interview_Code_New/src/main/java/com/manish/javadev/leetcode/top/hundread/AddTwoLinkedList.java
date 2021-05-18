package com.manish.javadev.leetcode.top.hundread;

import com.manish.javadev.geeks.linkedlist.Entity;

/**
 * 
 * 
 * 
 * @author kmamani
 *
 */
public class AddTwoLinkedList {

	public static void main(String[] args) {
		Entity rootNode1 = new Entity(2);
		rootNode1.next = new Entity(4);
		rootNode1.next.next = new Entity(3);
		Entity rootNode2 = new Entity(5);
		rootNode2.next = new Entity(6);
		rootNode2.next.next = new Entity(4);
		Entity addTwoNumbers = addTwoNumbers(rootNode1, rootNode2);
		display(addTwoNumbers);

	}

	private static void display(Entity addTwoNumbers) {
		while (addTwoNumbers != null) {
			System.out.println(addTwoNumbers.data);
			addTwoNumbers = addTwoNumbers.next;
		}

	}

	public static Entity addTwoNumbers(Entity l1, Entity l2) {
		Entity head = null;
		Entity result = null;
		int carry = 0;

		while (l1 != null || l2 != null || carry > 0) {
			int resVal = (l1 != null ? l1.data : 0) + (l2 != null ? l2.data : 0) + carry;
			Entity en = new Entity(resVal % 10);
			if (head == null) {
				head = en;
			} else {
				result.next = en;
			}
			carry = resVal / 10;
			l1 = (l1 == null ? l1 : l1.next);
			l2 = (l2 == null ? l2 : l2.next);
			result = en;
		}

		return head;
	}
}
