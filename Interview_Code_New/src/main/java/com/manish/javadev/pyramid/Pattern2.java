package com.manish.javadev.pyramid;

public class Pattern2 {
	public static void main(String[] args) {
		int n=5;
		int spaces=2*(n-1);
        int p=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n-p;j++)
				System.out.print("*");
			for(int k=1;k<=spaces;k++)
				System.out.print(" ");
			for(int x=1;x<=n-p;x++)
				System.out.print("*");
			p--;
			spaces=spaces-2;
			System.out.println();
		}
        spaces=0;
        p=0;
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=n-p;j++)
        		System.out.print("*");
        	for(int k=1;k<=spaces;k++)
        		System.out.print(" ");
        	for(int x=1;x<=n-p;x++)
				System.out.print("*");
        	p++;
        	spaces=spaces+2;
        	System.out.println();
        }
}
}
