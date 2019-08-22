package com.manish.javadev.geeks.array.rotation;

/*
 * https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class LargestSumContiguousSubarray {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		maxSubArraySum11(a, a.length);
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}

	int maxSubArraySum(int a[], int size) {
		int max_so_far = 0, max_ending_here = 0;
		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_ending_here < 0)
				max_ending_here = 0;

			/*
			 * Do not compare for all elements. Compare only when
			 * max_ending_here > 0
			 */
			else if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
	}

	static void maxSubArraySum11(int a[], int size) {
		int max_so_far = a[0];
		int max_ending_here = 0;
		int start = 0;
		int end = 0;
		int s = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here += a[i];

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is " + max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}

}
