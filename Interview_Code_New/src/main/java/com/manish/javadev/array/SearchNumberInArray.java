package com.manish.javadev.array;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program checkes entered number in side array or not
 * 
 */
public class SearchNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num;
		System.out.println("Enter the number to be search in array");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int result = findNumber(arr, num);

		if (result >= 0) {
			System.out.println(num + " is found in array");
		} else {
			System.out.println(num + " is not found in array");
		}
		System.out.println("Done");
	}

	private static int findNumber(int[] arr, int num) {
		for (int index = 0; index < arr.length; index++) {
			if (num == arr[index]) {
				return index;
			}
		}
		return -1;
	}
}
