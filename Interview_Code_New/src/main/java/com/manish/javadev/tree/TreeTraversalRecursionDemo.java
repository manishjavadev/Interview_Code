package com.manish.javadev.tree;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class TreeTraversalRecursionDemo {
	public static void main(String[] args) {
		int prev = Integer.MIN_VALUE;
		BSTNode root = BSTDefaultTree.getDefaultTree();
		System.out.println("Pre-Order");
		preOrder(root);
		System.out.println("");

		System.out.println("Post-Order");
		postOrder(root);

		System.out.println("");
		System.out.println("In-Order");
		boolean inOrder = inOrder(root, prev);
		System.out.println("");
		System.out.println("Result  ::: " + inOrder);

	}

	public static void preOrder(BSTNode root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static boolean inOrder(BSTNode root, int prev) {
		if (root != null) {
			inOrder(root.left, prev);
			System.out.print(root.data + "\t");
			if (root.data <= prev) {
				return false;
			}
			prev = root.data;
			inOrder(root.right, prev);
		}
		return true;
	}

	public static void postOrder(BSTNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "\t");
		}
	}

}
