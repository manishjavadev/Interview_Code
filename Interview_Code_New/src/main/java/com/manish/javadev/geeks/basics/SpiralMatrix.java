package com.manish.javadev.geeks.basics;

/**
 * @author Manish Srivastava
 *
 *A spiral matrix is n x n square matrix formed by placing the numbers 1, 2, 3,4 n2 in spiral form
starting form the leftmost column and topmost row. Spiral matrices can exist for both even and odd
values of n. The spiral matrices for n = 3, n = 4, n = 7 are shown below-
 
 */

/**
 * for N=3 1 2 3 8 9 4 7 6 5
 * 
 * for N=4 1 2 3 4 12 13 14 5 11 16 15 6 10 9 8 7
 * 
 * for N=7 1 2 3 4 5 6 7 24 25 26 27 28 29 8 23 40 41 42 43 30 9 22 39 48 49 44
 * 31 10 21 38 47 46 45 32 11 20 37 36 35 34 33 12 19 18 17 16 15 14 13
 */
public class SpiralMatrix {
	public static void main(String[] args) {

		int n = 5;
		int arr[][] = new int[n][n];
		int row = 0;
		int col = 0;
		int base_row_col = 0;
		int last_row_col = n - 1;
		for (int num = 1; num <= n * n; num++) {
			arr[row][col] = num;
			if (row == base_row_col && col < last_row_col) {
				col++;
			} else if (col == last_row_col && row < last_row_col) {
				row++;
			} else if (row == last_row_col && col > base_row_col) {
				col--;
			} else if (col == base_row_col && row > base_row_col) {
				row--;
			}
			// if arr[row][col] != 0 means particular arr[row][col] is
			// processed, so manage row and column by increase and decreasing
			// row and col
			if (arr[row][col] != 0) {
				row++;
				col++;
				base_row_col++;
				last_row_col--;
			}
		}
		// Display Matrix in Spiral Form
		for (int row1 = 0; row1 < n; row1++) {
			for (int col1 = 0; col1 < n; col1++) {
				System.out.print(arr[row1][col1] + "\t");
			}
			System.out.println("\n");
		}
	}
}
