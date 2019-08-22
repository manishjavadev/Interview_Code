package com.manish.javadev.geeks.array.rotation;

import java.util.Arrays;

/*
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * 
 * Array Rotation of the above array by 2 will make array ArrayRotation1
 * 
 * 
 */
public class ArrayRotationMethod1 {
	public static void main(String[] args) {
		ArrayRotationMethod1 rotate = new ArrayRotationMethod1();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.leftRotate(arr, 2, arr.length);
		rotate.printArray(arr);
	}

	private void leftRotate(int[] arr, int d, int length) {
		int tmp[] = new int[d];
		for (int i = 0; i < d; i++) {
			tmp[i] = arr[i];
		}
		int k = 0;
		for (int i = d; i < arr.length; i++) {
			arr[k++] = arr[i];
		}
		for (int i = 0; i < tmp.length; i++) {
			arr[k++] = tmp[i];
		}
		System.out.println("Done");
	}

	/* function to print an array */
	void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}

}
