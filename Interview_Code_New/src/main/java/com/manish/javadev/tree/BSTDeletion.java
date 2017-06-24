package com.manish.javadev.tree;

public class BSTDeletion {
	static BSTNode x;
	static BSTNode current;

	public static void main(String[] args) {

		BSTNode root = BSTDefaultTree.getDefaultTree();

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
		current = root;
		if (root.data == data) {
			return current;
		} else if (root.data < data) {
			return find(root.right, data);
		} else {
			return find(root.left, data);
		}
		// recursion end
	}

	private static BSTNode delete(BSTNode root, int data) {
		x = root;
		BSTNode p = null;
		while (x != null) {
			if (x.data == data) {
				break;
			}
			p = x;
			if (x.data > data) {
				x = x.left;
			} else {
				x = x.right;
			}
		}

		// Delete node has 2 child
		if (x.left != null && x.right != null) {
			BSTNode y = x.left;
			p = x;
			while (y.right != null) {
				p = y;
				y = y.right;
			}
			x.data = y.data;
			x = y;
		}
		// Delete leaf or 1 child
		if (p == null) {
			if (x.left != null) {
				return x.left;
			} else {
				return x.right;
			}
		}
		if (p.right == x) {
			p.right = x.right;
		} else {
			p.left = x.left;
		}
		return root;
	}
}
