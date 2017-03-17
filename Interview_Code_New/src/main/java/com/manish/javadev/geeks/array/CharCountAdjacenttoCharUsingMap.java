package com.manish.javadev.geeks.array;

import java.util.HashMap;

public class CharCountAdjacenttoCharUsingMap {

	char arr[] = { 'a', 'b', 'c', 'c', 'c', 'd', 'd' };
	static HashMap<Character, Integer> map = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		CharCountAdjacenttoCharUsingMap ffd = new CharCountAdjacenttoCharUsingMap();
		ffd.getDuplicateCount();
		System.out.println(map);
	}

	private void getDuplicateCount() {
		findFrequecncy(arr, 0, arr.length - 1);
	}

	private void findFrequecncy(char[] tempArr, int low, int high) {
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
