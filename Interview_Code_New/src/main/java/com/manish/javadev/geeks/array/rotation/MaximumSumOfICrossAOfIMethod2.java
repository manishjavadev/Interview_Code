package com.manish.javadev.geeks.array.rotation;

/**
 * https://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/
 * 
 * Find maximum value of Sum( i*arr[i]) with only rotations on given array
 * allowed
 * 
 * Let us calculate initial value of i*arr[i] with no rotation
 * 
 * R0 = 0*arr[0] + 1*arr[1] +2*arr[2] +....+ (n-1)*arr[n-1]
 * 
 * After 1 rotation arr[n-1], becomes first element of array, arr[0] becomes
 * second element, arr[1] becomes third element and so on.
 * 
 * R1 = 0*arr[1] + 1*arr[2]+2*arr[3]...+ (n-2)*arr[n-1] + (n-1)*arr[0]
 * 
 * R0 - R1 = arr[1] +arr[2]+ arr[3] ... +(n-1)arr[0] + arr[i-1] * (n-1)
 * 
 * 
 * ========NEED TO UPDATE THIS BASED ON ABOVE LOGIC============= After 2
 * rotations arr[n-2], becomes first element of array, arr[n-1] becomes second
 * element, arr[0] becomes third element and so on. R2 = 0*arr[n-2] + 1*arr[n-1]
 * +...+ (n-1)*arr[n-3]
 * 
 * R2 - R1 = arr[0] + arr[1] + ... + arr[n-3] - (n-1)*arr[n-2] + arr[n-1]
 * 
 * If we take a closer look at above values, we can observe below pattern
 * 
 * Rj - Rj-1 = arrSum - n * arr[n-j]
 * 
 * R1 = R0 - arrSum - (n-1) * arr[i-1]
 * 
 * @author kmamani
 *
 */
public class MaximumSumOfICrossAOfIMethod2 {
	public static void main(String[] args) {
		int arr[] = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// Output : Max sum is 330
		int n = arr.length;
		System.out.println(maxSum(arr, n));
	}

	static int maxSum(int arr[], int n) {
		int arrSum = 0;
		int currVal = 0;
		int result = 0;
		for (int i = 0; i < n; i++) {
			arrSum += arr[i];
			currVal += i * arr[i];
		}
		/**
		 * Compute values for other iterations Compute next value using previous value
		 * in O(1) time
		 */
		for (int i = 1; i < n; i++) {
			currVal = currVal + arrSum - n * arr[n - i];
			result = Math.max(result, currVal);
		}

		return result;
	}

}
