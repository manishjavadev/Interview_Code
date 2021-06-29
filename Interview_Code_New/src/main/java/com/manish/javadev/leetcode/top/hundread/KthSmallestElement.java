package com.manish.javadev.leetcode.top.hundread;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		// int arr[] = { 11, 12, 13, 5, 6, 7, 14 };
		int arr[] = { 14, 12, 13, 5, 6, 7, 11 };
		KthSmallestElement hs = new KthSmallestElement();
		int k = 2;
		int result = hs.findKthSmallestElement(arr, k);
		System.out.println(k + " th Smallest Element is :: " + result);
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

	public int findKthSmallestElement(int arr[], int k) {
		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);
		print(arr);
		for (int i = n - 1; i >= n - k + 1; i--) {
			swapNode(arr, i, 0);
			heapify(arr, i, 0);
		}
		return arr[0];
	}

	void heapify(int arr[], int size, int curr) {
		int min = curr; // Initialize largest as root
		int l = 2 * curr + 1; // left = 2*i + 1
		int r = 2 * curr + 2; // right = 2*i + 2
		if (l < size && arr[l] < arr[min])
			min = l;
		if (r < size && arr[r] < arr[min])
			min = r;
		if (min != curr) {
			swapNode(arr, min, curr);
			heapify(arr, size, min);
		}
	}

	private void swapNode(int[] arr, int start, int left) {
		int temp;
		temp = arr[start];
		arr[start] = arr[left];
		arr[left] = temp;
	}
}
