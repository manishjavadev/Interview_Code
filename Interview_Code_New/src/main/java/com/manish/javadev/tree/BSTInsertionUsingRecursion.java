package com.manish.javadev.tree;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class BSTInsertionUsingRecursion {

	public static void main(String[] args) {
		BSTNode root = null;
		BSTInsertionUsingRecursion tree = new BSTInsertionUsingRecursion();
		root = tree.insert(root, 20);
		root = tree.insert(root, 25);
		root = tree.insert(root, 30);
		root = tree.insert(root, 10);
		root = tree.insert(root, 5);

		tree.display(root);
	}

	private void display(BSTNode root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			display(root.left);
			display(root.right);
		}

	}

	private BSTNode insert(BSTNode root, int data) {
		if (root == null) {
			return new BSTNode(data);
		}
		if (root.data > data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		if (root.data == data) {
			try {
				throw new Exception("IllegalArgumentException");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return root;
	}
}
