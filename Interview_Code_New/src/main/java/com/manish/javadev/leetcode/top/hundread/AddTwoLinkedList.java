package com.manish.javadev.leetcode.top.hundread;

import com.manish.javadev.geeks.linkedlist.Entity;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * 
 * Input:
 * 
 * l1 = [2,4,3],
 * 
 * l2 = [5,6,4]
 * 
 * Output: [7,0,8]
 * 
 * Explanation: 342 + 465 = 807.
 * 
 * Example 2:
 * 
 * Input: l1 = [0], l2 = [0] Output: [0] Example 3:
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]
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

	private static void display(Entity root) {
		while (root != null) {
			System.out.println(root.data);
			root = root.next;
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
			result = en;
			
			carry = resVal / 10;
			l1 = (l1 == null ? l1 : l1.next);
			l2 = (l2 == null ? l2 : l2.next);
		}
		return head;
	}
}
