package com.manish.javadev.tree;

public class BinaryTreeDiameterDemo2 {
	public static void main(String[] args) {
		// Root of the Binary Tree
		Node root = new Node(40);

		root.left = new Node(30);

		root.right = new Node(50);

		/**root.left.left = new Node(20);
		root.left.left.left = new Node(10);
		root.left.left.right = new Node(25);

		root.left.right = new Node(35);
		root.left.right.left = new Node(32);
		root.left.right.right = new Node(37);

		root.right.left = new Node(45);
		root.right.right = new Node(60);*/

		DiaPair result = diameter(root);
		System.out.println(result.dai);
		

	}

	private static DiaPair diameter(Node root) {
		if (root == null) {
			DiaPair dp = new DiaPair();
			dp.h = -1;
			dp.dai = 0;
			return dp;
		}
		DiaPair ld = diameter(root.left);
		DiaPair rd = diameter(root.right);

		DiaPair mdp = new DiaPair();
		mdp.h = Math.max(ld.h, rd.h) + 1;

		int fes = ld.h + rd.h + 2;
		mdp.dai = Math.max(fes, Math.max(ld.dai, rd.dai));
		return mdp;

	}

	static class DiaPair {
		int h;
		int dai;
	}

}
