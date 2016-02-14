package com.manish.javadev.tree;

class BSTNodeTest {
	int data;
	BSTNodeTest left;
	BSTNodeTest right;

}

public class BSTInsertion {
	static BSTNodeTest start;
	static BSTNodeTest current;

	public static void main(String[] args) {

		BSTNodeTest root = insert(current, 10);
		insert(root, 20);
		insert(root, 5);
		insert(root, 2);
		System.out.println("manishjavadev.com – Binary Tree Inorder Traversal");
		preOrder(root);
	}
	public static void preOrder(BSTNodeTest root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	private static BSTNodeTest find(BSTNodeTest root, int data) {

		//This block for recursion 
		if (root == null) {
			return current;
		}
		if (root.data == data) {
			return root;
		} else if (root.data < data) {
			current = root;
			return find(root.right, data);
		} else {
			current = root;
			return find(root.left, data);
		}
		//recursion end
		
		
		//This is for non recursion
		
		/*start=root;
		while (start != null) {
			if (start.data == data) {
				System.out.println("Item is already there");
			}
			current = start;
			if (start.data > data) {
				start = start.left;
			} else {
				start = start.right;
			}
		}
		return current;*/
		
		//non recursion  end
		
		
	}

	private static BSTNodeTest insert(BSTNodeTest root, int data) {
		start = root;
		current = find(root,data);
		
		BSTNodeTest node = new BSTNodeTest();
		node.data = data;
		if (root == null) {
			return node;
		}

		if (current.data > data) {
			current.left = node;
		} else {
			current.right = node;
		}
		return root;
	}
}
