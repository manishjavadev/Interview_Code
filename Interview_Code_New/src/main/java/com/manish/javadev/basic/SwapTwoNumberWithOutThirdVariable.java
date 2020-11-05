package com.manish.javadev.basic;

/**
 * @author Manish
 *
 */
/**
 * This is simple java program which swap two variable number without the help
 * of third variable.
 *
 */
public class SwapTwoNumberWithOutThirdVariable {

	public static void main(String[] args) {
		int x = 4;
		int y = 5;
		System.out.println("Before swapping x= " + x);
		System.out.println("Before swapping y= " + x);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping x= " + x);
		System.out.println("After swapping y= " + x);

	}
}
