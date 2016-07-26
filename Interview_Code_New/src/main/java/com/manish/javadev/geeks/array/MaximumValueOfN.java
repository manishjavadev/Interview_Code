package com.manish.javadev.geeks.array;

public class MaximumValueOfN {
	public static void main(String[] args) {
		Integer[] array = { 4, 7, 2, 3, 8 };
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
