package com.manish.javadev.pyramid;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class RectangleStars {
	public static void main(String[] args) {
		int rows = 5;
		int cols = 10;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				if (i != 1 && i != rows) {
					if (j == 1 || j == cols) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print("*");
				}
			}
			if (i != rows) {
				System.out.println();
			}
		}
	}
}
