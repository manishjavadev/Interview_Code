package com.manish.javadev.tree;

public class AVLClient {

	public static void main(String[] args) {
		Node root = null;
		AVLTree tree = new AVLTree();
		root = tree.insert(root, 20);
		root = tree.insert(root, 25);
		root = tree.insert(root, 30);
		root = tree.insert(root, 10);
		root = tree.insert(root, 5);

		tree.display(root);
	}
}