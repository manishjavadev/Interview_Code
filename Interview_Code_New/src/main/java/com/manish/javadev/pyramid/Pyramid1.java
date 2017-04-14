package com.manish.javadev.pyramid;

public class Pyramid1 {
	public static void main(String[] args) {
		int n = 5;
		int j = 0;
		for (int i = 1; i <= n; i++) {
			for (j = 1; j <= 2 * (n + 1 - i); j++)
				System.out.print("-");
			for (j = 1; j <= i; j++)
				System.out.print("* ");
			for (j = 1; j < i; j++)
				System.out.print("* ");
			System.out.println("");
		}
	}
}
