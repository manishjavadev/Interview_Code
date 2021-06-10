package com.manish.javadev.leetcode.top.hundread;

import java.util.Scanner;
/**
 * https://www.youtube.com/watch?v=A6mOASLl2Dg
 * @author kmamani
 *
 */
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
		if(dp[n] > 0) {
			return dp[n];
		}
		int one = countPaths(n - 1, dp);
		int two = countPaths(n - 2, dp);
		int three = countPaths(n - 3, dp);
		int result = one + two + three;
		dp[n] = result;
		return result;

	}

	private static int countPathsWithoutRecursion(int n) {
		/**
		 * Why taken n+1 length array, because, if you want to store 2 index in array
		 * then length should be 3 if you want to store 5 index then length should be
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
