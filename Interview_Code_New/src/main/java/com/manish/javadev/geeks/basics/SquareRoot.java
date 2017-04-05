package com.manish.javadev.geeks.basics;

/**
 * http://www.geeksforgeeks.org/square-root-of-an-integer/
 * 
 * Given an integer x, find square root of it. If x is not a perfect square,
 * then return floor(√x).
 * 
 * Examples:
 * 
 * Input: x = 4 Output: 2
 * 
 * Input: x = 11 Output: 3 We strongly recommend you to minimize your browser
 * and try this yourself first.
 * 
 * There can be many ways to solve this problem. For example Babylonian Method
 * is one way.
 * 
 * A Simple Solution to find floor of square root is to try all numbers starting
 * from 1. For every tried number i, if i*i is smaller than x, then increment i.
 * We stop when i*i becomes more than or equal to x. Below is C++ implementation
 * of above idea.
 * 
 * 
 * 
 * =================================Best Way======================
 * A Better Solution to do Binary Search.
 * 
 * Let 's' be the answer. We know that 0 <= s <= x.
 * 
 * Consider any random number r.
 * 
 * If r*r <= x, s >= r
 * 
 * If r*r > x, s < r.
 * 
 * 
 * 
 * Algorithm:
 * 
 * 1) Start with 'start' = 0, end = 'x',
 * 
 * 2) Do following while 'start' is smaller than or equal to 'end'.
 * 
 * a) Compute 'mid' as (start + end)/2
 * 
 * b) compare mid*mid with x.
 * 
 * c) If x is equal to mid*mid, return mid.
 * 
 * d) If x is greater, do binary search between mid+1 and end.
 * 
 * In this case, we also update ans (Note that we need floor). e) If x is
 * smaller, do binary search between start and mid-1
 * 
 * Below is C++ implementation of above idea. C/C++Java
 * 
 * 
 * 
 * @author m.d.srivastava
 * 
 */
public class SquareRoot {
	public static void main(String[] args) {
		double result = floorSqrt(6);
		System.out.println(result);
	}

	public static int floorSqrt(int x) {
		// Base Cases
		if (x == 0 || x == 1)
			return x;

		// Do Binary Search for floor(sqrt(x))
		int start = 1, end = x, ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;

			// If x is a perfect square
			if (mid * mid == x)
				return mid;

			// Since we need floor, we update answer when mid*mid is
			// smaller than x, and move closer to sqrt(x)
			if (mid * mid < x) {
				start = mid + 1;
				ans = mid;
			} else
				// If mid*mid is greater than x
				end = mid - 1;
		}
		return ans;
	}

}
