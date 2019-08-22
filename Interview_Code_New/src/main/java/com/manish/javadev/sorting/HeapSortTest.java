package com.manish.javadev.sorting;

public class HeapSortTest {
	public void sort(int arr[]) {
		int n = arr.length;

		// Build Max-heap
		// Root node should be greater than left and right child
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// Sort the Max-Heap
		for (int i = n - 1; i >= 0; i--) {
			// Move root to end,so that last element got placed at proper
			// position
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			// Build Max-heap gain
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i) {
		int max = i; // Initialize largest as root
		int left = 2 * i + 1; // left = 2*i + 1
		int right = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (left < n && arr[left] > arr[max])
			max = left;

		// If right child is larger than root
		if (right < n && arr[right] > arr[max])
			max = right;

		// If largest is not root
		if (max != i) {
			// Swap Current root and max, max is nothing but maximum element for
			// current root(left and right child).
			swapArrayElement(arr, i, max);
			// Recursively heapify the affected sub-tree
			heapify(arr, n, max);
		}
	}

	private void swapArrayElement(int[] arr, int i, int max) {
		int swap = arr[i];
		arr[i] = arr[max];
		arr[max] = swap;
	}

	static void display(int arr[]) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + "\t");
		}

	}

	// Client program
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		HeapSortTest ob = new HeapSortTest();
		ob.sort(arr);

		System.out.println("Sorted array is");
		display(arr);

		int[] array = { 30, 48, 29, 32, 46 };

		ob.sort(array);

		System.out.println("Sorted array is");
		display(array);
	}
}
