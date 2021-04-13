package com.manish.javadev.basic;

/**
 * @author Manish
 * 
 */

/**
 * This program simply getting the Lcd and Gcd of of your entered array
 * 
 */
public class GcdAndLcdOf3orMoreNumber {

	public static void main(String[] a) {
		int arr[] = { 15, 30, 105 };
		// Here we are calling two function lcdOfArray and gcdOfArray
		// and after that printing for output
		long lcd = lcdOfArray(arr);
		long gcd = gcdOfArray(arr);
		System.out.println("Lcd of array is :" + lcd);
		System.out.println("Gcd of array is :" + gcd);
	}

	// Here in side the function we are again calling one function
	// gcd(arg1, args2) and passing two argument and returning result to main
	private static long gcdOfArray(int[] arr) {
		long result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result = gcd(result, arr[i]);
		}
		return result;
	}

	// Here in side the function we are again calling one function
	// lcd(arg1, args2) and passing two argument and returning result to main
	private static long lcdOfArray(int[] arr) {
		long result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result = lcd(result, arr[i]);
		}
		return result;
	}

	// This function called by lcdOfArray for every array element and returning a
	// result
	private static long lcd(long a, long b) {
		return a * b / (gcd(a, b));
	}

	// This function called by gcdOfArray for every array element and returning a
	// result
	private static long gcd(long a, long b) {
		while (b > 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
