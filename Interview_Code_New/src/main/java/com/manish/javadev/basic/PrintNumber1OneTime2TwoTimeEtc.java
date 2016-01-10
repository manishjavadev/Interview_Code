package com.manish.javadev.basic;

/**
 * @author Manish
 *
 */

/**
 * WAP print 1 one time 2 two time 3 three time etc
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * like that
 * 
 */
public class PrintNumber1OneTime2TwoTimeEtc {
	public static void main(String[] args) {
		for(int i =1;i<10;i++){
			for(int j =1;j<=i;j++){
				System.out.print(i);				
			}
			System.out.print("\n");
		}
		System.out.println("Done");
	}
}
