package com.manish.javadev.techdose;

import java.util.Arrays;

/**
 * Given arrival and departure times of all trains, find the minimum no of
 * platforms required for the railway station so that no train waits.
 * 
 * Input:
 * 
 * int arr[] = {9:00,9:40,9:50,11:00,15:00,18:00}
 * 
 * int dep[] = {9:10,12:00,11:20,11:30,19:00,20:00}
 * 
 * Output: There are at-most three trains at a time(time b/w 11:00 and 11:20).
 * 
 * @author kmamani
 *
 */
public class MinimumPlateforms {
	public static void main(String[] args) {
		double arr[] = { 9.00, 9.40, 9.50, 11.00, 15.00, 18.00 };
		double dep[] = { 9.10, 12.00, 11.20, 11.30, 19.00, 20.00 };
		// method1(arr, dep);
		findPlatform(arr, dep);

	}

// Case-1

//9-----------8

//9.40--------11

// Case-2

// 8 ----------9

// 11 ---------9.45
	// Returns minimum number of platforms reqquired
	public static int findPlatform(double arr[], double dep[]) {
		int plat_needed = 0;
		int result = 1;
		int i = 1, j = 0;
		for (i = 0; i < arr.length; i++) {
			plat_needed = 1;
			for (j = i + 1; j < arr.length; j++) {
				if ((arr[i] >= arr[j] && dep[j] >= arr[i] ) || (arr[j] >= arr[i] && arr[j] <= dep[i]))
					plat_needed++;
			}
			result = Math.max(result, plat_needed);
		}
		return result;
	}

	private static void method2(double[] arr, double[] dep) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		// arr = [9.0, 9.4, 9.5, 11.0, 15.0, 18.0]
		// dep = [9.1, 11.2, 11.3, 12.0, 19.0, 20.0]
		int usedPlateForms = 1;
		int neededPlateForm = 1;
		int i = 1;
		int j = 0;
		while (i < arr.length && j < dep.length) {

			if (arr[i] < dep[j]) {
				usedPlateForms++;
				i++;
			} else if (arr[i] > dep[j]) {
				usedPlateForms--;// = 0;
				j++;
			}
			if (usedPlateForms > neededPlateForm) {
				neededPlateForm = usedPlateForms;
			}
		}

		System.out.println("Minimum Plateforms required to no tarin has to wait :: \n" + neededPlateForm);
	}

}
