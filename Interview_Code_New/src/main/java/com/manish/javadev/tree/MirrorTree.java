package com.manish.javadev.tree;

public class MirrorTree {
	/* testing for example BSTNodes */
	public static void main(String args[]) {
		BSTNode root = new BSTNode(10);

		BSTNode rootLeft = new BSTNode(20);
		rootLeft.left = new BSTNode(40);
		rootLeft.right = new BSTNode(50);
		root.left = rootLeft;

		BSTNode rootRight = new BSTNode(30);
		rootRight.left = new BSTNode(60);
		rootRight.right = new BSTNode(70);
		root.right = rootRight;

		System.out.println("Pre-Order Before Image");
		TreeTraversalRecursionDemo.preOrder(root);

		BSTNode resultTree = mirror(root);
		System.out.println("After Mirror Image Pre-Order");
		TreeTraversalRecursionDemo.preOrder(root);
		System.out.println(resultTree);

	}

	private static BSTNode mirror(BSTNode tree) {
		if (tree == null)
			return null;

		/* do the subtrees */
		BSTNode left = mirror(tree.left);
		BSTNode right = mirror(tree.right);

		/* swap the left and right pointers */
		tree.left = right;
		tree.right = left;

		return tree;

	}
}
