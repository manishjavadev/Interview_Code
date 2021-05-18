package com.manish.javadev.tree;

import com.manish.javadev.tree.BSTNode;

public class SymmetricTree {
	/* testing for example BSTNodes */
	public static void main(String args[]) {
		BSTNode root = new BSTNode(10);

		BSTNode rootLeft = new BSTNode(20);
		rootLeft.left = new BSTNode(30);
		rootLeft.right = new BSTNode(40);
		root.left = rootLeft;

		BSTNode rootRight = new BSTNode(20);
		rootRight.left = new BSTNode(40);
		rootRight.right = new BSTNode(30);
		root.right = rootRight;

		boolean resultTree = mirror(root, root);
		if (resultTree) {
			System.out.println("Symmetric Tree");
		} else {
			System.out.println("Not a Symmetric Tree");

		}

	}

	private static boolean mirror(BSTNode left, BSTNode right) {
		if (left == null || right == null)
			return left == right;
		if (left.data != right.data)
			return false;
		return mirror(left.left, right.right) && mirror(left.right, right.left);

	}
}
