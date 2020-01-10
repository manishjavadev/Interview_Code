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
	void displayNodesAtKDistanceFromRoot(Node1 root, int k) {
		if (root == null)
			return;
		if (k == 0) {
			System.out.print(root.data + " ");
			return;
		} else {
			displayNodesAtKDistanceFromRoot(root.left, k - 1);
			displayNodesAtKDistanceFromRoot(root.right, k - 1);
		}
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		PrintNodesAtKDistanceFromRoot tree = new PrintNodesAtKDistanceFromRoot();
		Node1 root = new Node1(10);

		root.left = new Node1(20);
		root.right = new Node1(30);

		root.left.left = new Node1(40);
		root.left.left.left = new Node1(90);

		root.left.right = new Node1(50);
		root.left.right.left = new Node1(60);

		root.left.right.right = new Node1(70);
		root.left.right.right.right = new Node1(100);
		root.left.right.right.right.left = new Node1(110);

		root.right.right = new Node1(30);
		root.right.left = new Node1(80);

		tree.displayNodesAtKDistanceFromRoot(root, 2);
	}
}
