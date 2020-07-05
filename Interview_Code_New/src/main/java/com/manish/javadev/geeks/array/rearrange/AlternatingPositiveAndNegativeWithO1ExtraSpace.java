package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/
 * 
 * @author kmamani
 *
 */
public class AlternatingPositiveAndNegativeWithO1ExtraSpace {

	public static void main(String[] args) {
		AlternatingPositiveAndNegativeWithO1ExtraSpace rearrange = new AlternatingPositiveAndNegativeWithO1ExtraSpace();
		int arr[] = { -5, 3, 4, 5, -6, -2, 8, 9, -1, -4 };
		// int arr[] = { -5, -3, -4, -5, -6, -2, 8, 9, -1, 4 };
		// int arr[] = {5, 3, 4, -2, -1, -2 , -8, -9, -1 , -4};
		// int arr[] = {-5, 3, -4, -7, -1, -2 , -8, -9, 1 , -4};
		// int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };

		System.out.println("Given array is ");
		rearrange.display(arr);

		rearrange.rearrange(arr);

		System.out.println("Rearranged array is ");
		rearrange.display(arr);
	}

	// right rotate all elements between [outofplace, cur], so that all positive
	// and negative element moved to end
	void rightrotate(int arr[], int bad, int cur) {
		int tmp = arr[cur];
		for (int i = cur; i > bad; i--)
			arr[i] = arr[i - 1];
		arr[bad] = tmp;
	}

	void rearrange(int arr[]) {
		int bad = -1;
		for (int i = 0; i < arr.length; i++) {
			if (bad >= 0) {

				/**
				 * Find bad Position, If arr[i] is greater than 0 then arr[bad] should be < 0
				 * arr[i] >= 0 && arr[bad] < 0 OR If arr[i] is < 0 than then arr[bad] should be
				 * > 0 || arr[i] < 0 && arr[bad] >= 0
				 */
				if (arr[i] >= 0 && arr[bad] < 0 || arr[i] < 0 && arr[bad] >= 0) {
					rightrotate(arr, bad, i);

					// the new out-of-place entry is now 2 steps ahead
					if (i - bad > 2) {
						bad = bad + 2;
					} else {
						// We don't know how much need to move bad now so better start from beginning
						bad = -1;
					}
				}
			}

			/**
			 * Find bad Position, means even position should not be +ve, if its positive
			 * means bad position. odd position should not be -ve, if its a negative means
			 * bad position.
			 */
			if (bad == -1) {
				if (arr[i] >= 0 && i % 2 == 0 || arr[i] < 0 && i % 2 != 0) {
					bad = i;
				}
			}
		}
	}

	void display(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
}
