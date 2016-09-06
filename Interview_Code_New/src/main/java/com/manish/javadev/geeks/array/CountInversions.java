package com.manish.javadev.geeks.array;

public class CountInversions {
	public static void main(String[] args) {
		int arr[] = { 1, 20, 6, 4, 5 };
		System.out.println(getInvCount(arr));
	}

	private static int getInvCount(int[] arr) {
		int inv_count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])
					inv_count++;

			}
		}

		return inv_count;
	}
}
