package com.manish.javadev.array;

public class SecondSmallestNumberInArray {
	/*
	 * Function to print first smallest and second smallest elements
	 */
	static void print2Smallest(int arr[]) {
		int firstSmallest, secondSmaalest;

		/* There should be atleast two elements */
		if (arr.length < 2) {
			System.out.println(" Invalid Input ");
			return;
		}

		firstSmallest = secondSmaalest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstSmallest) {
				secondSmaalest = firstSmallest;
				firstSmallest = arr[i];
			}
			if (arr[i] < secondSmaalest && arr[i] != firstSmallest) {
				secondSmaalest = arr[i];
			}
		}

		System.out.println("The first smallest element is " + firstSmallest + "\nand second Smallest" + " element is "
				+ secondSmaalest);
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int arr[] = { 10, 3, 5, 1 };
		print2Smallest(arr);
	}
}
/* This code is contributed by Devesh Agrawal */
