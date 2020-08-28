package com.manish.javadev.tree;

/**
 * Rule for AVL Tree
 * 
 * 1) It is a BST
 * 
 * 2) Balance factor (Height of left sub tree - Height of right sub tree should
 * be 1 0 -1)
 * 
 * 3) You can not insert duplicate element in BST
 * 
 * @author Manish Srivastava
 *
 */
public class HeightOfTree {

	public static void main(String[] args) throws java.lang.Exception {
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.left.left.left = new Node(30);
		root.left.right.left = new Node(35);
		root.left.right.left.left = new Node(40);
		root.left.right.left.left.right = new Node(45);
		root.left.right.left.left.right.left = new Node(50);
		HeightOfTree obj = new HeightOfTree();
		System.out.println("Tree Height: " + obj.height(root));
	}

	public int height(Node root) {
		if (root == null) {
			return 0;
		} else {
			int left = height(root.left);
			int right = height(root.right);
			return Math.max(left, right) + 1;
		}
	}

}