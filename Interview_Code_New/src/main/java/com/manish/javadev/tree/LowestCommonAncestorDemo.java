package com.manish.javadev.tree;

public class LowestCommonAncestorDemo {
	public static void main(String[] args) {
		LowestCommonAncestorDemo fixture = new LowestCommonAncestorDemo();
		BSTNode root = null;
		BSTNode root1 = null;
		BSTNode root2 = null;
		BSTNode root3 = fixture.lowestCommonAncestor(root, root1, root2);
	}

	private BSTNode lowestCommonAncestor(BSTNode root, BSTNode node1, BSTNode node2) {
		if (root == null)
			return root;
		if (root == node1 && root == node2)
			return root;
		BSTNode left = lowestCommonAncestor(root.left, node1, node2);
		BSTNode right = lowestCommonAncestor(root.right, node1, node2);
		/*
		 * if(not left) return right else if(not right) return left else return root
		 */
		return right;
	}

}
