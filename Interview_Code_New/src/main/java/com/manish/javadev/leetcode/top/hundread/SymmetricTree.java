package com.manish.javadev.leetcode.top.hundread;

import java.util.Stack;

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

		boolean resultTree = isSymmetricWithRecursion(root, root);
		if (resultTree) {
			System.out.println("Symmetric Tree");
		} else {
			System.out.println("Not a Symmetric Tree");

		}

	}

	private static boolean isSymmetricWithRecursion(BSTNode left, BSTNode right) {
		if (left == null || right == null)
			return left == right;
		if (left.data != right.data)
			return false;
		return isSymmetricWithRecursion(left.left, right.right) && isSymmetricWithRecursion(left.right, right.left);

	}

	public boolean isSymmetric(BSTNode root) {
		if (root == null)
			return true;
		Stack<BSTNode> stack = new Stack<BSTNode>();
		stack.push(root.left);
		stack.push(root.right);
		while (!stack.empty()) {
			BSTNode right = stack.pop();
			BSTNode left = stack.pop();
			if (left == null && right == null) {
				continue;
			} else if (left == null || right == null || right.data != left.data) {
				return false;
			}
			stack.push(left.left);
			stack.push(right.right);
			stack.push(left.right);
			stack.push(right.left);
		}
		return true;
	}
}
