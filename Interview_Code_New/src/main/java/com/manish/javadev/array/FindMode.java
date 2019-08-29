package com.manish.javadev.array;

import java.util.Arrays;

public class FindMode {

	public int findPopular(int[] arr) {

		if (arr == null || arr.length == 0)
			return 0;

		Arrays.sort(arr);

		int previous = arr[0];
		int mode = arr[0];
		int count = 1;
		int maxCount = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == previous)
				count++;
			else {
				if (count > maxCount) {
					mode = arr[i - 1];
					maxCount = count;
				}
				previous = arr[i];
				count = 1;
			}
		}

		return count > maxCount ? arr[arr.length - 1] : mode;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 3 };
		FindMode findMode = new FindMode();
		int result = findMode.findPopular(a);
		System.out.println(result);
	}

}
