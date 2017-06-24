package com.manish.javadev.tree;

public class BSTDeletion {
	static BSTNode start;
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
		start = root;
		BSTNode end = null;
		while (start != null) {
			if (start.data == data) {
				break;
			}
			end = start;
			if (start.data > data) {
				start = start.left;
			} else {
				start = start.right;
			}
		}

		// Delete node has 2 child
		if (start.left != null && start.right != null) {
			BSTNode y = start.left;
			end = start;
			while (y.right != null) {
				end = y;
				y = y.right;
			}
			start.data = y.data;
			start = y;
		}
		// Delete leaf or 1 child
		if (end == null) {
			if (start.left != null) {
				return start.left;
			} else {
				return start.right;
			}
		}
		if (end.right == start) {
			end.right = start.right;
		} else {
			end.left = start.left;
		}
		return root;
	}
}
