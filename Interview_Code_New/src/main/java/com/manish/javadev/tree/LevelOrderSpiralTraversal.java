package com.manish.javadev.tree;

import java.util.Stack;

public class LevelOrderSpiralTraversal {

	public static void main(String[] args) {
		BSTNode root = BSTDefaultTree2.getDefaultTree();
		LevelOrderSpiralTraversal levelOrderTraversal = new LevelOrderSpiralTraversal();
		levelOrderTraversal.spiralTree(root);
	}

	void spiralTree(BSTNode root) {
		Stack<BSTNode> s1 = new Stack<BSTNode>();
		Stack<BSTNode> s2 = new Stack<BSTNode>();
		s1.add(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				BSTNode top = s1.pop();
				System.out.print(top.data + "\t");
				if (top.left != null) {
					s2.push(top.left);
				}
				if (top.right != null) {
					s2.push(top.right);
				}
			}
			while (!s2.isEmpty()) {
				BSTNode top = s2.pop();
				System.out.print(top.data + "\t");
				if (top.right != null) {
					s1.push(top.right);
				}
				if (top.left != null) {
					s1.push(top.left);
				}
			}
		}
	}
}
