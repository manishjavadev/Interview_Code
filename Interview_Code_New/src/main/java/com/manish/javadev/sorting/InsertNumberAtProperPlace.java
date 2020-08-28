package com.manish.javadev.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program take number form user and insert in array at proper place In
 * this program last element of array should blank because of moving one index
 * in right so arr={1,2,3,4,5,}; like that and array should be in sorted order
 * if not sorted the first sort the array and insert it
 * 
 * @author Manish Srivastava
 */
public class InsertNumberAtProperPlace {
	public static void main(String[] args) {
		// In this array 6 is missing so insert 6 at proper place
		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10, };
		int num;
		int i;
		System.out.println("Enter the Decimal number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		// Here index = length of string why -2 because last one is empty
		// and array start with 0
		// Here we are checking entered number with array if array index number,
		// is grater then the entered number then move one step right
		for (i = arr.length - 2; i >= 0 && arr[i] > num; i--) {
			arr[i + 1] = arr[i];
		}

		// Here should be [index+1] because after for
		// loop index decreases one more against of proper place
		arr[i + 1] = num;
		System.out.println("After inserted arrya is ");
		System.out.println(Arrays.toString(arr));
		System.out.println("\nDone");

	}
}
