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
 * @author kmamani
 *
 */
public class AVLTree {
	public static void main(String[] args) {
		Node root = null;
		AVLTree tree = new AVLTree();
		root = tree.insert(root, 20);
		root = tree.insert(root, 25);
		root = tree.insert(root, 30);
		root = tree.insert(root, 10);
		root = tree.insert(root, 5);

		tree.display(root);
	}
	public Node insertNode(Node root, int data) {
		Node node = root;
		return insert(node, data);
	}

	public Node insert(Node crr, int data) {

		if (crr == null) {
			return new Node(data);
		}
		if (crr.data > data) {
			crr.left = insert(crr.left, data);
		} else {
			crr.right = insert(crr.right, data);
		}
		crr.height = Math.max(height(crr.left), height(crr.right)) + 1;

		int bf = balanceFactor(crr);

		// LL Case
		if (bf > 1 && data < crr.left.data) {
			return rightRotate(crr);
		}

		// RR Case
		if (bf < -1 && data > crr.right.data) {
			return leftRotate(crr);
		}

		// LR Case
		if (bf > 1 && data > crr.left.data) {
			crr.left = leftRotate(crr.left);
			return rightRotate(crr);
		}

		// RL Case
		if (bf < -1 && data < crr.right.data) {
			crr.right = rightRotate(crr.right);
			return leftRotate(crr);
		}
		return crr;
	}

	private int height(Node node) {
		if (node == null) {
			return 0;
		}
		return node.height;
	}

	private int balanceFactor(Node node) {
		if (node == null) {
			return 0;
		}
		return height(node.left) - height(node.right);
	}

	private Node rightRotate(Node crr) {

		Node tmp = crr.left;
		Node tmpRight = tmp.right;

		// rotate
		tmp.right = crr;
		crr.left = tmpRight;

		// height update
		crr.height = Math.max(height(crr.left), height(crr.right)) + 1;
		tmp.height = Math.max(height(tmp.left), height(tmp.right)) + 1;

		return tmp;
	}

	private Node leftRotate(Node crr) {

		Node tmp = crr.right;
		Node tmpLeft = tmp.left;

		// rotate
		tmp.left = crr;
		crr.right = tmpLeft;

		// height update
		crr.height = Math.max(height(crr.left), height(crr.right)) + 1;
		tmp.height = Math.max(height(tmp.left), height(tmp.right)) + 1;

		return tmp;
	}

	public void display(Node crr) {
		if (crr != null) {
			System.out.print(crr.data + "\t");
			display(crr.left);
			display(crr.right);
		}
	}
}