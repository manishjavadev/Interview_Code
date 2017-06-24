package com.manish.javadev.tree;

public class BSTSearch {
	static BSTNode start;
	static BSTNode current;

	public static void main(String[] args) {
		BSTSearch bstSearch = new BSTSearch();
		BSTNode root = bstSearch.findWithOutRecursion(
				BSTDefaultTree.getDefaultTree(), 40);
		if (root == null) {
			System.out.println("requested data is not there");
		} else {
			System.out.println(root.data);
		}

		root = bstSearch.findWithRecursion(BSTDefaultTree.getDefaultTree(), 40);
		if (root == null) {
			System.out.println("requested data is not there");
		} else {
			System.out.println(root.data);
		}

	}

	private BSTNode findWithOutRecursion(BSTNode root, int data) {

		current = root;
		if (current == null) {
			return current;
		}
		while (current != null) {
			if (current.data == data) {
				return current;
			}
			if (current.data > data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return null;
	}

	private BSTNode findWithRecursion(BSTNode root, int data) {

		current = root;
		if (current == null) {
			return current;
		}
		if (current.data == data) {
			return current;
		}
		if (current.data > data) {
			current = current.left;
			return findWithRecursion(current, data);
		} else {
			current = current.right;
			return findWithRecursion(current, data);
		}

	}
}
