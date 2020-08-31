package com.manish.javadev.geeks.array.rotation;

/**
 * 
 * 
 * The time complexity of the above solution is O(n). The step to find the pivot
 * can be optimized to O(Logn) using the Binary Search approach discussed here.
 * 
 * How to count all pairs having sum x? The stepwise algo is:
 * 
 * Find the pivot element of the sorted and the rotated array. The pivot element
 * is the largest element in the array. The smallest element will be adjacent to
 * it. Use two pointers (say left and right) with the left pointer pointing to
 * the smallest element and the right pointer pointing to largest element. Find
 * the sum of the elements pointed by both the pointers. If the sum is equal to
 * x, then increment the count. If the sum is less than x, then to increase sum
 * move the left pointer to next position by incrementing it in a rotational
 * manner. If the sum is greater than x, then to decrease sum move the right
 * pointer to next position by decrementing it in rotational manner. Repeat step
 * 3 and 4 until the left pointer is not equal to the right pointer or until the
 * left pointer is not equal to right pointer � 1. Print final count.
 * 
 * @author kmamani
 *
 */
public class FindAllPairWithGivenSumInSortedRotatedArray {

	// Driver Code
	public static void main(String[] args) {
		int arr[] = { 11, 15, 6, 7, 9, 10 };
		int sum = 17;
		int n = arr.length;
		System.out.println(pairsInSortedRotated(arr, n, sum));
	}

	// This function returns
	// count of number of pairs
	// with sum equals to x.
	static int pairsInSortedRotated(int arr[], int n, int keySum) {
		// Find the pivot element.
		int pivot = findPivot(arr, 0, arr.length);

		// r is index of largest element.
		int r = pivot;

		// l is index of smallest element.
		int l = pivot + 1;

		// Variable to store count of number of pairs.
		int cnt = 0;

		// Find sum of pair formed by arr[l] and arr[r] and update l, r and cnt
		// accordingly.
		while (l != r) {
			// If we find a pair with sum x, then increment cnt, move l and r to
			// next element.
			if (arr[l] + arr[r] == keySum) {
				cnt++;

				// This condition is required to be checked, otherwise l and r
				// will cross each other and loop will never terminate.
				if (l == (n + r - 1) % n) {
					return cnt;
				}

				l = (l + 1) % n;
				r = (n + r - 1) % n;
			}

			// If current pair sum is less, move to the higher sum side.
			else if (arr[l] + arr[r] < keySum)
				l = (l + 1) % n;
			// If current pair sum is greater, move to the lower sum side.
			else
				r = (n + r - 1) % n;
		}
		return cnt;
	}

	static int findPivot(int arr[], int low, int high) {
		if (arr[0] < arr[arr.length - 1]) {
			return -1;
		}
		if (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > arr[mid + 1])
				return mid;

			if (arr[low] <= arr[mid])
				return findPivot(arr, mid + 1, high);
			return findPivot(arr, low, mid - 1);
		}
		return -1;
	}
}
