package com.manish.javadev.tree;

public class IsValidBST {
	static int prev = -1;

	/*
	 * A binary tree node has data, pointer to left child and a pointer to right
	 * child
	 */
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	};

	// Utility function to check if Binary Tree is BST
	static boolean isBSTUtil(Node root) {
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

	// Function to check if Binary Tree is BST
	static boolean isBST(Node root) {
		return isBSTUtil(root);
	}

	/* Driver code */
	public static void main(String[] args) {
		Node root = new Node(30);
		root.left = new Node(15);
		root.right = new Node(40);
		root.left.left = new Node(10);
		root.left.right = new Node(20);

		if (isBST(root))
			System.out.print("Is BST");
		else
			System.out.print("Not a BST");
	}
}
