package com.manish.javadev.geeks.array.rotation;

import java.util.Arrays;

/*
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * 
 * Array Rotation of the above array by 2 will make array ArrayRotation1
 * 
 * 
 */
public class ArrayRotationMethod2 {
	public static void main(String[] args) {
		ArrayRotationMethod2 rotate = new ArrayRotationMethod2();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.leftRotate(arr, 2, arr.length);
		rotate.printArray(arr);
	}

	private void leftRotate(int[] arr, int d, int length) {
		for (int i = 0; i < d; i++) {
			leftRotationArray(arr);
		}
		System.out.println("Done");
	}

	private void leftRotationArray(int[] arr) {
		int i = 0;
		int tmp = arr[0];
		for (i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = tmp;
	}

	/* function to print an array */
	void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}

}
