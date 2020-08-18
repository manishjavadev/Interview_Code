package com.manish.javadev.geeks.array;

import java.util.HashMap;

/**
 * Logic need to correct it, as of now its not working as expected
 * 
 * @author kmamani
 *
 */
public class CharCountAdjacenttoCharUsingMap {

	char arr[] = { 'a', 'a', 'b', 'b', 'c', 'd', 'c', 'c', 'd', 'd', 'd' };
	static HashMap<Character, Integer> map = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		CharCountAdjacenttoCharUsingMap ffd = new CharCountAdjacenttoCharUsingMap();
		ffd.getDuplicateCount();
		System.out.println(map);
	}

	private void getDuplicateCount() {
		findFrequecncy(0, arr.length - 1);
	}

	private void findFrequecncy(int low, int high) {
		if (arr[low] == arr[high]) {
			map.put(arr[low], map.getOrDefault(arr[low], 0) + 1);
		} else {
			int mid = (low + high) / 2;
			findFrequecncy(low, mid);
			findFrequecncy(mid + 1, high);
		}
	}
}
