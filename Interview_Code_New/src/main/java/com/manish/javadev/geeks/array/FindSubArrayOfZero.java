package com.manish.javadev.geeks.array;

public class FindSubArrayOfZero {
	public static void main(String[] args) {
		printSubArrayOfRequiredSum();
	}

	private static void printSubArrayOfRequiredSum() {
		int[] seed = new int[] { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		int currSum = 0;

		for (int i = 0; i < seed.length; i++) {
			String str = "[ ";
			int sum = 0;
			for (int j = i; j < seed.length; j++) {
				sum = sum + seed[j];
				str = str + seed[j] + ", ";
				if (sum == currSum) {
					System.out.println(" sum : " + sum + " array : " + str
							+ "]");
					
					
				}
			}
		}
	}
}
