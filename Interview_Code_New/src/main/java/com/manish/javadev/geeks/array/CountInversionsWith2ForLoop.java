package com.manish.javadev.geeks.array;

/**
 * Number of an inversion in array is the number of pair(a[i],a[j]) of elements
 * such that i < j and a[i] > a[j]. For an example if we have a list of element
 * 2 3 6 9 1 then number of inversion is 4 and the pairs are (2,1), (3,1), (6,1)
 * and (9,1).
 * 
 * @author m.d.srivastava
 * 
 */

public class CountInversionsWith2ForLoop {
	public static void main(String[] args) {
		int arr[] = { 1, 20, 6, 4, 5 };
		System.out.println(getInvCount(arr));
	}

	private static int getInvCount(int[] arr) {
		int inv_count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])
					inv_count++;

			}
		}

		return inv_count;
	}
}
