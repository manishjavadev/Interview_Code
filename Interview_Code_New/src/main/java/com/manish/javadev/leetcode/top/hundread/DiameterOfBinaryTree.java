package com.manish.javadev.leetcode.top.hundread;

import com.manish.javadev.tree.BSTNode;

public class DiameterOfBinaryTree {
	public static void main(String[] args) {
		BSTNode root = new BSTNode(45);
		BSTNode leftRoot = new BSTNode(40);
		BSTNode rightRoot = new BSTNode(50);

		leftRoot.left = new BSTNode(35);
		leftRoot.right = new BSTNode(42);
		leftRoot.right.right = new BSTNode(43);
		leftRoot.right.right.right = new BSTNode(44);

		root.left = leftRoot;

		rightRoot.left = new BSTNode(47);
		rightRoot.right = new BSTNode(55);

		root.right = rightRoot;
		int result = getDiameterOfBinaryTree(root);
		System.out.println("Diameter Of Binary Tree ::: " + result);
		
		int result1 = height(root);
		System.out.println("Diameter Of Binary Tree ::: " + result1);

	}

	private static int getDiameterOfBinaryTree(BSTNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right));
	}

	private static int height(BSTNode root) {

		if (root == null) {
			return 0;
		} else {
			return Math.max(height(root.left), height(root.right)) + 1;
		}
	}

}
