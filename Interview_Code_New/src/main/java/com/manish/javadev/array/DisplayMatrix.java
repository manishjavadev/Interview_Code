package com.manish.javadev.array;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program is simply taking input from user and displaying a matrix.
 * 
 */
public class DisplayMatrix {

	public static void main(String[] args) {
		int row = 3;
		int col = 4;
		int matrix1[][];
		matrix1 = new int[3][4];
		Scanner sc = new Scanner(System.in);

		// In side for loop we are taking input from user and displaying String
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter Number for matrix");
				matrix1[i][j] = sc.nextInt();
			}
		}

		// Here i am displaying the matrix
		System.out.println("Entered Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix1[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}
}
