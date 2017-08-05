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
		int leftSide = 0;
		int rightSide = data.length - 1;

		while (leftSide < rightSide) {
			while (data[leftSide] % 2 == 0 && leftSide < rightSide) {
				leftSide++;
			}
			while (data[rightSide] % 2 == 1 && leftSide < rightSide) {
				rightSide--;
			}

			if (leftSide < rightSide) {
				// swapping as soon as we find even and odd combination
				swappEvenOdd(data, leftSide, rightSide);
			}
		}
	}

	private static void swappEvenOdd(int[] data, int left, int right) {
		// swapping even and odd numbers
		int temp = data[left];
		data[left] = data[right];
		data[right] = temp;
	}
}
