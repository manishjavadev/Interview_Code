package com.manish.javadev.leetcode.top.hundread;

import java.util.Scanner;

public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println("Enter climb stairs");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = countPaths(n, new int[n + 1]);
		System.out.println("Climb stairs path ::: " + result);

		System.out.println("===============");

		int result1 = countPathsWithoutRecursion(n);
		System.out.println("Climb stairs path ::: " + result1);
	}

	private static int countPaths(int n, int dp[]) {
		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		}
		if (dp[n] > 0) {
			return dp[n];
		}

		int result = countPaths(n - 1, dp) + countPaths(n - 2, dp) + countPaths(n - 3, dp);
		dp[n] = result;
		return result;

	}

	private static int countPathsWithoutRecursion(int n) {

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
