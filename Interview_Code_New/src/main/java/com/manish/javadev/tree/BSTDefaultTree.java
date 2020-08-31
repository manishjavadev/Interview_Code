package com.manish.javadev.tree;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class BSTDefaultTree {

	public static BSTNode getDefaultTree() {
		BSTNode root = new BSTNode(45);
		BSTNode leftRoot = new BSTNode(40);
		BSTNode rightRoot = new BSTNode(50);

		leftRoot.left = new BSTNode(35);
		leftRoot.right = new BSTNode(42);

		/*
		 * leftRoot.left.left = new BSTNode(30); leftRoot.left.right = new BSTNode(37);
		 */
		root.left = leftRoot;

		rightRoot.left = new BSTNode(47);
		rightRoot.right = new BSTNode(52);

		/*
		 * rightRoot.left.left = new BSTNode(46); rightRoot.left.right = new
		 * BSTNode(48);
		 */

		/*
		 * rightRoot.right.left = new BSTNode(51); rightRoot.right.right = new
		 * BSTNode(54);
		 */
		root.right = rightRoot;
		return root;
	}
}
