package com.manish.javadev.geeks.array;

class InversionCount {
	public static void main(String... v) {
		int arr[] = { 2, 3, 6, 9, 1 };
		System.out.println("\nNumber of Inversion = "
				+ mergeSort(arr, 0, arr.length - 1));
		;
	}

	static long mergeSort(int a[], int left, int right) {
		int mid;
		long count = 0;
		if (right > left) {
			mid = (right + left) / 2;
			count = mergeSort(a, left, mid);
			count += mergeSort(a, mid + 1, right);
			count += mergPartofArray(a, left, mid, right);
		}
		return count;
	}

	static long mergPartofArray(int a[], int l, int m, int r) {

		int length = r - l + 1;
		int c[] = new int[length];
		int i = 0, j = l, k = m + 1;
		long count = 0;
		while (j <= m && k <= r) {
			if (a[j] <= a[k]) {
				c[i++] = a[j++];
			} else {
				c[i++] = a[k++];
				count += (m + 1) - j;
			}
		}

		while (j <= m) {
			c[i++] = a[j++];
		}

		while (k <= r) {
			c[i++] = a[k++];
		}
		i = 0;
		while (l <= r) {
			a[l++] = c[i++];
		}
		return count;

	}

}
