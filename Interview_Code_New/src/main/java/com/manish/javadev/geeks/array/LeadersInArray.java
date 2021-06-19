package com.manish.javadev.geeks.array;

/**
 * https://www.geeksforgeeks.org/leaders-in-an-array/#:~:text=An%20element%20is%20leader%20if,of%20the%20array%20be%20size.
 * https://www.geeksforgeeks.org/leaders-in-an-array/#:~:text=An%20element%20is%20leader%20if,of%20the%20array%20be%20size.
 * 
 * Write a program to print all the LEADERS in the array. An element is leader
 * if it is greater than all the elements to its right side. And the rightmost
 * element is always a leader. For example int the array {16, 17, 4, 3, 5, 2},
 * leaders are 17, 5 and 2. Let the input array be arr[] and size of the array
 * be size.
 * 
 * 
 * 
 * Method 2 (Scan from right) Scan all the elements from right to left in an
 * array and keep track of maximum till now. When maximum changes its value,
 * print it. Below image is a dry run of the above approach:
 * 
 * Base case max_from_right = 2;
 * 
 * i = len -2
 * 
 * if a[i-1]> max_from_right
 * 
 * max_from_right = a[i-1]
 * 
 * print a[i-1]
 * 
 * if a[i-1]< max_from_right Do nothing
 * 
 * For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 * 
 * https://www.geeksforgeeks.org/leaders-in-an-array/
 * 
 * 
 * 
 * @author kmamani
 *
 */
public class LeadersInArray {
	/* Driver program to test above functions */

	public static void main(String[] args) {
		LeadersInArray lead = new LeadersInArray();
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		lead.printLeaders(arr, n);
	}

	void printLeaders(int arr[], int size) {
		int max_from_right = arr[size - 1];
		System.out.print(max_from_right + " ");

		for (int i = size - 2; i >= 0; i--) {
			if (arr[i] >= max_from_right) {
				max_from_right = arr[i];
				System.out.print(max_from_right + " ");
			}
		}
	}

}
