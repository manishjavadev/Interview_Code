package com.manish.javadev.geeks.array;

public class CharCountAdjacenttoChar {
	public static void main(String[] args) {
		char ch[] = { 'a', 'a', 'a', 'b', 'c', 'c', 'c', 'd', 'd' };
		int count = 0,start=0;
		char temp = ' ';
		for (int i = 0; i < ch.length; i++) {
			if (count == 0) {
				temp = ch[i];
			}
			if (temp == ch[i]) {
				count++;
				ch[i] = ' ';

			} else {
				ch[start++]=temp;
				ch[start++]= (char)(count + '0') ;
				count = 1;
				temp =  ch[i];
				ch[i] = ' ';
			}
			if (i == ch.length - 1) {
				ch[start++]=temp;
				ch[start++]= (char)(count + '0') ;
			}
		}
		System.out.println(ch);
	}

}
