package com.manish.javadev.tree;

public class BSTDeletion {
	static BSTNode crr;
	static BSTNode current;

	public static void main(String[] args) {

		BSTNode root = BSTDefaultTree.getDefaultTree();
		preOrder(root);
		System.out.println("=============================================");
		BSTNode delete = delete(root, 40);
		System.out.println("Deleted Node ::" + delete.data);
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

	private static BSTNode delete(BSTNode root, int data) {
		crr = root;
		boolean left = false;

		BSTNode prev = null;
		while (crr != null) {
			if (crr.data == data) {
				break;
			}
			prev = crr;
			if (crr.data > data) {
				left = true;
				crr = crr.left;
			} else {
				left = false;
				crr = crr.right;
			}
		}
		if (prev == null) {
			return null;
		}
		// Leaf node deletion code
		if (crr.right == null && crr.left == null) {
			if (prev == null) {
				return null;
			}
			if (left) {
				prev.left = null;
			} else {
				prev.right = null;
			}
		}
		// Leaf node deletion code
		if (crr.right != null && crr.left != null) {
			if (prev == null) {
				return crr.right != null ? crr.right : crr.left;
			}
			if (crr.right != null) {
				if (prev == null) {
					return crr.right;
				}
				if (prev.right == crr) {
					prev.right = crr.right;
				} else {
					prev.left = crr.right;
				}
			}
			if (crr.left != null) {
				if (prev == null) {
					return crr.left;
				}
				if (prev.right == crr) {
					prev.right = crr.left;
				} else {
					prev.left = crr.left;
				}
			}
		}
		return root;
	}
}
