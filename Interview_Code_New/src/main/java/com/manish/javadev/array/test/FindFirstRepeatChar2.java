package com.manish.javadev.array.test;

import java.util.Arrays;

public class FindFirstRepeatChar2 {
	public static void findRepeatFirst() {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		findRepeatFirst();
	}
}
