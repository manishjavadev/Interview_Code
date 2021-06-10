package com.manish.javadev.leetcode.top.hundread;

import com.manish.javadev.tree.Node;

public class DiameterOfBinaryTree {
	public static void main(String[] args) {
		Node root = getDefaultNode();

		int result = getDiameterOfBinaryTree(root);
		System.out.println(result);
		System.out.println("Diameter Of Binary Tree ::: " + result);
		root = getDefaultNode();
		DiaPair result1 = getDiameter(root);
		System.out.println("Diameter Of Binary Tree ::: " + result1.dia);

	}

	private static Node getDefaultNode() {
		// Root of the Binary Tree
		Node root = new Node(40);

		root.left = new Node(30);

		root.right = new Node(50);

		root.left.left = new Node(20);
		//root.left.left.left = new Node(10);
		//root.left.left.right = new Node(25);

		root.left.right = new Node(35);
		//root.left.right.left = new Node(32);
		//root.left.right.right = new Node(37);

		root.right.left = new Node(45);
		root.right.right = new Node(60);
		return root;
	}

	private static int getDiameterOfBinaryTree(Node root) {
		if (root == null) {
			return 0;
		}
		int ld = getDiameterOfBinaryTree(root.left);
		int rd = getDiameterOfBinaryTree(root.right);
		int h = Math.max(height(root.left), height(root.right)) + 2;
		return Math.max(h, Math.max(ld, rd));

	}

	public static DiaPair getDiameter(Node root) {
		if (root == null) {
			DiaPair dp = new DiaPair();
			dp.h = -1;
			dp.dia = 0;
			return dp;
		}
		DiaPair ld = getDiameter(root.left);
		DiaPair rd = getDiameter(root.right);
		DiaPair mdp = new DiaPair();
		mdp.h = Math.max(ld.h, rd.h) + 1;
		int fes = ld.h + rd.h + 2;
		mdp.dia = Math.max(fes, Math.max(ld.dia, rd.dia));
		return mdp;

	}

	private static int height(Node root) {

		if (root == null) {
			return 0;
		} else {
			return Math.max(height(root.left), height(root.right)) + 1;
		}
	}

}
