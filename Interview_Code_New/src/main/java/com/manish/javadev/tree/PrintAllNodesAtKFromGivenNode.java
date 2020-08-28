package com.manish.javadev.tree;

/**
 * For example, in the below tree, 40, 50 & 80 are at distance 2 from root.
 * 
 * https://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
 * 
 * https://algorithms.tutorialhorizon.com/print-all-the-nodes-which-are-x-distance-from-the-given-node/
 * 
 * @author Manish Srivastava
 *
 */

public class PrintAllNodesAtKFromGivenNode {

	void printNodeAtKDistance(Node1 node, int k) {
		// Base Case
		if (node == null || k < 0) {
			return;
		}

		// If we reach a k distant node, print it
		if (k == 0) {
			System.out.println(node.data);
			return;
		}
		// Recur for left and right subtrees
		printNodeAtKDistance(node.left, k - 1);
		printNodeAtKDistance(node.right, k - 1);
	}

	// Prints all nodes at distance k from a given target node.
	// The k distant nodes may be upward or downward.This function
	// Returns distance of root from target node, it returns -1
	// if target node is not present in tree rooted with root.
	int findNodeAtKDistanceFromTarget(Node1 node, Node1 target, int k) {
		// Base Case 1: If tree is empty, return -1
		if (node == null)
			return -1;

		// If target is same as root. Use the downward function
		// to print all nodes at distance k in subtree rooted with
		// target or root
		if (node == target) {
			printNodeAtKDistance(node, k);
			return 0;
		}

		// Recur for left subtree
		int dl = findNodeAtKDistanceFromTarget(node.left, target, k);

		// Check if target node was found in left subtree
		if (dl != -1) {

			// If root is at distance k from target, print root
			// Note that dl is Distance of root's left child from
			// target(I mean immediate left and right child from root)
			if (dl + 1 == k) {
				System.out.println(node.data);
			}

			// Else go to right subtree and print all k-dl-2 distant nodes
			// Note that the right child is 2 edges away from left child
			else
				printNodeAtKDistance(node.right, k - dl - 2);

			// Add 1 to the distance and return value for parent calls
			return 1 + dl;
		}

		// MIRROR OF ABOVE CODE FOR RIGHT SUBTREE
		// Note that we reach here only when node was not found in left
		// subtree
		int dr = findNodeAtKDistanceFromTarget(node.right, target, k);
		if (dr != -1) {
			if (dr + 1 == k) {
				System.out.println(node.data);
			}
			// Else go to left subtree and print all k-dr-2 distant nodes
			// Note that the left child is 2 edges away from right child
			else
				printNodeAtKDistance(node.left, k - dr - 2);
			return 1 + dr;
		}

		// If target was neither present in left nor in right subtree
		return -1;
	}

	// Driver program to test the above functions
	public static void main(String args[]) {
		PrintAllNodesAtKFromGivenNode tree = new PrintAllNodesAtKFromGivenNode();

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

		Node1 target = root.left.right;
		
		//Node1 target = root.left;// and  int distance = 1; for base case 

		// target node 50, find all node from given node at distance 3
		int distance = 3;
		tree.findNodeAtKDistanceFromTarget(root, target, distance);
	}
}
