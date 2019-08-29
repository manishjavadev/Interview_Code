package com.manish.javadev.tree;

public class BSTSearch {
	static BSTNode start;
	static BSTNode crr;

	public static void main(String[] args) {
		BSTSearch bstSearch = new BSTSearch();
		BSTNode root = bstSearch.findWithOutRecursion(BSTDefaultTree2.getDefaultTree(), 45);
		displayNodeData(root);

		root = bstSearch.findWithRecursion(BSTDefaultTree.getDefaultTree(), 45);
		displayNodeData(root);

	}

	private static void displayNodeData(BSTNode root) {
		if (root == null) {
			System.out.println("requested data is not there");
		} else {
			System.out.println(root.data);
		}
	}

	private BSTNode findWithOutRecursion(BSTNode root, int data) {
		crr = root;
		while (crr != null) {
			if (crr.data == data) {
				return crr;
			}
			if (crr.data > data) {
				crr = crr.left;
			} else {
				crr = crr.right;
			}
		}
		return null;
	}

	private BSTNode findWithRecursion(BSTNode root, int data) {
		crr = root;
		if (crr == null) {
			return crr;
		}
		if (crr.data == data) {
			return crr;
		}
		if (crr.data > data) {
			return findWithRecursion(crr.left, data);
		} else {
			return findWithRecursion(crr.right, data);
		}
	}
}
