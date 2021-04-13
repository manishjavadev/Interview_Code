package com.manish.javadev.geeks.array.rotation;

/**
 * https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 * 
 * Explanation: Simple idea of the Kadane positive contiguous segments of the
 * array (max_ending_here is used for this). And keep track of maximum sum
 * contiguous segment among all positive segments (max_so_far is used for this).
 * Each time we get a positive sum compare it with max_so_far and update
 * max_so_far if it is greater than max_so_far
 * 
 * 
 * Lets take the example: {-2, -3, 4, -1, -2, 1, 5, -3}
 * 
 * max_so_far = max_ending_here = 0
 * 
 * for i=0, a[0] = -2 max_ending_here = max_ending_here + (-2) Set
 * max_ending_here = 0 because max_ending_here < 0
 * 
 * for i=1, a[1] = -3 max_ending_here = max_ending_here + (-3) Set
 * max_ending_here = 0 because max_ending_here < 0
 * 
 * for i=2, a[2] = 4 max_ending_here = max_ending_here + (4) max_ending_here = 4
 * max_so_far is updated to 4 because max_ending_here greater than max_so_far
 * which was 0 till now
 * 
 * for i=3, a[3] = -1 max_ending_here = max_ending_here + (-1) max_ending_here =
 * 3
 * 
 * for i=4, a[4] = -2 max_ending_here = max_ending_here + (-2) max_ending_here =
 * 1
 * 
 * for i=5, a[5] = 1 max_ending_here = max_ending_here + (1) max_ending_here = 2
 * 
 * for i=6, a[6] = 5 max_ending_here = max_ending_here + (5) max_ending_here = 7
 * max_so_far is updated to 7 because max_ending_here is greater than max_so_far
 * 
 * for i=7, a[7] = -3 max_ending_here = max_ending_here + (-3) max_ending_here =
 * 4
 *
 * @author kmamani
 *
 */
public class LargestSumContiguousSubarrayUsingKadane {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		maxSubArraySum(a);
		maxSubArraySum(a, a.length);
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max = 0, crr_sum = 0;

		for (int i = 0; i < size; i++) {
			crr_sum = crr_sum + a[i];
			if (max < crr_sum)
				max = crr_sum;
			if (crr_sum < 0)
				crr_sum = 0;
		}
		return max;
	}

	static int maxSubArraySum1(int a[]) {
		int size = a.length;
		int max = Integer.MIN_VALUE, sum = 0;

		for (int i = 0; i < size; i++) {
			sum = sum + a[i];
			if (max < sum)
				max = sum;
			if (sum < 0)
				sum = 0;
		}
		return max;
	}

	static void maxSubArraySum(int a[], int size) {
		int max = 0;
		int sum = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < size; i++) {
			sum += a[i];

			if (sum > max) {
				max = sum;
				end = i;
			}

			if (sum < 0) {
				sum = 0;
				start = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is " + max);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}
}
