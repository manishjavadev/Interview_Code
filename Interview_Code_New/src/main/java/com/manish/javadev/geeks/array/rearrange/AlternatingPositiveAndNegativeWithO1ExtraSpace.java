package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

public class AlternatingPositiveAndNegativeWithO1ExtraSpace {

	public static void main(String[] args) {
		AlternatingPositiveAndNegativeWithO1ExtraSpace rearrange = new AlternatingPositiveAndNegativeWithO1ExtraSpace();
		// int arr[n] = {-5, 3, 4, 5, -6, -2, 8, 9, -1, -4};
		// int arr[] = {-5, -3, -4, -5, -6, 2 , 8, 9, 1 , 4};
		// int arr[] = {5, 3, 4, -2, -1, -2 , -8, -9, -1 , -4};
		// int arr[] = {-5, 3, -4, -7, -1, -2 , -8, -9, 1 , -4};
		int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };

		System.out.println("Given array is ");
		rearrange.display(arr);

		rearrange.rearrange(arr);

		System.out.println("Rearranged array is ");
		rearrange.display(arr);
	}

	// Utility function to right rotate all elements
	// between [outofplace, cur]
	void rightrotate(int arr[], int outofplace, int cur) {
		int tmp = arr[cur];
		for (int i = cur; i > outofplace; i--)
			arr[i] = arr[i - 1];
		arr[outofplace] = tmp;
	}

	void rearrange(int arr[]) {
		int outofplace = -1;
		for (int index = 0; index < arr.length; index++) {
			if (outofplace >= 0) {
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
				if (((arr[index] >= 0) && (arr[outofplace] < 0)) || ((arr[index] < 0) && (arr[outofplace] >= 0))) {
					rightrotate(arr, outofplace, index);

					// the new out-of-place entry is now 2 steps ahead
					if (index - outofplace > 2)
						outofplace = outofplace + 2;
					else
						outofplace = -1;
				}
			}

			// if no entry has been flagged out-of-place
			// check if current entry is out-of-place
			// if (((arr[index] >= 0) && ((index & 0x01) == 0)) ||
			// ((arr[index] < 0) && (index & 0x01) == 1))
			if (outofplace == -1) {
				if (((arr[index] < 0) && ((index % 2) != 0)) || ((arr[index] > 0) && (index % 2) == 0))
					outofplace = index;
			}
		}
	}

	void display(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
}
