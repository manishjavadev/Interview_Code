package com.manish.javadev.tree;

import java.util.NoSuchElementException;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class BSTDeleteLeafAndOneChild {
	static BSTNode crr;
	static BSTNode current;

	public static void main(String[] args) {

		BSTNode root = getDefaultTree();
		preOrder(root);
		System.out.println("=============================================");
		int data = 41;// leaf or one child node are 42, 41, 47, 52, 35
		BSTNode delete = delete(root, data);
		System.out.println("Deleted Node ::" + data);
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
		BSTNode tmp = crr.left != null ? crr.left : crr.right;
		if (crr.left == null && crr.right == null) {
			if (prev == null) {
				return null;
			}
			if (prev.right == crr) {
				prev.right = tmp;
			} else {
				prev.left = tmp;
			}
		}
		// Delete 1 child node
		if (crr.left != null || crr.right != null) {
			if (prev == null) {
				return tmp;
			}
			if (prev.right == crr) {
				prev.right = tmp;
			} else {
				prev.left = tmp;
			}
		}
		return root;
	}

	public static BSTNode getDefaultTree() {
		BSTNode root = new BSTNode(45);
		BSTNode leftRoot = new BSTNode(40);
		BSTNode rightRoot = new BSTNode(50);

		leftRoot.left = new BSTNode(35);
		leftRoot.right = new BSTNode(42);

		leftRoot.right.left = new BSTNode(41);
		// leftRoot.left.right = new BSTNode(37);*/
		root.left = leftRoot;

		rightRoot.left = new BSTNode(47);
		rightRoot.right = new BSTNode(52);

		/*
		 * rightRoot.left.left = new BSTNode(46); rightRoot.left.right = new
		 * BSTNode(48);
		 */

		/*
		 * rightRoot.right.left = new BSTNode(51); rightRoot.right.right = new
		 * BSTNode(54);
		 */
		root.right = rightRoot;
		return root;
	}
}
