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

	private static int countPathsWithoutRecursion(int n) {
		/**
		 * Why taken n+1 length array, because if you want to store 2 element in array
		 * then length should be 3 if you want to store 5 element then length should be
		 * 6, look last line we are returning last element so length be greater than by
		 * 1 of n, otherwise will get IndexOutOfBoundException
		 */
		int dp[] = new int[n + 1];

		dp[0] = 1;
		for (int i = 1; i < dp.length; i++) {
			if (i == 1) {
				dp[i] = dp[i - 1];
			} else if (i == 2) {
				dp[i] = dp[i - 1] + dp[i - 2];
			} else {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}
		}
		return dp[n];
	}
}
