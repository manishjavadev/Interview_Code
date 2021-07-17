package com.manish.javadev.leetcode.top.hundread;

import java.util.Arrays;

/**
 * 
 * https://www.youtube.com/watch?v=PUSVTRzqEWE&t=61s
 * 
 * 0 = > 0000
 * 
 * 1 = > 0001
 * 
 * 2 = > 0010
 * 
 * 3 = > 0011
 * 
 * 4 = > 0100
 * 
 * 5 = > 0101
 * 
 * 6 = > 0110
 * 
 * 7 = > 0111
 * 
 * 8 = > 1000
 * 
 * 9 = > 1001
 * 
 * 10 = > 1010
 * 
 * 11 = > 1011
 * 
 * 12 = > 1100
 * 
 * 13 = > 1101
 * 
 * 14 = > 1110
 * 
 * 15 = > 1110
 * 
 * 
 * Even ans is x/2 + 0
 * 
 * 
 * ODD Ans X/2 + 1
 * 
 * @author kmamani
 *
 */
public interface CountBit {
	public static void main(String[] args) {
		int n = 10;
		int result[] = countBit(n);
		System.out.println(Arrays.toString(result));
	}

	public static int[] countBit(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 0;
		for (int i = 1; i < dp.length; i++) {
			dp[i] = dp[i / 2] + i % 2;
		}
		return dp;
	}

}
