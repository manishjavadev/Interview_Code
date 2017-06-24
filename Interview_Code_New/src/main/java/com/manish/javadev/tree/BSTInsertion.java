package com.manish.javadev.tree;

public class BSTInsertion {
	static BSTNode start;
	static BSTNode current;

	public static void main(String[] args) {

		BSTNode root = insert(current, 10);
		insert(root, 33);
		insert(root, 5);
		insert(root, 2);
		System.out.println("manishjavadev.com – Binary Tree Inorder Traversal");
		preOrder(root);
	}

	public static void preOrder(BSTNode root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	private static BSTNode find(BSTNode root, int data) {

		// This block for recursion
		if (root == null) {
			return current;
		}
		if (root.data == data) {
			return root;
		} else if (root.data < data) {
			current = root;
			return find(root.right, data);
		} else {
			current = root;
			return find(root.left, data);
		}
	}

	private static BSTNode insert(BSTNode root, int data) {
		start = root;
		current = find(root, data);

		BSTNode node = new BSTNode();
		node.data = data;
		if (root == null) {
			return node;
		}

		if (current.data > data) {
			current.left = node;
		} else {
			current.right = node;
		}
		return root;
	}
}
