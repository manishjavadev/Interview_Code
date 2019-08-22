package com.manish.javadev.geeks.array;

import java.util.Arrays;

/*Question:
 Segregate Even and Odd numbers*/

/*Algorithm: segregateEvenOdd()
 1) Initialize two index variables left and right:  
 left = 0,  right = size -1 
 2) Keep incrementing left index until we see an odd number.
 3) Keep decrementing right index until we see an even number.
 4) If lef < right then swap arr[left] and arr[right]
 */

public class SegregateEvenAndOddDemo {
	/* Driver Program to test above functions */
	public static void main(String[] args) {
		Segregate0And1 seg = new Segregate0And1();
		int arr[] = new int[] { 10, 3, 4, 9, 6, 0, 7, 11, 13 };
		seg.segregate0and1(arr);

		System.out.print("Array after segregation is ");
		System.out.println(Arrays.toString(arr));
	}

	void segregate0and1(int arr[]) {
		int i = -1;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0)
				i++;
			swapData(arr, i, j);
		}
	}

	private void swapData(int[] arr, int left, int right) {
		int temp = 0;
		temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
