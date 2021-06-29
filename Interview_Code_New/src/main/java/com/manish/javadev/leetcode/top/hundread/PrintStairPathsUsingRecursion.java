package com.manish.javadev.leetcode.top.hundread;

import java.util.Scanner;

public class PrintStairPathsUsingRecursion {
	public static void main(String[] args) {
		System.out.println("Enter climb stairs");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		countPaths(n, "");
	}

	private static void countPaths(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		} else if (n < 0) {
			return;
		}
		countPaths(n - 1, path + 1);
		countPaths(n - 2, path + 2);
		countPaths(n - 3, path + 3);

	}
}
