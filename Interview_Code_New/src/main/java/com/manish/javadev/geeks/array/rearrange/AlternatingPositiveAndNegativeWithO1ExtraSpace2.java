package com.manish.javadev.geeks.array.rearrange;

public class AlternatingPositiveAndNegativeWithO1ExtraSpace2 {

	public static void main(String[] args) {
		AlternatingPositiveAndNegativeWithO1ExtraSpace2 rearrange = new AlternatingPositiveAndNegativeWithO1ExtraSpace2();
		// int arr[n] = {-5, 3, 4, 5, -6, -2, 8, 9, -1, -4};
		// int arr[] = {-5, -3, -4, -5, -6, 2 , 8, 9, 1 , 4};
		// int arr[] = {5, 3, 4, -2, -1, -2 , -8, -9, -1 , -4};
		// int arr[] = {-5, 3, -4, -7, -1, -2 , -8, -9, 1 , -4};
		int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
		int n = arr.length;

		System.out.println("Given array is ");
		rearrange.printArray(arr, n);

		rearrange.rearrange(arr, n);

		System.out.println("Rearranged array is ");
		rearrange.printArray(arr, n);
	}

	// Utility function to right rotate all elements
	// between [outofplace, cur]
	void swapData(int arr[], int outofplace, int cur) {
		int temp = arr[outofplace];
		arr[outofplace] = arr[cur];
		arr[cur] = temp;
	}

	void rearrange(int arr[], int n) {
		int badIndex = -1;
		for (int index = 0; index < n; index++) {
			if (badIndex >= 0) {
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
				if (((arr[index] >= 0) && (arr[badIndex] < 0)) || ((arr[index] < 0) && (arr[badIndex] >= 0))) {
					swapData(arr, badIndex, index);

					// the new out-of-place entry is now 2 steps ahead
					if (index - badIndex > 2)
						badIndex = badIndex + 2;
					else
						badIndex = -1;
				}
			}

			// if no entry has been flagged out-of-place
			// check if current entry is out-of-place
			// if (((arr[index] >= 0) && ((index & 0x01) == 0)) ||
			// ((arr[index] < 0) && (index & 0x01) == 1))
			if (badIndex == -1) {
				if (((arr[index] >= 0) && ((index % 2) != 0)) || ((arr[index] < 0) && (index % 2) == 0))
					badIndex = index;
			}
		}
	}

	// A utility function to print an array 'arr[]' of size 'n'
	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}
