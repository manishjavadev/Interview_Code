package com.manish.javadev.tree;

public class BinaryTreeDiameterDemo {
	public static void main(String[] args) {
		// Root of the Binary Tree
		Node root = new Node(40);

		root.left = new Node(30);

		root.right = new Node(50);

		root.left.left = new Node(20);
		root.left.left.left = new Node(10);
		root.left.left.right = new Node(25);

		root.left.right = new Node(35);
		root.left.right.left = new Node(32);
		root.left.right.right = new Node(37);

		root.right.left = new Node(45);
		root.right.right = new Node(60);

		int result = diameter(root);
		System.out.println(result);

	}

	private static int diameter(Node root) {
		if (root == null) {
			return 0;
		}
		int ld = diameter(root.left);
		int rd = diameter(root.right);

		int fes = Math.max(height(root.left), height(root.right)) + 2;
		return Math.max(fes, Math.max(ld, rd));

	}

	private static int height(Node root) {
		if (root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) + 1;
	}

}
