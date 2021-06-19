package com.manish.javadev.leetcode.top.hundread;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalDemo {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right =  new TreeNode(2);
		root.right.left =  new TreeNode(3);
		InorderTraversalDemo iot  =  new InorderTraversalDemo();
		iot.inorderTraversal(root);
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if (root == null) {

			return list;
		}
		boolean done = false;
		Stack<TreeNode> s = new Stack<TreeNode>();

		
		TreeNode crr = root;
		while (!done) {
			if (crr != null) {
				s.add(crr);
				crr = crr.left;
			} else {
				if (s.isEmpty()) {
					done = true;
				} else {
					TreeNode top = s.pop();
					System.out.println(top.val);
					list.add(top.val);
					crr = top.right;
				}
			}
		}
		return list;
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
