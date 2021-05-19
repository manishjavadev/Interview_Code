package com.manish.javadev.tree;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class Node {

	public int data;
	public Node left;
	public Node right;
	public int height;

	public Node(int data) {
		this.data = data;
		this.height = 1;
	}
}