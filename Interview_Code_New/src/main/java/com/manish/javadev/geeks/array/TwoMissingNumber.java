package com.manish.javadev.geeks.array;

/**
 * Method 1 – O(n) time complexity and O(n) Extra Space
 * 
 * Step 1: Take a boolean array mark that keeps track of all the elements
 * present in the array. Step 2: Iterate from 1 to n, check for every element if
 * it is marked as true in the boolean array, if not then simply display that
 * element.
 * 
 * // Function to find two missing numbers in range // [1, n]. This function
 * assumes that size of array // is n-2 and all array elements are distinct
 * 
 * 
 * void findTwoMissingNumber(int arr[], int n) {
 * 
 * // Create a boolean vector of
 * 
 * size n+1 and // mark all present elements of arr[] in it. vector<bool>
 * 
 * mark(n+1, false); for (int i = 0; i < n-2; i++)
 * 
 * mark[arr[i]] = true;
 * 
 * // Print two unmarked elements cout << "Two Missing Numbers are\n";
 * 
 * for (int i = 1; i <= n; i++)
 * 
 * if (! mark[i]) cout << i << " ";
 * 
 * cout << endl;
 * 
 * }
 * 
 * 
 * 
 * Method 2:: O(n) time complexity and O(1) Extra Space
 * 
 * The idea is based on this popular solution for finding one missing numbers.
 * We extend the solution so that two missing elements are printed. Let's find
 * out the sum of 2 missing numbers:
 * 
 * arrSum => Sum of all elements in the array
 * 
 * sum (Sum of 2 missing numbers) = (Sum of integers from 1 to n) - arrSum =
 * ((n)*(n+1))/2 arrSum
 * 
 * avg (Average of 2 missing numbers) = sum / 2; One of the numbers will be less
 * than or equal to avg while the other one will be strictly greater then avg.
 * 
 * Two numbers can never be equal since all the given numbers are distinct. We
 * can find the first missing number as sum of natural numbers from 1 to avg,
 * i.e., avg*(avg+1)/2 minus the sum of array elements smaller than avg. We can
 * find the second missing number as sum of natural numbers from avg+1 to n
 * minus the sum of array elements greater than than avg Consider an example for
 * better clarification
 * 
 * Input : 1 3 5 6, n = 6 Sum of missing integers = n*(n+1)/2 - (1+3+5+6) = 6.
 * Average of missing integers = 6/2 = 3. Sum of array elements less than or
 * equal to average = 1 + 3 = 4 Sum of natural numbers from 1 to avg = avg*(avg
 * + 1)/2 = 3*4/2 = 6 First missing number = 6 - 4 = 2
 * 
 * Sum of natural numbers from avg+1 to n = n*(n+1)/2 - avg*(avg+1)/2 = 6*7/2 -
 * 3*4/2 = 15 Sum of array elements greater than average = 5 + 6 = 11 Second
 * missing number = 15 - 11 = 4
 * 
 * 
 * @author m.d.srivastava
 * 
 */
public class TwoMissingNumber {
	public static void main(String[] args) {
		int arrLength = 6;
		int arr[] = { 1, 3, 5, 6 };
		findTwoMissingNumbers(arr, arrLength);

	}

	private static void findTwoMissingNumbers(int[] arr, int n) {

		// Sum of 2 Missing Numbers
		int sum = (n * (n + 1)) / 2 - getSum(arr);

		// Find average of two elements
		int avg = (sum / 2);

		int sumFirstHalf = 0, sumSecondHalf = 0;
		for (int i = 0; i < n - 2; i++) {
			if (arr[i] <= avg)
				sumFirstHalf += arr[i];
			else
				sumSecondHalf += arr[i];
		}

		// The first (smaller) element = (sum of natural
		// numbers upto avg) - (sum of array elements
		// smaller than or equal to avg)
		int totalSumOfFirstHalf = (avg * (avg + 1)) / 2;
		System.out.println("First Number");
		System.out.println(totalSumOfFirstHalf - sumFirstHalf);

		// The first (smaller) element = (sum of natural
		// numbers from avg+1 to n) - (sum of array elements
		// greater than avg)
		System.out.println("Second Number");
		System.out.println((((n * (n + 1)) / 2) - totalSumOfFirstHalf) - sumSecondHalf);
	}

	private static int getSum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
}
