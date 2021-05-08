package com.manish.javadev.tdd;

public class SecondSmallestNumberInArray {
	/*
	 * Function to print first smallest and second smallest elements
	 */
	static void print2Smallest(int arr[]) {
		int fsm, ssm;

		/* There should be atleast two elements */
		if (arr.length < 2) {
			System.out.println(" Invalid Input ");
			return;
		}

		fsm = ssm = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < fsm) {
				ssm = fsm;
				fsm = arr[i];
			}
			if (arr[i] < ssm && arr[i] != fsm) {
				ssm = arr[i];
			}
		}

		System.out.println("The first smallest element is " + fsm + "\nand second Smallest" + " element is " + ssm);
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int arr[] = { 10, 3, 5, 1 };
		print2Smallest(arr);
	}
}
/* This code is contributed by Devesh Agrawal */
