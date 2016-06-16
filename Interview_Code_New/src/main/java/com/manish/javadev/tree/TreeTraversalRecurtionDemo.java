package com.manish.javadev.tree;

public class TreeTraversalRecurtionDemo {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(30);
		TreeNode tn1 = new TreeNode(10);
		TreeNode tn2 = new TreeNode(50);
		TreeNode tn3 = new TreeNode(5);
		TreeNode tn4 = new TreeNode(20);
		TreeNode tn5 = new TreeNode(40);
		TreeNode tn6 = new TreeNode(60);

		// Left side tree
		root.left = tn1;
		tn2.left = tn3;
		tn2.right = tn4;

		// Right side tree
		root.right = tn2;
		tn3.left = tn5;
		tn3.right = tn6;

		TreeTraversalUsingRecursion ttur = new TreeTraversalUsingRecursion();
		System.out.println("30, 10,50,5,20,40,60");
		System.out.println("\n");
		System.out.println("Preorder of above tree");
		ttur.preOrder(root);
		System.out.println("\n");
		System.out.println("Inorder of above tree");
		ttur.inOrder(root);
		System.out.println("\n");
		System.out.println("PostOrder of above tree");
		ttur.postOrder(root);
		System.out.println("\n");

	}

}
