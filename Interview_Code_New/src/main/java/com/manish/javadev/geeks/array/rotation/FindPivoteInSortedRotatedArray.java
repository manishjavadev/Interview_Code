package com.manish.javadev.geeks.array.rotation;

public class FindPivoteInSortedRotatedArray {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int result = findPivoteInArray(arr);
		System.out.println("Pivote Element ::: " + result);
		System.out.println("Pivote Element ::: " + arr[result]);
	}
	private static int findPivoteInArray(int[] arr) {
		int pivote = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				pivote = i + 1;
				break;
			}
		}
		return pivote;
	}
}
