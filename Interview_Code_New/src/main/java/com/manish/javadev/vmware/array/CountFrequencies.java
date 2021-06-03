package com.manish.javadev.vmware.array;

public class CountFrequencies {
	public static void main(String[] args) {
		CountFrequencies count = new CountFrequencies();
		int arr[] = { 2, 3, 3, 2, 5 };
		count.findCounts(arr);

		int arr1[] = { 1 };
		count.findCounts(arr1);

		int arr3[] = { 4, 4, 4, 4 };
		count.findCounts(arr3);

		int arr2[] = { 1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1 };
		count.findCounts(arr2);

		int arr4[] = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
		count.findCounts(arr4);

		int arr5[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		count.findCounts(arr5);

		int arr6[] = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		count.findCounts(arr6);
	}

	private void findCounts(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = (arr[i]-1) % 10;
			arr[index] = arr[index] + 10;
		}

		System.out.println("=====");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] / 10 > 1) {
				System.out.println(i + 1 + " Occour " + arr[i] / 10 + " times");
			} else {
				System.out.println(i + 1 + " Occour " + arr[i] / 10 + " times");
			}
		}
		System.out.println("=============");

	}
}
