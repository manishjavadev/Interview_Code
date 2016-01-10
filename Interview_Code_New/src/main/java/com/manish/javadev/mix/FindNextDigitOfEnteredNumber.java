package com.manish.javadev.mix;

import java.util.Arrays;

public class FindNextDigitOfEnteredNumber {
	
	//Sort the content
	static String sort(String str) {
		char temp = ' ';
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		String str1 = new String(ch);
		return str1;
	}

	public static void main(String[] args) {
		String str = "1341";
		char temp = ' ';
		char ch[] = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			if (i == ch.length - 1)
				temp = ch[i];

			if (ch[i - 1] < ch[i]) {
				//If Zero come in between Then logic change so manage both zero 
				//and non zero
				if (ch[i - 1] == '0') {
					ch[i - 1] = temp;
					String str2 = str.substring(i - 1, str.length() - 1);
					str2 = sort(str2);
					for (int j = 0; j < str2.length(); j++) {
						ch[i++] = str2.charAt(j);
					}
					break;
				} 
				//For Not Zero
				else {
					char temp11 = ch[i - 1];
					ch[i - 1] = ch[i];
					ch[i] = temp11;
					String str3 = "";
					for (int j = i; j < ch.length; j++) {
						str3 = str3 + ch[j] + "";
					}
					str3 = sort(str3);
					for (int j = 0; j < str3.length(); j++) {
						ch[i++] = str3.charAt(j);
					}
					break;
				}

			}
		}
		System.out.println(Arrays.toString(ch));
	}
}
