package com.manish.javadev.tree;

class MyTreeNode {
	TreeNode root;

	public MyTreeNode() {

	}

	public MyTreeNode(TreeNode root) {
		this.root = root;
	}

	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder(TreeNode root) {
		if (root != null) {

			preOrder(root.left);
			System.out.print(root.data + "\t");
			preOrder(root.right);
		}
	}

	public void postOrder(TreeNode root) {
		if (root != null) {
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.data + "\t");
		}
	}

}

public class TreeTraversalUsingRecursion {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(30);
		TreeNode tn2 = new TreeNode(10);
		TreeNode tn3 = new TreeNode(50);
		TreeNode tn4 = new TreeNode(5);
		TreeNode tn5 = new TreeNode(20);
		TreeNode tn6 = new TreeNode(40);
		TreeNode tn7 = new TreeNode(60);

		// Root left side tree which start with 8
		root.left = tn2;
		tn2.left = tn4;
		tn2.right = tn5;

		// Root right side tree which start with 8
		root.right = tn3;
		tn3.left = tn6;
		tn3.right = tn7;

		MyTreeNode mtn = new MyTreeNode(root);
		System.out.println("30, 10,50,5,20,40,60");
		System.out.println("\n");
		System.out.println("Preorder of above tree");
		mtn.preOrder(root);
		System.out.println("\n");
		System.out.println("Inorder of above tree");
		mtn.inOrder(root);
		System.out.println("\n");
		System.out.println("PostOrder of above tree");
		mtn.postOrder(root);
		System.out.println("\n");

	}

}
