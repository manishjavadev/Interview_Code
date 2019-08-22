package com.manish.javadev.array.test;

//Java code Find duplicates in O(n) time and O(1) extra space
/**
 * Given an array of n elements which contains elements from 0 to n-1, with any
 * of these numbers appearing any number of times. Find these repeating numbers
 * in O(n) and using only constant memory space.
 * 
 * For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should
 * be 1, 3 and 6.
 * 
 * 
 * Method 1 and Method 2 of the above link are not applicable as the question
 * says O(n) time complexity and O(1) constant space. Also, Method 3 and Method
 * 4 cannot be applied here because there can be more than 2 repeating elements
 * in this problem. Method 5 can be extended to work for this problem. Below is
 * the solution that is similar to the Method 5.
 * 
 * @author kmamani
 *
 */
public class FindDuplicate {
	public static void main(String[] args) {
		FindDuplicate findDuplicate = new FindDuplicate();
		int arr[] = { 1, 2, 3, 1, 2, 6, 6 };

		findDuplicate.printRepeating(arr);
	}

	private void printRepeating(int arr[]) {
		int i;
		System.out.println("The repeating elements are : ");

		for (i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}
	}
}