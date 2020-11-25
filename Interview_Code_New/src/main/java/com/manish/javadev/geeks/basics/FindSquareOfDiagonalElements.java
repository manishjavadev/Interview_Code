package com.manish.javadev.geeks.basics;

/**
 * Time Complexity O(n * n )
 * 
 * Input :
 * 
 * 1 2 3
 * 
 * 4 5 6
 * 
 * 7 8 9
 * 
 * Output : Diagonal one: 1 25 81 Diagonal two: 9 25 49
 * 
 * Input :
 * 
 * 2 5 7
 * 
 * 3 7 2
 * 
 * 5 6 9
 * 
 * Output : Diagonal one : 4 49 81 Diagonal two : 49 49 25
 * 
 * @author kmamani
 *
 */
public class FindSquareOfDiagonalElements {
	static int MAX = 100;

	// Driver code
	public static void main(String[] args) {
		int mat[][] = { { 2, 5, 7 }, { 3, 7, 2 }, { 5, 6, 9 } };
		diagonalsquare(mat, 3, 3);

	}

	// function of diagonal square
	static void diagonalsquare(int mat[][], int row, int column) {
		// This loop is for finding square of first
		// diagonal elements
		System.out.print("Diagonal one : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)

				// if this condition will become true
				// then we will get diagonal element
				if (i == j)

					// printing square of diagonal element
					System.out.print(mat[i][j] * mat[i][j] + " ");
		}
		System.out.println();

		// This loop is for finding square of second
		// side of diagonal elements
		System.out.print("Diagonal two : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)

				// if this condition will become true
				// then we will get second side diagonal
				// element
				if (i + j == column - 1)

					// printing square of diagonal element
					System.out.print(mat[i][j] * mat[i][j] + " ");
		}
	}

}
