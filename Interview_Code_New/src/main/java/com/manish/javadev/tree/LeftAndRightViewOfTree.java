package com.manish.javadev.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftAndRightViewOfTree {
	public static void main(String[] args) {
		BSTNode root = new BSTNode(10);
		BSTNode leftRoot = new BSTNode(20);
		BSTNode rightRoot = new BSTNode(30);

		leftRoot.left = new BSTNode(40);
		leftRoot.right = new BSTNode(50);
		root.left = leftRoot;

		rightRoot.left = new BSTNode(60);
		rightRoot.left.left = new BSTNode(80);
		rightRoot.right = new BSTNode(70);
		root.right = rightRoot;
		LeftAndRightViewOfTree levelOrderTraversal = new LeftAndRightViewOfTree();
		levelOrderTraversal.doLevelOrderTraversal(root);
	}

	void doLevelOrderTraversal(BSTNode root) {
		Queue<BSTNode> pq = new LinkedList<BSTNode>();
		pq.add(root);
		if (root == null) {
			return;
		}
		while (!pq.isEmpty()) {

			int n = pq.size();
			for (int i = 1; i <= n; i++) {
				root = pq.poll();
				/**
				 * if i==1 then its left view of tree or if i=size of queue the it will print
				 * right view of tree
				 */
				if (i == n) {
					System.out.print(root.data + "\t");
				}

				if (root.left != null) {
					pq.add(root.left);
				}
				if (root.right != null) {
					pq.add(root.right);
				}
			}
		}
	}
}
