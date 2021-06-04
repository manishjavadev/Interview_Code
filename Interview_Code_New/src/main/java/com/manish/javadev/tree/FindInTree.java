package com.manish.javadev.tree;

import java.util.ArrayList;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class FindInTree {
	static BSTNode start;
	static BSTNode crr;
	static ArrayList<Integer> path1 = new ArrayList<Integer>();
	static ArrayList<Integer> path2 = new ArrayList<Integer>();

	public static void main(String[] args) {
		BSTNode root = new BSTNode(30);
		BSTNode leftRoot = new BSTNode(20);
		BSTNode rightRoot = new BSTNode(40);

		leftRoot.left = new BSTNode(15);

		leftRoot.right = new BSTNode(25);
		leftRoot.right.left = new BSTNode(12);
		leftRoot.right.right = new BSTNode(22);
		leftRoot.right.right.left = new BSTNode(17);
		root.left = leftRoot;

		rightRoot.left = new BSTNode(35);
		rightRoot.right = new BSTNode(45);
		root.right = rightRoot;
		boolean result = find(root, path1, 225);
		

		result = find(root, path2, 17);
		
		System.out.println("Paths1 :: " + path1);
		System.out.println("Paths2 :: " + path2);
		int i = path1.size()-1;
		int j = path2.size()-1;
		while (i>=0 && j >=0 && path1.get(i)==path2.get(j)) {
			i--;
			j--;
		}
		i++;
		j++;
		System.out.println(path1.get(i));
			
		

	}

	private static int checkCommonAnsyster(ArrayList<Integer> path1, ArrayList<Integer> path2) {
		for (int i = path1.size()-1; i >= 0; i--) {
			if(i==path2.size()) {
				
			}
		}
		return 0;
	}

	private static void displayNodeData(BSTNode root) {
		if (root == null) {
			System.out.println("requested data is not there");
		} else {
			System.out.println(root.data);
		}
	}

	private static boolean find(BSTNode crr, ArrayList<Integer> path, int data) {

		if (crr == null) {
			return false;
		}
		if (crr.data == data) {
			path.add(crr.data);
			return true;
		}

		boolean left = find(crr.left, path, data);
		if (left) {
			path.add(crr.data);
			return true;

		}

		boolean right = find(crr.right, path, data);
		if (right) {
			path.add(crr.data);
			return true;

		}
		return false;
	}
}
