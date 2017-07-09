package com.manish.javadev.array;

import java.util.ArrayList;
import java.util.List;
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
		
		Scanner sc = new Scanner(System.in);

		String matrix[][] = new String[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter Number for matrix");
				matrix[i][j] = sc.next();
			}
		}

		// Here i am displaying the matrix
		System.out.println("Entered Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println("\n");
		}

		int result = findDuplicate(matrix);
		System.out.println("Result = " + result);
	}

	private static int findDuplicate(String[][] matrix1) {
		int counter = 0;
		List list = new ArrayList();
		// TODO Auto-generated method stub
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				if (list.contains(matrix1[i][j]) && matrix1[i][j] != null) {
					counter++;
				}
				list.add(matrix1[i][j]);

			}
		}
		return counter;
	}
}
