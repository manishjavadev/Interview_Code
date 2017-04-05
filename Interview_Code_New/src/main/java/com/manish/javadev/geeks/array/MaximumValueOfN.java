package com.manish.javadev.geeks.array;

/*Question:
 * 
 find out maximum value of K where Array element has at least >=k
 */

/*
 * Solution: 
 1) We need to find out maximum array index number, where Array element has at least >=k
 2) let's start from array last index and compare from starting element of array,
 test size of array is grater than array element

 3) if yes decrease size by 1, because we started from array maximum size, need to find maximum value of K
 4) So once array Element goes greater than size means that size is the maximum value of K from start.
 */
public class MaximumValueOfN {
	public static void main(String[] args) {
		Integer[] array = { 4, 3, 1, 2 };
		System.out.println("maxValue Of K is :: " + maxValueOfK(array));
	}

	public static int maxValueOfK(Integer[] arr) {
		int maxValueOfK = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (maxValueOfK > arr[i]) {
				maxValueOfK--;
			}
		}
		return maxValueOfK;
	}
}
