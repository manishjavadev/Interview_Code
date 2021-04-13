package com.manish.javadev.array;

import java.util.Arrays;

/**
 * Input A,A,A,A,B,B,B,C,C,D,D
 * 
 * Ouput : A4 and B3
 * 
 * Print first 2nd mode from array
 * 
 * @author kmamani
 *
 */
public class FindMultiModeInArray {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 7, 7, 7, 7, 7 };
		FindMultiModeInArray findMode = new FindMultiModeInArray();
		findMode.findModeOfArray(a);
	}

	public void findModeOfArray(int[] arr) {

		if (arr == null || arr.length == 0)
			return;

		Arrays.sort(arr);

		int temp = arr[0];
		int mode = arr[0];
		int prevMode = arr[0];
		int count = 1;
		int maxModeCount = 1;
		int preModeCount = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == temp)
				count++;
			else {
				if (count > maxModeCount) {
					mode = arr[i - 1];
					maxModeCount = count;
				}
				if (count > preModeCount && count < maxModeCount) {
					prevMode = arr[i - 1];
					preModeCount = count;
				}
				temp = arr[i];
				count = 1;
			}
		}

		if (count > maxModeCount) {
			System.out.println(arr[arr.length - 1] + " occours " + count + " time");
			prevMode = mode;
			preModeCount = maxModeCount;
		} else {
			System.out.println(mode + "occours " + maxModeCount + " time");
		}
		if (count > preModeCount && count < maxModeCount) {
			System.out.println(arr[arr.length - 1] + " occours " + count + " time");
		} else {
			System.out.println(prevMode + " occours " + preModeCount + " time");
		}
	}

}
