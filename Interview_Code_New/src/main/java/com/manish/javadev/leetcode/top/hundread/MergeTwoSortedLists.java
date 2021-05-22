package com.manish.javadev.leetcode.top.hundread;

import com.manish.javadev.tree.Node;

/**
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * 
 * Output: [1,1,2,3,4,4] Example 2:
 * 
 * Input: l1 = [], l2 = []
 * 
 * Output: [] Example 3:
 * 
 * Input: l1 = [], l2 = [0]
 * 
 * Output: [0]
 * 
 * @author kmamani
 *
 */
public class MergeTwoSortedLists {
	public static void main(String[] args) {
		Node node1 = new Node(1);
		node1.right = new Node(2);
		node1.right.right = new Node(3);
		node1.right.right.right = new Node(4);
		Node node2 = new Node(0);
		node2.right = new Node(2);
		node2.right.right = new Node(3);
		Node mergeTwoLists1 = mergeTwoLists1(node1, node2);
		display(mergeTwoLists1);
	}

	private static void display(Node mergeTwoLists1) {
		while (mergeTwoLists1 != null) {
			System.out.println(mergeTwoLists1.data);
			mergeTwoLists1 = mergeTwoLists1.right;

		}

	}

	public static Node mergeTwoLists(Node l1, Node l2) {
		if (l1 == null)
			return l2;
		else if (l2 == null)
			return l1;
		Node dummy = new Node(0);
		Node curr = dummy;
		while (l1 != null && l2 != null) {
			if (l1.data <= l2.data) {
				curr.right = l1;
				l1 = l1.right;
			} else {
				curr.right = l2;
				l2 = l2.right;
			}
			curr = curr.right;
		}
		curr.right = l1 == null ? l2 : l1;
		return dummy.right;
	}

	public static Node mergeTwoLists1(Node l1, Node l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.data <= l2.data) {
			l1.right = mergeTwoLists(l1.right, l2);
			return l1;
		} else {
			l2.right = mergeTwoLists(l1, l2.right);
			return l2;
		}
	}

}
