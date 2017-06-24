package com.manish.javadev.tree;

import java.util.PriorityQueue;

public class LevelOrderTraversal {

	void doLevelOrderTraversal(BSTNode root) {
		if (root == null)
			return;
		else {
			PriorityQueue<BSTNode> pq = new PriorityQueue<BSTNode>();
			pq.add(root);
			while (!pq.isEmpty()) {
				root = pq.poll();
				System.out.println(root.data + "\t");
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
