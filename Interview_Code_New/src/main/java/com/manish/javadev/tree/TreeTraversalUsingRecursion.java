package com.manish.javadev.tree;

public class TreeTraversalUsingRecursion {
	
	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder(TreeNode root) {
		if (root != null) {

			preOrder(root.left);
			System.out.print(root.data + "\t");
			preOrder(root.right);
		}
	}

	public void postOrder(TreeNode root) {
		if (root != null) {
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.data + "\t");
		}
	}
	
}
