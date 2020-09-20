package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * This Program will take array as input, first will construct a max heap and
 * then will use heap sort
 * 
 * @author kmamani
 *
 */
public class HeapSortWithMaxHeapify {

	public static void main(String[] args) {
		// int arr[] = { 11, 12, 13, 5, 6, 7, 14 };
		int arr[] = { 12, 11, 13, 5, 6, 7, 8, 4, 3 };
		HeapSortWithMaxHeapify hs = new HeapSortWithMaxHeapify();
		hs.sort(arr);
		System.out.println("Sorted array is");
		System.out.println(Arrays.toString(arr));
		
	}

	/**
	 * Display Max Heap
	 * 
	 * @param heap
	 */
	public static void print(int[] heap) {
		int size = heap.length;
		for (int i = 0; i < size / 2; i++) {
			System.out.print(
					" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2 * i + 1] + " RIGHT CHILD :" + heap[2 * i + 2]);
			System.out.println();
		}
	}

	public void sort(int arr[]) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);
		print(arr);
		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			swapNode(arr, i, 0);
			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int size, int curr) {
		int largest = curr; // Initialize largest as root
		int l = 2 * curr + 1; // left = 2*i + 1
		int r = 2 * curr + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < size && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < size && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != curr) {
			swapNode(arr, largest, curr);
			// Recursively heapify the affected sub-tree
			heapify(arr, size, largest);
		}
	}

	private void swapNode(int[] arr, int start, int left) {
		int temp;
		temp = arr[start];
		arr[start] = arr[left];
		arr[left] = temp;
	}
}
