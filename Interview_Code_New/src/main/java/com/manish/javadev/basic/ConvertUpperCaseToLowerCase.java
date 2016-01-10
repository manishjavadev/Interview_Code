package com.manish.javadev.basic;

/**
 * @author Manish
 *
 */
/**
 * This program simply converting upper case to lower case
 *
 */
public class ConvertUpperCaseToLowerCase {
	
	public static void main(String[] args) {
		String strBase = "JavaLearnigCenter";
		String strFinal = "";
		char ch[];
		ch = strBase.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char chr = strBase.charAt(i);
			 
			if (chr >= 'A'&& chr <= 'Z')
				chr = (char) (chr + 32);
			//Note if you want to convert lower to upper case then please use below line
			//chr = (char) (chr - 32);
			strFinal = strFinal + chr;

		}
		System.out.println("Final string in lower case is\t" + strFinal);

	}

}
