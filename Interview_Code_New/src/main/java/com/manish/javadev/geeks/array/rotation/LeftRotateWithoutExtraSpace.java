package com.manish.javadev.geeks.array.rotation;

public class LeftRotateWithoutExtraSpace {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		int n = arr.length;

		int k = 2;
		leftRotate(arr, n, k);

		k = 3;
		leftRotate(arr, n, k);

		k = 4;
		leftRotate(arr, n, k);
	}

	// Function to leftRotate array multiple times
	static void leftRotate(int arr[], int n, int k) {
		// Prints the rotated array from start position
		for (int i = 0; i < n; i++) {
			int index = ((i + k) % n);
			System.out.print(arr[index] + " ");
		}

		System.out.println();
	}

}
