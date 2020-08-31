package com.manish.javadev.tree;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;
	int height;

	public BSTNode() {

	}

	public BSTNode(int data) {
		this.data = data;
		this.height = 1;
	}
}
