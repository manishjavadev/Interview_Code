package com.manish.javadev.basic;

/**
 * @author Manish
 *
 */
/**
 * This is simple java program which swap two variable
 * number with the help of third variable.
 *
 */
public class SwapTwoNumberWithThirdVariable {
	
	public static void main(String[] args) {
		
		int x = 4;
		int y = 5;
		int z=0;
		System.out.println("Before swapping x= "+x);
		System.out.println("Before swapping y= "+y);
		z=x+y;
		y=z-y;
		x=z-x;
		System.out.println("After swapping x= "+x);
		System.out.println("After swapping y= "+y);
	
	}
}
