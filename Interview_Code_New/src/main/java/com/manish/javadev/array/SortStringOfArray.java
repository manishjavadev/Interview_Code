package com.manish.javadev.array;

import java.util.Arrays;

/**
 * This program sorting string of array in acceding order
 * 
 * @author Manish Srivastava
 *
 */

public class SortStringOfArray {
	public static void main(String[] args) {
		String[] arr = { "BB", "HH", "AA", "JJ", "NN", "MM" };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("\nDone");
	}
}
