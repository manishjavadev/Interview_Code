package com.manish.javadev.array;

import java.util.ArrayList;
import java.util.List;

/**
 * For each number i in nums, we mark the number that i points as negative.
 * 
 * Then we filter the list, get all the indexes who points to a positive number.
 * Since those indexes are not visited.
 * 
 * 
 * Method 3 (Use elements as Index and mark the visited places) Approach:
 * Traverse the array. While traversing, use the absolute value of every element
 * as an index and make the value at this index as negative to mark it visited.
 * If something is already marked negative then this is the repeating element.
 * To find missing, traverse the array again and look for a positive value.
 * 
 * @author kmamani
 *
 */
public class FindAnyRepeatingAndMissingNumber2 {

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
		int n = arr.length;
		printTwoElements(arr, n);
	}

	static void printTwoElements(int arr[], int size) {
		int i;
		System.out.print("The repeating element is ");

		for (i = 0; i < size; i++) {
			arr[arr[i]%10-1] = arr[arr[i]%10 - 1] + 10;

		}

		System.out.print("And the missing element is ");
		for (i = 0; i < size; i++) {
			if (arr[i] > 0 && arr[i] < 10) {
				System.out.println("Missing Number");
				System.out.println(i + 1);
			}else if(arr[i]/10 >=2) {
				System.out.println("Repeated Number");
				System.out.println(i + 1);
			}
				
		}
	}

}
