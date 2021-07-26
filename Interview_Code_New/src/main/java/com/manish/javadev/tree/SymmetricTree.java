package com.manish.javadev.tree;

import java.util.Stack;

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

		boolean resultTree = isSymmetric(root, root);
		if (resultTree) {
			System.out.println("Symmetric Tree");
		} else {
			System.out.println("Not a Symmetric Tree");

		}
		
		resultTree = isSymmetric(root);
		if (resultTree) {
			System.out.println("Symmetric Tree");
		} else {
			System.out.println("Not a Symmetric Tree");

		}

	}

	private static boolean isSymmetric(BSTNode left, BSTNode right) {
		if (left == null || right == null)
			return left == right;
		if (left.data != right.data)
			return false;
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);

	}
	private static boolean isSymmetric(BSTNode root) {
		Stack<BSTNode> stack  = new Stack<BSTNode>();
		stack.add(root.left);
		stack.add(root.right);
		while(!stack.isEmpty()) {
			BSTNode right = stack.pop();
			BSTNode left = stack.pop();
			if(left == null && right == null) {
				continue;
			}
			if(left ==null || right == null || left.data != right.data) {
				return false;
			}
			stack.add(root.left);
			stack.add(root.right);
			stack.add(root.right);
			stack.add(root.left);
			
		}
		return true;
		
	}
}
