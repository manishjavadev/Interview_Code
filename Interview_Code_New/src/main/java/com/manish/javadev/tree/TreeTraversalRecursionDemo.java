package com.manish.javadev.tree;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class TreeTraversalRecursionDemo {
	public static void main(String[] args) {
		BSTNode root = BSTDefaultTree.getDefaultTree();
		System.out.println("Pre-Order");
		preOrder(root);

		System.out.println("Post-Order");
		postOrder(root);

		System.out.println("In-Order");
		inOrder(root);

	}

	public static void preOrder(BSTNode root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void inOrder(BSTNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + "\t");
			inOrder(root.right);
		}
	}

	public static void postOrder(BSTNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "\t");
		}
	}

}
