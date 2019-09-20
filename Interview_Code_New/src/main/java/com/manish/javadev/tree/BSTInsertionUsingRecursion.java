package com.manish.javadev.tree;

public class BSTInsertionUsingRecursion {

	public static void main(String[] args) {
		BSTNode root = null;
		BSTInsertionUsingRecursion tree = new BSTInsertionUsingRecursion();
		root = tree.insertWithRecurtion(root, 20);
		root = tree.insertWithRecurtion(root, 25);
		root = tree.insertWithRecurtion(root, 30);
		root = tree.insertWithRecurtion(root, 10);
		root = tree.insertWithRecurtion(root, 5);

		tree.display(root);
	}

	private void display(BSTNode root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			display(root.left);
			display(root.right);
		}

	}

	private BSTNode insertWithRecurtion(BSTNode root, int data) {
		if (root == null) {
			return new BSTNode(data);
		}
		if (root.data > data) {
			root.left = insertWithRecurtion(root.left, data);
		} else {
			root.right = insertWithRecurtion(root.right, data);
		}
		return root;
	}
}
