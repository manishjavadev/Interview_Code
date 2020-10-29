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
	void rightrotate(int arr[], int bad, int cur)  
    { 
        int tmp = arr[cur]; 
        for (int i = cur; i > bad; i--) 
            arr[i] = arr[i - 1]; 
        arr[bad] = tmp; 
    } 

	void rearrange(int arr[], int n) {
		int bad = -1;
		for (int index = 0; index < n; index++) {
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
				if (((arr[index] >= 0) && (arr[bad] < 0)) || ((arr[index] < 0) && (arr[bad] >= 0))) {
					rightrotate(arr, bad, index);

					// the new out-of-place entry is now 2 steps ahead
					if (index - bad > 2)
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
				if (((arr[index] >= 0) && ((index % 2) != 0)) || ((arr[index] < 0) && (index % 2) == 0))
					bad = index;
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
