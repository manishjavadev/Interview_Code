package com.manish.javadev.techdose;

public class FindMissingNumberInArrayUsingBinarySearch {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9 };
		int findMissingNumber = findmissing(arr, arr.length);
		System.out.println("Result : " + findMissingNumber);

	}

	static int findmissing(int[] ar, int n) {

		int l = 0, r = n - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (ar[mid] != mid + 1 && ar[mid - 1] == mid)
				return (mid + 1);
			if (ar[mid] != mid + 1)
				r = mid - 1;
			else
				l = mid + 1;
		}
		return -1;
	}

}
