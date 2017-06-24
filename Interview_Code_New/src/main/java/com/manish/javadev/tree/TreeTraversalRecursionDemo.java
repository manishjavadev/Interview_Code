package com.manish.javadev.tree;

public class TreeTraversalRecursionDemo {
	public static void main(String[] args) {
		BSTNode root = BSTDefaultTree.getDefaultTree();
		TreeTraversalRecursionDemo treeTraversalDemo = new TreeTraversalRecursionDemo();
		System.out.println("Pre-Order");
		treeTraversalDemo.preOrder(root);

		System.out.println("Post-Order");
		treeTraversalDemo.postOrder(root);

		System.out.println("In-Order");
		treeTraversalDemo.inOrder(root);

	}

	public void preOrder(BSTNode root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder(BSTNode root) {
		if (root != null) {

			preOrder(root.left);
			System.out.print(root.data + "\t");
			preOrder(root.right);
		}
	}

	public void postOrder(BSTNode root) {
		if (root != null) {
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.data + "\t");
		}
	}

}
