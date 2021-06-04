package com.manish.javadev.tree;

public class FindLCAWithBSTTree {

	// Root of the Binary Tree
	Node root;

	Node findLCA(int n1, int n2) {
		return findLCA(root, n1, n2);
	}

	Node findLCA(Node node, int n1, int n2) {
		// Base case
		if (node == null)
			return null;

		if (node.data > n1 && node.data > n2) {
			return findLCA(node.left, n1, n2);
		} else if (node.data < n1 && node.data < n2) {
			return findLCA(node.right, n1, n2);
		} else {
			return node;
		}
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		FindLCAWithBSTTree tree = new FindLCAWithBSTTree();
		tree.root = new Node(40);
		tree.root.left = new Node(30);

		tree.root.right = new Node(50);

		tree.root.left.left = new Node(20);
		tree.root.left.left.left = new Node(10);
		tree.root.left.left.right = new Node(25);

		tree.root.left.right = new Node(35);
		tree.root.left.right.left = new Node(32);
		tree.root.left.right.right = new Node(37);

		tree.root.right.left = new Node(45);
		tree.root.right.right = new Node(60);

		System.out.println("LCA(20,35) = " + tree.findLCA(20, 35).data);
		System.out.println("LCA(10,37) = " + tree.findLCA(10, 37).data);
		System.out.println("LCA(30,37) = " + tree.findLCA(30, 37).data);
		System.out.println("LCA(30,37) = " + tree.findLCA(30, 60).data);
	}
}
