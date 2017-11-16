package com.manish.javadev.tree;

public class MirrorTree {
	/* testing for example BSTNodes */
	public static void main(String args[]) {
		BSTNode tree = new BSTNode(1);
		tree.left = new BSTNode(2);
		tree.right = new BSTNode(3);
		tree.left.left = new BSTNode(4);
		tree.left.right = new BSTNode(5);
		System.out.println("Post-Order");
		TreeTraversalRecursionDemo.postOrder(tree);
		BSTNode resultTree = mirror(tree);
		System.out.println("After Mirror Image Post-Order");
		TreeTraversalRecursionDemo.postOrder(tree);
		System.out.println(resultTree);

	}

	private static BSTNode mirror(BSTNode tree) {
		if (tree == null)
			return tree;

		/* do the subtrees */
		BSTNode left = mirror(tree.left);
		BSTNode right = mirror(tree.right);

		/* swap the left and right pointers */
		tree.left = right;
		tree.right = left;

		return tree;

	}
}

