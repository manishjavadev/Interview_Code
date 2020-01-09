package com.manish.javadev.tree;

/**
 * For example, in the below tree, 40, 50 & 80 are at distance 2 from root.
 * 
 * 		    10
          /   \
        20     30
       /  \    /
      40  50  80 
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
		left = right = null;
	}
}

public class PrintNodesAtKDistanceFromRoot {

	void printKDistant(Node1 root, int k) {
		if (root == null)
			return;
		if (k == 0) {
			System.out.print(root.data + " ");
			return;
		} else {
			printKDistant(root.left, k - 1);
			printKDistant(root.right, k - 1);
		}
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		PrintNodesAtKDistanceFromRoot tree = new PrintNodesAtKDistanceFromRoot();
		Node1 root = new Node1(10);
		root.left = new Node1(20);
		root.right = new Node1(30);
		root.left.left = new Node1(40);
		root.left.right = new Node1(50);
		root.right.left = new Node1(80);

		tree.printKDistant(root, 2);
	}
}
