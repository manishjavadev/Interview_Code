package com.manish.javadev.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalIterativeMethod {

	public void preOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.peek();
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
		for (TreeNode node : queue) {
			System.out.println(node.data);
		}
	}

	public void inOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		boolean done = false;
		TreeNode cur = root;
		while (!done) {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			} else {
				if (stack.empty()) {
					done = true;
				} else {
					TreeNode top = stack.peek();
					stack.pop();
					queue.add(top);
					cur = top.right;
				}
			}
		}
		System.out.println("Display from Queue");
		for (TreeNode node : queue) {
			System.out.println(node.data);
		}
	}

	public void postOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<TreeNode> out = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.peek();
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
