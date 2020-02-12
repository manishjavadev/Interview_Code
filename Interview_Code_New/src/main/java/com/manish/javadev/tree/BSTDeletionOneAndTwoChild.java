package com.manish.javadev.tree;

import java.util.NoSuchElementException;

public class BSTDeletionOneAndTwoChild {
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
		// Delete leaf Node or 1 child
		BSTNode tmp = crr.left != null ? crr.left : crr.right;
		
		if (prev == null) {
			return tmp;
		}
		if (prev.right == crr) {
			prev.right = tmp;
		} else {
			prev.left = tmp;
		}
		return root;
	}
}
