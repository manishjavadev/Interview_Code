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
	public static void main(String args[]) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		segregateEvenOdd(array);
		System.out.println(Arrays.toString(array));
	}

	private static void segregateEvenOdd(int[] data) {
		int left = 0;
		int right = data.length - 1;

		while (left < right) {
			while (data[left] % 2 != 0 && left < right) {
				left++;
			}
			while (data[right] % 2 == 0 && left < right) {
				right--;
			}

			if (left < right) {
				// swapping as soon as we find even and odd combination
				swappData(data, left, right);
			}
		}
	}

	private static void swappData(int[] data, int left, int right) {
		// swapping even and odd numbers
		int temp = data[right];
		data[right] = data[left];
		data[left] = temp;
	}
}
