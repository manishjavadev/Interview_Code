package com.manish.javadev.tree;

/**
 * Rule for AVL Tree
 * 
 * 1) It is a BST
 * 
 * 2) Balance factor (Height of left sub tree - Height of right sub tree should
 * be 1 0 -1)
 * 
 * 3) You can not insert duplicate element in BST
 * 
 * @author Manish Srivastava
 *
 */
public class AVLTree {
	public static void main(String[] args) {
		BSTNode root = null;
		AVLTree tree = new AVLTree();
		root = tree.insert(root, 20);
		root = tree.insert(root, 25);
		root = tree.insert(root, 30);
		root = tree.insert(root, 10);
		root = tree.insert(root, 5);

		tree.display(root);
	}

	public BSTNode insertNode(BSTNode root, int data) {
		BSTNode node = root;
		return insert(node, data);
	}

	public BSTNode insert(BSTNode root, int data) {

		if (root == null) {
			return new BSTNode(data);
		}
		if (root.data > data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		root.height = Math.max(height(root.left), height(root.right)) + 1;

		int bf = balanceFactor(root);

		// LL Case
		if (bf > 1 && data < root.left.data) {
			return rightRotate(root);
		}

		// RR Case
		if (bf < -1 && data > root.right.data) {
			return leftRotate(root);
		}

		// LR Case
		if (bf > 1 && data > root.left.data) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// RL Case
		if (bf < -1 && data < root.right.data) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}
		return root;
	}

	private int height(BSTNode node) {
		if (node == null) {
			return 0;
		}
		return node.height;
	}

	private int balanceFactor(BSTNode node) {
		if (node == null) {
			return 0;
		}
		return height(node.left) - height(node.right);
	}

	private BSTNode rightRotate(BSTNode crr) {

		BSTNode tmp = crr.left;
		BSTNode tmpRight = tmp.right;

		// rotate
		tmp.right = crr;
		crr.left = tmpRight;

		// height update
		crr.height = Math.max(height(crr.left), height(crr.right)) + 1;
		tmp.height = Math.max(height(tmp.left), height(tmp.right)) + 1;

		return tmp;
	}

	private BSTNode leftRotate(BSTNode crr) {

		BSTNode tmp = crr.right;
		BSTNode tmpLeft = tmp.left;

		// rotate
		tmp.left = crr;
		crr.right = tmpLeft;

		// height update
		crr.height = Math.max(height(crr.left), height(crr.right)) + 1;
		tmp.height = Math.max(height(tmp.left), height(tmp.right)) + 1;

		return tmp;
	}

	public void display(BSTNode crr) {
		if (crr != null) {
			System.out.print(crr.data + "\t");
			display(crr.left);
			display(crr.right);
		}
	}
}