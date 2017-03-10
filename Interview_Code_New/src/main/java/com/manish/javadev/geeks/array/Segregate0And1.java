package com.manish.javadev.geeks.array;

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

	void segregate0and1(int arr[], int size) {
		/* Initialize left and right indexes */
		int left = 0, right = size - 1;

		while (left < right) {
			/* Increment left index while we see 0 at left */
			while (arr[left] == 0 && left < right)
				left++;

			/* Decrement right index while we see 1 at right */
			while (arr[right] == 1 && left < right)
				right--;

			/*
			 * If left is smaller than right then there is a 1 at left and a 0
			 * at right. Exchange arr[left] and arr[right]
			 */
			if (left < right) {
				arr[left--] = 0;
				arr[right++] = 1;
			}
		}
	}

	/* Driver Program to test above functions */
	public static void main(String[] args) {
		Segregate0And1 seg = new Segregate0And1();
		int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };
		int i = 0;
		int length = arr.length;

		seg.segregate0and1(arr, length);

		System.out.print("Array after segregation is ");
		for (i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}

}
