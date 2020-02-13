package com.manish.javadev.tree;

import java.util.NoSuchElementException;

public class BSTDeleteLeafAndOneChild {
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
		BSTNode prev = null;
		while (crr != null) {
			if (crr.data == data) {
				break;
			}
			prev = crr;
			if (crr.data > data) {
				crr = crr.left;
			} else {
				crr = crr.right;
			}
		}
		if (crr == null) {
			throw new NoSuchElementException("Searched Element is not there");
		}
		// Delete Leaf node
		if (crr.left == null && crr.right == null) {
			if (prev == null) {
				return null;
			}
			if (prev.right == crr) {
				prev.right = null;
			} else {
				prev.left = null;
			}
		}
		// Delete Leaf node
		if (crr.left != null && crr.right != null) {
			if (prev == null) {
				return null;
			}
			if (crr.left != null) {
				if (prev.right == crr) {
					prev.right = crr.left;
				} else {
					prev.left = crr.left;
				}
			}
			if (crr.right != null) {
				if (prev.right == crr) {
					prev.right = crr.right;
				} else {
					prev.left = crr.right;
				}
			}

		}
		return root;
	}
}
