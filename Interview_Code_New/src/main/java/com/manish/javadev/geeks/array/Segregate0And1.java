package com.manish.javadev.geeks.array;

import java.util.Arrays;

/**
 * 
 * Method 1 (Count 0s or 1s) Thanks to Naveen for suggesting this method. 1)
 * Count the number of 0s. Let count be C. 2) Once we have count, we can put C
 * 0s at the beginning and 1s at the remaining n – C positions in array.
 * 
 * Time Complexity: O(n)
 * 
 * The method 1 traverses the array two times. Method 2 does the same in a
 * single pass.
 * 
 * 
 * Method 2 (Use two indexes to traverse) Maintain two indexes. Initialize first
 * index left as 0 and second index right as n-1.
 * 
 * Do following while left < right a) Keep incrementing index left while there
 * are 0s at it b) Keep decrementing index right while there are 1s at it c) If
 * left < right then exchange arr[left] and arr[right]
 * 
 * Implementation:
 * 
 * 
 * 
 * @author m.d.srivastava
 * 
 */
public class Segregate0And1 {
	/* Driver Program to test above functions */
	public static void main(String[] args) {
		Segregate0And1 seg = new Segregate0And1();
		int arr[] = new int[] { 0, 0, 1, 0, 1, 0, 1, 1, 1 };
		// int arr[] = new int[] { 10, 3, 4, 9, 6, 0, 7, 11, 13 };
		seg.segregate0and1(arr);

		System.out.print("Array after segregation is ");
		System.out.println(Arrays.toString(arr));
	}

	void segregate0and1(int arr[]) {
		int i = -1;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 0) {// if (arr[j]%2!=0)
				i++;
				swapData(arr, i, j);
			}
		}
	}

	private void swapData(int[] arr, int left, int right) {
		int temp = 0;
		temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
