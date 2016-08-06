package com.manish.javadev.geeks.array;

/*
 A surpasser of an element of an array is a greater element to its right,
 therefore x[j] is a surpasser of x[i] if i < j and x[i] < x[j]. 
 The surpasser count of an element is the number of surpassers. 
 Given an array of distinct integers, for each element of the array find its 
 surpasser count i.e. count the number of elements to the right that are greater than that element.

 Examples:

 Input:  [2, 7, 5, 3, 0, 8, 1]
 Output: [4, 1, 1, 1, 2, 0, 0]*/

/**
 * @author m.d.srivastava
 * 
 */
public class FindSurpasser {
	public static void main(String[] args) {
		int arr[] = { 2, 7, 5, 3, 0, 8, 1 };
		findSurpasser(arr);

	}

	// Function to find surpasser count of each element
	// in array
	private static void findSurpasser(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			// stores surpasser count for element arr[i]
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i])
					count++;
			}
			System.out.print(count + "\t");
		}
	}

}
