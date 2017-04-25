package com.manish.javadev.geeks.array;

import java.util.Arrays;
import java.util.HashMap;

public class FindFrequencyofDigit {
	int arr[] = { 1, 3, 9, 3, 9, 2, 2, 5, 6, 2 };
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		FindFrequencyofDigit ffd = new FindFrequencyofDigit();
		ffd.getDuplicateCount();
		System.out.println(map);
	}

	private void getDuplicateCount() {
		Arrays.sort(arr);
		findFrequecncy(arr, 0, arr.length - 1);

	}

	private void findFrequecncy(int[] arr2, int low, int high) {
		if (arr[low] == arr[high]) {
			if (map.containsKey(arr[low])) {
				map.put(arr[low], map.get(arr[low]) + (high - low + 1));
			} else {
				map.put(arr[low], high - low + 1);
			}

		} else {
			int mid = (low + high) / 2;
			findFrequecncy(arr, low, mid);
			findFrequecncy(arr, mid + 1, high);
		}
	}
}
