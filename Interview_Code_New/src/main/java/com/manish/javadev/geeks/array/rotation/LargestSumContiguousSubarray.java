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
		int max = a[0];
		int sum = a[0];

		for (int i = 0; i < size; i++) {
			sum = sum + a[i];
			if (max < sum) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}

	static void maxSubArraySumWithIndex(int a[], int size) {
		int max = a[0];
		int sum = a[0];
		int start = 0;
		int end = 0;
		int s = 0;

		for (int i = 1; i < size; i++) {
			sum += a[i];

			if (max < sum) {
				max = sum;
				start = s;
				end = i;
			}
			if (sum < 0) {
				sum = 0;
				s = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is " + max);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}

}
