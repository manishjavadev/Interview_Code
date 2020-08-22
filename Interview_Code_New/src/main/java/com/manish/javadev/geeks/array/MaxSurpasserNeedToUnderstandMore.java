package com.manish.javadev.geeks.array;

public class MaxSurpasserNeedToUnderstandMore {
	int[] a, b, c, tmp;

	private MaxSurpasserNeedToUnderstandMore(int[] a) {
		this.a = a;
		this.b = new int[a.length];
		this.c = new int[a.length];
		this.tmp = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = i;
		}
	}

	public static int find(int[] a) {
		return new MaxSurpasserNeedToUnderstandMore(a).search();
	}

	private int search() {
		mergeSort(0, a.length - 1);
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (c[i] > max) {
				max = c[i];
			}
		}
		return max;
	}

	private void mergeSort(int l, int r) {
		if (l >= r) {
			return;
		}
		int m = (l + r) / 2;
		mergeSort(l, m);
		mergeSort(m + 1, r);
		int i = l;
		int j = m + 1;
		int acc = 0;
		for (int s = l; s <= r; s++) {
			if (j > r || i <= m && a[b[i]] >= a[b[j]]) {
				tmp[s] = b[i];
				c[b[i]] += acc;
				i++;
			} else {
				tmp[s] = b[j];
				acc++;
				j++;
			}
		}
		for (int s = l; s <= r; s++) {
			b[s] = tmp[s];
		}
	}
}