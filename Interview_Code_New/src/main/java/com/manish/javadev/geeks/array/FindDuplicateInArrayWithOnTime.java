package com.manish.javadev.geeks.array;

/**
 * https://www.geeksforgeeks.org/duplicates-array-using-o1-extra-space-set-2/
 * https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
 * 
 * Duplicates in an array in O(n) and by using O(1) extra space | Set-2 Given an
 * array of n elements which contains elements from 0 to n-1, with any of these
 * numbers appearing any number of times. Find these repeating numbers in O(n)
 * and using only constant memory space.
 * 
 * For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should
 * be 1, 3 and 6. We have discussed an approach for this question in below post:
 * Duplicates in an array in O(n) and by using O(1) extra space | Set-2. There
 * is a problem in above approach. It prints the repeated number more than once.
 * For example: {1, 6, 3, 1, 3, 6, 6} it will give output as : 3 6 6. So, in
 * this article, another method is discussed to overcome this problem.
 * 
 * @author kmamani
 *
 */
public class FindDuplicateInArrayWithOnTime {
	public static void main(String args[]) {
		int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

		for (int i = 0; i < arr.length; i++) {
			int index = arr[i] % 10;
			arr[index] = arr[index] + 10;
		}
		System.out.println("The repeating elements are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]/10 > 1) {
				System.out.println(i + " ");
			}
		}
	}
}
