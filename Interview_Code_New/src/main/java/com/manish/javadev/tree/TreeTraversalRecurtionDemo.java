package com.manish.javadev.tree;

public class TreeTraversalRecurtionDemo {

	public static void main(String[] args) {
		BSTNode root = new BSTNode(30);
		BSTNode tn1 = new BSTNode(10);
		BSTNode tn2 = new BSTNode(50);
		BSTNode tn3 = new BSTNode(5);
		BSTNode tn4 = new BSTNode(20);
		BSTNode tn5 = new BSTNode(40);
		BSTNode tn6 = new BSTNode(60);

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
