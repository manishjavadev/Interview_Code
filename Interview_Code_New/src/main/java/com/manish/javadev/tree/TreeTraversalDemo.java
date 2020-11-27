package com.manish.javadev.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class TreeTraversalDemo {
	public static void main(String[] args) {
		BSTNode root = BSTDefaultTree.getDefaultTree();
		System.out.println("Enter For Pre-Order 1\nEnter For Post-Order 2\nEnter For In-Order 3\n ");
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		if (flag == 1) {
			preOrder(root);
		}
		if (flag == 2) {
			postOrder(root);
		}
		if (flag == 3) {
			boolean inOrder = inOrder(root);
			System.out.println("Result ::" + inOrder);
		}
	}

	// Node, left, right
	public static void preOrder(BSTNode root) {
		Stack<BSTNode> stack = new Stack<BSTNode>();
		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			BSTNode cur = stack.pop();
			System.out.println(cur.data);
			queue.add(cur);
			if (cur.right != null) {
				stack.push(cur.right);
			}
			if (cur.left != null) {
				stack.push(cur.left);
			}
		}
		System.out.println("Display for preOrder from Queue");
		for (BSTNode node : queue) {
			System.out.println(node.data);
		}
	}

	public static boolean inOrder(BSTNode root) {
		int prev = Integer.MIN_VALUE;
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
					BSTNode top = stack.pop();
					if (top.data <= prev) {
						return false;
					}
					prev = top.data;
					queue.add(top);
					cur = top.right;
				}
			}
		}
		return true;

	}

	/**
	 * Post order we can not handle using one stack, so we need to use two stack to
	 * manage output
	 * 
	 * @param root
	 */
	public static void postOrder(BSTNode root) {
		Stack<BSTNode> stack = new Stack<BSTNode>();
		Stack<BSTNode> out = new Stack<BSTNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			BSTNode cur = stack.pop();
			out.push(cur);
			if (cur.left != null) {
				stack.push(cur.left);
			}
			if (cur.right != null) {
				stack.push(cur.right);
			}
		}
		System.out.println("Display for postOrder from Queue");
		while (!out.empty()) {
			System.out.println(out.pop().data);
		}
	}

}
