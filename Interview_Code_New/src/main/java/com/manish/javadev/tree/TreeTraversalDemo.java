package com.manish.javadev.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalDemo {
	public static void main(String[] args) {
		BSTNode root = BSTDefaultTree.getDefaultTree();
		preOrder(root);
	}

	public static void preOrder(BSTNode root) {
		Stack<BSTNode> stack = new Stack<BSTNode>();
		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			BSTNode cur = stack.peek();
			stack.pop();
			queue.add(cur);
			if (cur.right != null) {
				stack.push(cur.right);
			}
			if (cur.left != null) {
				stack.push(cur.left);
			}
		}
		System.out.println("Display from Queue");
		for (BSTNode node : queue) {
			System.out.println(node.data);
		}
	}

	public static void inOrder(BSTNode root) {
		Stack<BSTNode> stack = new Stack<BSTNode>();
		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		boolean done = false;
		BSTNode cur = root;
		while (!done) {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			} else {
				if (stack.empty()) {
					done = true;
				} else {
					BSTNode top = stack.peek();
					stack.pop();
					queue.add(top);
					cur = top.right;
				}
			}
		}
		System.out.println("Display from Queue");
		for (BSTNode node : queue) {
			System.out.println(node.data);
		}
	}

	public static void postOrder(BSTNode root) {
		Stack<BSTNode> stack = new Stack<BSTNode>();
		Stack<BSTNode> out = new Stack<BSTNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			BSTNode cur = stack.peek();
			stack.pop();
			out.push(cur);
			if (cur.left != null) {
				stack.push(cur.left);
			}
			if (cur.right != null) {
				stack.push(cur.right);
			}
		}
		System.out.println("Display from Queue");
		while (!out.empty()) {
			System.out.println(out.pop().data);
		}
	}

}
