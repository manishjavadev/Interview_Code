package com.manish.javadev.tree;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class BSTDefaultTree2 {

	public static BSTNode getDefaultTree() {
		BSTNode root = new BSTNode(30);
		BSTNode leftRoot = new BSTNode(20);
		BSTNode rightRoot = new BSTNode(40);

		leftRoot.left = new BSTNode(15);
		leftRoot.right = new BSTNode(25);
		root.left = leftRoot;

		rightRoot.left = new BSTNode(35);
		rightRoot.right = new BSTNode(45);
		root.right = rightRoot;

		return root;
	}
}
