package com.manish.javadev.geeks.array;

import java.util.HashMap;

public class SurparserUsingMergeSortBest {
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	static int[] arr = { 4, 6, 3, 9, 7, 10 };
	static int[] tempArry = { 4, 6, 3, 9, 7, 10 };
	static int temp[] = new int[arr.length];

	public static void merge(int[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		int countSurparser = 0;
		while (i <= mid && j <= high) {
			if (arr[i] > arr[j]) {
				storeInMap(arr, i, countSurparser);
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
				countSurparser++;
			}
		}
		while (i <= mid) {
			storeInMap(arr, i, countSurparser);
			temp[k++] = arr[i++];
		}
		while (j <= high) {
			temp[k++] = arr[j++];
		}
		for (i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
	}

	private static void storeInMap(int[] arr, int i, int key) {
		if (map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i]) + key);
		} else {
			map.put(arr[i], key);
		}
	}

	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void main(String[] args) {
		mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < tempArry.length; i++) {
			System.out.print(map.get(tempArry[i]) + " ");
		}
	}
}
