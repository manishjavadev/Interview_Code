package com.manish.javadev.array;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program do transpose of matrix
 * 
 */
public class TransposeMatrix {
	public static void main(String[] args) {
		int row = 3;
		int col = 4;

		int matrix1[][];
		int matrix2[][];
		matrix1 = new int[3][4];
		matrix2 = new int[4][3];
		Scanner sc = new Scanner(System.in);

		// Here we are taking first matrix from user
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter Number for matrix");
				matrix1[i][j] = sc.nextInt();
			}
		}

		// Here we are transposing logic
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				matrix2[i][j] = matrix1[j][i];
			}
		}
		System.out.println("Entered Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix1[i][j] + "  ");
			}
			System.out.println("\n");
		}

		System.out.println("Transpose Matrix");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(matrix2[i][j] + "  ");
			}
			System.out.println("\n");
		}
		System.out.println("Done");
	}
}
