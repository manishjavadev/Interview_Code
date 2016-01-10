package com.manish.javadev.array;
import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program checkes entered number in side array or not
 *
 */
public class SearchNumberInArray {
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num;
		int index;
		
		System.out.println("Enter the number to be search in array");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (index = 0; index < arr.length; index++) {
			if(num==arr[index]){
				System.out.println(num +" found at position "+(index+1)+" in array");
			}
		}
		
		if(index==arr.length)
			System.out.println(num +" is not found in array");
		System.out.println("Done");
	}
}
