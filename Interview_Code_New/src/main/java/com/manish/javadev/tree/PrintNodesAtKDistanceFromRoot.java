package com.manish.javadev.tree;

/**
 * For example, in the below tree, 40, 50 & 80 are at distance 2 from root.
 * 
 * 10 / \ 20 30 / \ / 40 50 80
 * 
 * @author kmamani
 *
 */
class Node1 {
	int data;
	Node1 left;
	Node1 right;

	Node1(int item) {
		data = item;
	}
}

public class PrintNodesAtKDistanceFromRoot {

	/**
	 * Display Nodes At k distance from Root
	 * 
	 * @param root
	 * @param k
	 */
	void printKDistanceNodeDown(Node1 node, int k) {
		// Base Case
		if (node == null || k < 0)
			return;

		// If we reach a k distant node, print it
		if (k == 0) {
			System.out.println(node.data);
			return;
		}

		// Recur for left and right subtrees
		printKDistanceNodeDown(node.left, k - 1);
		printKDistanceNodeDown(node.right, k - 1);
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		PrintNodesAtKDistanceFromRoot tree = new PrintNodesAtKDistanceFromRoot();
		Node1 root = new Node1(10);

		// Node is 10
		root.left = new Node1(20);
		root.right = new Node1(30);

		// Node is 20
		root.left.left = new Node1(40);
		root.left.right = new Node1(50);

		// Node is 50
		root.left.right.left = new Node1(60);
		root.left.right.right = new Node1(70);
		root.left.right.right.right = new Node1(10);
		root.left.right.right.right.left = new Node1(11);

		// Node is 40
		root.left.left.left = new Node1(90);

		// Node is 30
		root.right.right = new Node1(80);


		tree.printKDistanceNodeDown(root, 3);
	}
}
