package com.manish.javadev.tree;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class BSTNode {
	public int data;
	public BSTNode left;
	public BSTNode right;
	public int height;

	public BSTNode() {

	}

	public BSTNode(int data) {
		this.data = data;
		this.height = 1;
	}
}
