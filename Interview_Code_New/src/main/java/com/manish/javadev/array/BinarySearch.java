package com.manish.javadev.array;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * Note: First read 8 points then start code debug
 * 1. Array should be sorted order 
 * 2. In this we will take 3 variable start, end, and middle of array
 * 3. that will keep trace the status of lower limit and upper limit 
 * 4. and middle value of array. 
 * 5. How to calculate  * middle value of array 
 * 6. middle=(start+end)/2; 7. where end should be end=arr.length-1; 
 * 8. and use while loop for checking
 */
public class BinarySearch {

	public static void main(String[] args) {
		int start, end, middle;
		int number;
		int arr[] = {1,2,3,4,5,6,7,8,9,10 };
		System.out.println("Enter the number to be search");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		start = 0;
		end = arr.length - 1;
		middle = (start + end) / 2;
		while (start <= end && number != arr[middle]) {
			if (number > arr[middle])
				start = middle + 1;
			else
				end = middle - 1;
			middle = (start + end) / 2;
		}
		if (number == arr[middle])
			System.out.println(number + " found at position " + (middle + 1));
		if (start > end)
			System.out.println(number + " is not found in array");
		System.out.println("Done");
	}

}
