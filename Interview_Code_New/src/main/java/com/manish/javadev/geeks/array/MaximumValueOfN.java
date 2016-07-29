package com.manish.javadev.geeks.array;

/*Solution: 
 We start from last and test size of array is grater than array element
 if size is grater then will decrease by 1 because we start from end and need to find maximum value of K
 So once array Element goes greater than size means that size is the maximum value of K from start.
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
