package com.manish.javadev.array;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program simply adding two matrix in third matrix.
 *
 */
public class MatrixAddition {
	
	public static void main(String[] args) {
		int row = 3;
		int col = 4;
		int matrix1[][];
		int matrix2[][];
		int matrix3[][];
		matrix1 = new int[3][4];
		matrix2 = new int[3][4];
		matrix3 = new int[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered first matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter Number for matrix");
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Entered second matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter Number for matrix");
				matrix2[i][j] = sc.nextInt();
			}
		}
		// Matrix addition
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		//This below code for displaying the matrix there is no logic here 
		System.out.println("First matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix1[i][j] + "  ");
			}
			System.out.println("\n");
		}
		System.out.println("Second matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix2[i][j] + "  ");
			}
			System.out.println("\n");
		}
		System.out.println("After adding Matrix is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix3[i][j] + "  ");
			}
			System.out.println("\n");
		}
		System.out.println("Done");

	}
}
