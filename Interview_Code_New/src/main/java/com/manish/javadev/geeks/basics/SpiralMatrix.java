package com.manish.javadev.geeks.basics;

/**
 * @author Manish Srivastava
 *
 */
public class SpiralMatrix {
	public static void main(String[] args) {

		int n = 4;
		int arr[][] = new int[n][n];
		int i = 0;
		int j = 0;
		int l = 0;
		int u = n - 1;
		for (int num = 1; num <= n * n; num++) {
			arr[i][j] = num;
			if (i == l && j < u) {
				j++;
			} else if (j == u && i < u) {
				i++;
			} else if (i == u && j > l) {
				j--;
			} else if (j == l && i > l) {
				i--;
			}
			if (arr[i][j] != 0) {
				i++;
				j++;
				l++;
				u--;
			}
		}
		// Display Matrix in Spiral Form
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println("\n");
		}
	}
}
