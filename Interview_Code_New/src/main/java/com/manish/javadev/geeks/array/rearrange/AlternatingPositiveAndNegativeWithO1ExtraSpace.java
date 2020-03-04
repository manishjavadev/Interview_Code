package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

public class AlternatingPositiveAndNegativeWithO1ExtraSpace {

	public static void main(String[] args) {
		AlternatingPositiveAndNegativeWithO1ExtraSpace rearrange = new AlternatingPositiveAndNegativeWithO1ExtraSpace();
		// int arr[n] = {-5, 3, 4, 5, -6, -2, 8, 9, -1, -4};
		int arr[] = { -5, -3, -4, -5, -6, -2, 8, 9, -1, 4 };
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
				// find the item which must be moved into the out-of-place
				// entry if out-of-place entry is positive and current
				// entry is negative OR if out-of-place entry is negative
				// and current entry is negative then right rotate
				//
				// [...-3, -4, -5, 6...] --> [...6, -3, -4, -5...]
				// ^ ^
				// | |
				// outofplace --> outofplace
				//
				if (((arr[i] >= 0) && (arr[bad] < 0)) || ((arr[i] < 0) && (arr[bad] >= 0))) {
					rightrotate(arr, bad, i);

					// the new out-of-place entry is now 2 steps ahead
					if (i - bad > 2)
						bad = bad + 2;
					else
						bad = -1;
				}
			}

			// if no entry has been flagged out-of-place
			// check if current entry is out-of-place
			// if (((arr[index] >= 0) && ((index & 0x01) == 0)) ||
			// ((arr[index] < 0) && (index & 0x01) == 1))
			if (bad == -1) {
				if (((arr[i] > 0) && (i % 2) == 0) || ((arr[i] < 0) && ((i % 2) != 0))) {
					bad = i;
				}
			}
		}
	}

	void display(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
}
