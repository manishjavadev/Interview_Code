package com.manish.javadev.vmware.array;

/**
 * 
 * https://www.geeksforgeeks.org/a-boolean-matrix-question/
 * 
 * Given a boolean matrix mat[M][N] of size M X N, modify it such that if a
 * matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and
 * jth column as 1.
 * 
 * 
 * Example 1
 * 
 * The matrix
 * 
 * 1 0
 * 
 * 0 0
 * 
 * should be changed to following 1 1
 * 
 * 1 0
 * 
 * Example 2
 * 
 * The matrix
 * 
 * 0 0 0
 * 
 * 0 0 1
 * 
 * should be changed to following
 * 
 * 0 0 1
 * 
 * 1 1 1
 * 
 * Example 3
 * 
 * The matrix
 * 
 * 1 0 0 1
 * 
 * 0 0 1 0
 * 
 * 0 0 0 0
 * 
 * should be changed to following
 * 
 * 1 1 1 1
 * 
 * 1 1 1 1
 * 
 * 1 0 1 1
 * 
 * @author kmamani
 *
 */
public class ABooleanMatrixQuestion {

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 0, 1 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, };

		System.out.println("Matrix Intially");

		printMatrix(mat, 3, 4);

		modifyMatrix(mat, mat.length, mat[0].length);
		System.out.println("Matrix after modification n");
		printMatrix(mat, 3, 4);

	}

	public static void modifyMatrix(int mat[][], int R, int C) {
		int row[] = new int[R];
		int col[] = new int[C];
		int i, j;

		
		/*
		 * Store the rows and columns to be marked as 1 in row[] and col[] arrays
		 * respectively
		 */
		for (i = 0; i < R; i++) {
			for (j = 0; j < C; j++) {
				if (mat[i][j] == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		/*
		 * Modify the input matrix mat[] using the above constructed row[] and col[]
		 * arrays
		 */
		for (i = 0; i < R; i++) {
			for (j = 0; j < C; j++) {
				if (row[i] == 1 || col[j] == 1) {
					mat[i][j] = 1;
				}
			}
		}
	}

	/* A utility function to print a 2D matrix */
	public static void printMatrix(int mat[][], int R, int C) {
		int i, j;
		for (i = 0; i < R; i++) {
			for (j = 0; j < C; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
