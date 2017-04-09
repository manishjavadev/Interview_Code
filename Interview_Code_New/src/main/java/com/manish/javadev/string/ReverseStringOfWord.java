package com.manish.javadev.string;

/**
 * @author Manish
 *
 */
/**
 * This program reversing the word of String at same place for
 * Ex:
 * java development blog
 * reverse String
 * avaj tnempoleved golb
 */
public class ReverseStringOfWord {
	String finlaString = "";
	String getStr = "";
	
	public void doReverse() {
		String inputString = "java development blog";
		char ch[] = new char[inputString.length()];
		ch = inputString.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == ' ')
				reverse(getStr);
			else{
				getStr = getStr + ch[i];
			}
			
			if (i == ch.length - 1)
				reverse(getStr);
		}
		System.out.println(inputString);
		System.out.println("reverse String");

	}	
	private void reverse(String str) {
		char ar[] = str.toCharArray();
		for (int i = ar.length-1; i >= 0; i--) {
			finlaString = finlaString + ar[i];
		}
		finlaString = finlaString + " ";
		getStr = "";
	}

}
class TestReverseStringOfWord{
	public static void main(String[] args) {
		ReverseStringOfWord rsw= new ReverseStringOfWord();
		rsw.doReverse();
		System.out.println();
		System.out.println(rsw.finlaString.trim());
	}
}
