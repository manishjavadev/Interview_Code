package com.manish.javadev.array;

public class SecondSmallest {
	/*
	 * Function to print first smallest and second smallest elements
	 */
	static void print2Smallest(int arr[]) {
		int first, second;

		/* There should be atleast two elements */
		if (arr.length < 2) {
			System.out.println(" Invalid Input ");
			return;
		}

		first = second = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			}
			if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}

		System.out.println("The first smallest element is " + first
				+ "\nand second Smallest" + " element is " + second);
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int arr[] = { 12, 13, 8, 10, 34, 0 };
		print2Smallest(arr);
	}
}
/* This code is contributed by Devesh Agrawal */
