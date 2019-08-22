package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

public class ReorderArrayAccordingToGivenIdexes2 {

	public static void main(String[] args) {
		int arr[] = new int[] { 50, 40, 70, 60, 90 };
		int index[] = new int[] { 3, 0, 4, 1, 2 };
		heapSort(arr, index, arr.length);

		System.out.println("Reordered array is: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Modified Index array is:");
		System.out.println(Arrays.toString(index));
	}

	private static void heapSort(int[] arr, int[] index, int n) {
		// Build heap
		for (int i = (n - 1) / 2; i >= 0; i--) {
			heapify(arr, index, i);
		}

	}

	private static void heapify(int[] arr, int[] index, int i) {
		int largest = i;
		// left child in 0 based indexing
		int left = 2 * i + 1;
		// right child in 1 based indexing
		int right = 2 * i + 2;
		// find largest index from root, left and right child
		if (left < arr.length && index[left] > index[largest]) {
			largest = left;
		}
		if (right < arr.length && index[right] > index[largest]) {
			largest = right;
		}

		if (largest != i) {
			// swap arr whenever index is swapped
			swap(arr, largest, i);
			swap(index, largest, i);
			heapify(arr, index, largest);
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	static void reorder(int[] arr, int[] index) {
		int temp[] = new int[arr.length];

		// arr[i] should be present at index[i] index
		for (int i = 0; i < arr.length; i++)
			temp[i] = arr[index[i]];

		// Copy temp[] to arr[]
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
			index[i] = i;
		}
	}
}
