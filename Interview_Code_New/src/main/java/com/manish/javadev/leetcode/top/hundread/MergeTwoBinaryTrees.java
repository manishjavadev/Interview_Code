package com.manish.javadev.leetcode.top.hundread;

import com.manish.javadev.tree.BSTNode;

public class MergeTwoBinaryTrees {
	public static void main(String[] args) {
		BSTNode root1 = new BSTNode(1);
		BSTNode leftRoot1 = new BSTNode(2);
		BSTNode rightRoot1 = new BSTNode(3);

		leftRoot1.left = new BSTNode(4);
		leftRoot1.right = new BSTNode(5);

		rightRoot1.left = new BSTNode(6);
		rightRoot1.right = new BSTNode(7);
		root1.left = leftRoot1;
		root1.right = rightRoot1;

		BSTNode root2 = new BSTNode(1);
		BSTNode leftRoot2 = new BSTNode(2);
		BSTNode rightRoot2 = new BSTNode(3);

		leftRoot2.left = new BSTNode(4);
		leftRoot2.right = new BSTNode(5);

		rightRoot2.left = new BSTNode(6);
		rightRoot2.right = new BSTNode(7);
		root2.left = leftRoot1;
		root2.right = rightRoot2;
		BSTNode mergeTwoTree = mergeTwoTree(root1, root2);
		display(mergeTwoTree);

	}

	private static void display(BSTNode root) {
		if (root != null) {
			System.out.println(root.data);
			display(root.left);
			display(root.right);
		}

	}

	private static BSTNode mergeTwoTree(BSTNode t1, BSTNode t2) {
		if (t1 == null && t2 == null)
			return null;
		else if (t1 == null) {
			return t2;
		} else if (t2 == null)
			return t1;
		BSTNode newNode = new BSTNode(t1.data + t2.data);
		newNode.left = mergeTwoTree(t1.left, t2.left);
		newNode.right = mergeTwoTree(t1.right, t2.right);
		return newNode;
	}

}
