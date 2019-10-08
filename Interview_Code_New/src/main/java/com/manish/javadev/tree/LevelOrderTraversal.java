package com.manish.javadev.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		BSTNode root = BSTDefaultTree2.getDefaultTree();
		LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
		levelOrderTraversal.doLevelOrderTraversal(root);
	}

	void doLevelOrderTraversal(BSTNode root) {
		if (root == null)
			return;
		else {
			Queue<BSTNode> pq = new LinkedList<BSTNode>();
			pq.add(root);
			while (!pq.isEmpty()) {
				root = pq.poll();
				System.out.print(root.data + "\t");
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
