package com.manish.javadev.tree;

import java.util.Stack;

public class IsValidBST {
	static int prev = -1;

	/* Driver code */
	public static void main(String[] args) {
		BSTNode root = new BSTNode(30);
		root.left = new BSTNode(15);
		root.right = new BSTNode(40);
		root.left.left = new BSTNode(10);
		root.left.right = new BSTNode(20);

		if (isBSTUsingInOrder(root))
			System.out.print("Is BST");
		else
			System.out.print("Not a BST");
	}

	// Function to check if Binary Tree is BST
	static boolean isBST(BSTNode root) {
		return isBSTUtil(root);
	}

	/*
	 * A binary tree node has data, pointer to left child and a pointer to right
	 * child
	 */
	static class BSTNode {
		int data;
		BSTNode left, right;

		BSTNode(int data) {
			this.data = data;
			left = right = null;
		}
	}

	// Utility function to check if Binary Tree is BST
	static boolean isBSTUtil(BSTNode root) {
		// traverse the tree in inorder fashion and
		// keep track of prev node
		if (root != null) {
			if (!isBSTUtil(root.left))
				return false;

			// Allows only distinct valued nodes
			if (root.data <= prev)
				return false;

			// Initialize prev to current
			prev = root.data;

			return isBSTUtil(root.right);
		}
		return true;
	}
	
	public static boolean isBSTUsingInOrder1(BSTNode root) {
		if (root != null) {
			isBSTUsingInOrder1(root.left);
			if (root.data < prev) {
				return false;
			}
			prev = root.data;
			return isBSTUsingInOrder1(root.right);
		}
		return true;
	}
	
	public static boolean isBSTUsingInOrder(BSTNode root) {
		int prev = Integer.MIN_VALUE;
		Stack<BSTNode> stack = new Stack<BSTNode>();
		boolean done = false;
		BSTNode cur = root;
		while (!done) {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			} else {
				if (stack.empty()) {
					done = true;
				} else {
					BSTNode top = stack.pop();
					if (top.data <= prev) {
						return false;
					}
					prev = top.data;
					cur = top.right;
				}
			}
		}
		return true;
	}
}
