package com.manish.javadev.geeks.basics;

/**
 * Time Complexity O(n)
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
 * Method 2: An efficient solution is also same as in naive approach but in
 * this, we are taking only one loop to find the diagonal element and then we
 * print the square of that element.
 * 
 * @author kmamani
 *
 */
public class FindSquareOfDiagonalElementsWithOnTime {
	static int MAX = 100;

	// Driver code
	public static void main(String[] args) {
		int mat[][] = { { 2, 5, 7 }, { 3, 7, 2 }, { 5, 6, 9 } };
		diagonalsquare(mat, 3, 3);

	}

	// function of diagonal square
	static void diagonalsquare(int mat[][], int row, int column) {
		// This loop is for finding of square of
		// the first side of diagonal elements
		System.out.print(" Diagonal one : ");
		for (int i = 0; i < row; i++) {

			// printing direct square of diagonal
			// element there is no need to check
			// condition
			System.out.print(mat[i][i] * mat[i][i] + " ");
		}
		System.out.println();

		// This loop is for finding square of the
		// second side of diagonal elements
		System.out.print(" Diagonal two : ");
		for (int i = 0; i < row; i++) {
			// printing direct square of diagonal
			// element in the second side
			System.out.print(mat[i][row - i - 1] * mat[i][row - i - 1] + " ");
		}
	}
}
