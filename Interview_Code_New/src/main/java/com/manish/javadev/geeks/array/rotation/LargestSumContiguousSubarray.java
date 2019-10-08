package com.manish.javadev.geeks.array.rotation;

/*
 * https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class LargestSumContiguousSubarray {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		maxSubArraySumWithIndex(a, a.length);
		// maxSubArraySum11(a, a.length);
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 0; i < size; i++) {
			curr_max = curr_max + a[i];
			if (max_so_far < curr_max)
				max_so_far = curr_max;
			if (curr_max < 0)
				curr_max = 0;
		}
		return max_so_far;
	}

	static void maxSubArraySumWithIndex(int a[], int size) {
		int max_so_far = a[0];
		int curr_max = a[0];
		int start = 0;
		int end = 0;
		int s = 0;

		for (int i = 1; i < size; i++) {
			curr_max += a[i];

			if (max_so_far < curr_max) {
				max_so_far = curr_max;
				start = s;
				end = i;
			}

			if (curr_max < 0) {
				curr_max = 0;
				s = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is " + max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}

}
