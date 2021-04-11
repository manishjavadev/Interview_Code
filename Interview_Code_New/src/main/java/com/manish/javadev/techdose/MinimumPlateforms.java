package com.manish.javadev.techdose;

import java.util.Arrays;

/**
 * Given arrival and departure times of all trains, find the minimum no of
 * platforms required for the railway station so that no train waits.
 * 
 * Input: int arr[] = {9:00,9:40,9:50,11:00,15:00,18:00} int dep[] =
 * {9:10,12:00,11:20,11:30,19:00,20:00}
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
		method2(arr, dep);

	}

	private static void method1(double[] arr, double[] dep) {
		int usedPlateForms = 0;
		int neededPlateForm = 1;
		for (int i = 0; i < arr.length; i++) {
			usedPlateForms = 0;
			for (int j = 0; j <= i; j++) {

				if (arr[i] < dep[j]) {
					usedPlateForms++;
					if (usedPlateForms > neededPlateForm) {
						neededPlateForm = usedPlateForms;
					}
				}
			}
		}
		System.out.println("Minimum Plateforms Needded :: \n" + neededPlateForm);
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
				if (usedPlateForms > neededPlateForm) {
					neededPlateForm = usedPlateForms;
				}
				i++;
			} else if (arr[i] > dep[j]) {
				usedPlateForms--;// = 0;
				j++;
			}
		}

		System.out.println("Minimum Plateforms required to no tarin has to wait :: \n" + neededPlateForm);
	}

}
