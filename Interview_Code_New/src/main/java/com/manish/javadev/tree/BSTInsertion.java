package com.manish.javadev.tree;

public class BSTInsertion {

	public static void main(String[] args) {

		BSTNode root = BSTDefaultTree.getDefaultTree();
		BSTInsertion bstInsertion = new BSTInsertion();
		bstInsertion.insert(root, 28);
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

	private BSTNode insert(BSTNode root, int data) {
		BSTNode prev = null;
		BSTNode crr = root;
		boolean left = false;
		while (crr != null) {
			if (crr.data == data) {
				throw new IllegalArgumentException();
			}
			prev = crr;
			if (crr.data > data) {
				crr = crr.left;
				left = true;
			} else {
				crr = crr.right;
				left = false;
			}
		}
		BSTNode node = new BSTNode(data);
		if (root == null) {
			return node;
		}
		if (left) {
			prev.left = node;
		} else {
			prev.right = node;
		}
		return root;
	}

	private BSTNode insertWithRecurtion(BSTNode root, int data) {
		if (root == null) {
			return new BSTNode(data);
		}
		if (root.data > data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}
}
