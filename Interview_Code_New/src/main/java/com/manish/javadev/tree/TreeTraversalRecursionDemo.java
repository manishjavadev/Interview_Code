package com.manish.javadev.tree;

import java.util.Scanner;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class TreeTraversalRecursionDemo {
	static int prev = -1;

	public static void main(String[] args) {
		BSTNode root = BSTDefaultTree.getDefaultTree();
		TreeTraversalRecursionDemo obj = new TreeTraversalRecursionDemo();
		boolean inOrderIsValidTree = obj.inOrderIsValidTree(root);
		System.out.println("IS Valid Tree :: " + inOrderIsValidTree);
		System.out.println("For \nPre-Order : 1\nPost-Order : 2 \nIn-Order :3");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		if (data.equals("1")) {
			System.out.println("Pre-Order");
			preOrder(root);
		}

		if (data.equals("2")) {
			System.out.println("Post-Order");
			postOrder(root);
		}

		if (data.equals("3")) {
			System.out.println("In-Order");
			inOrder(root);
		}
	}

	public static void preOrder(BSTNode root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void inOrder(BSTNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + "\t");
			inOrder(root.right);
		}
	}

	public boolean inOrderIsValidTree(BSTNode root) {
		if (root != null) {
			inOrderIsValidTree(root.left);
			System.out.print(root.data + "\t");
			if (root.data <= prev) {
				return false;
			}
			prev = root.data;
			inOrderIsValidTree(root.right);
		}
		return true;
	}

	public static void postOrder(BSTNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "\t");
		}
	}

}
