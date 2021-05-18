package com.manish.javadev.tree;

import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfTree {
	public static void main(String[] args) {
		BSTNode root = BSTDefaultTree2.getDefaultTree();
		RightViewOfTree levelOrderTraversal = new RightViewOfTree();
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
				if (i == 1) {
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
