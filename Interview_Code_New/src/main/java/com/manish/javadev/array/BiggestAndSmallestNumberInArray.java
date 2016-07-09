package com.manish.javadev.array;

/**
 * @author Manish
 *
 */
/**
 * This program find biggest and smallest number in array
 *
 */
public class BiggestAndSmallestNumberInArray {
	
	public static void main(String[] args) {
		
		int maxNumber=0; 
		int minNumber=0; 
		int arr[]={10,3,5,7,0,9};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxNumber){
				maxNumber=arr[i];
			}
			if(arr[i]<minNumber){
				minNumber=arr[i];
			}
		}  
		
		System.out.println("Biggest Number = "+maxNumber+"\nAnd Smallest Number = "+minNumber);
		System.out.println("Done");
	}

}
