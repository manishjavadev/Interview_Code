package com.manish.javadev.leetcode.top.hundread;

import java.util.Stack;

import junit.extensions.ActiveTestSuite;

/**
 * Example 1:
 * 
 * Input: s = "()" Output: true Example 2:
 * 
 * Input: s = "()[]{}" Output: true Example 3:
 * 
 * Input: s = "(]" Output: false Example 4:
 * 
 * Input: s = "([)]" Output: false Example 5:
 * 
 * Input: s = "{[]}" Output: true
 * 
 * @author kmamani
 *
 */
public class ValidParentheses {
	public static void main(String[] args) {
		String str = "{]}";
		boolean result = isValidParentheses(str);
		if (result) {
			System.out.println("ValidParentheses " + result);
		} else {
			System.out.println("Not A Valid Parentheses " + result);
		}
	}

	private static boolean isValidParentheses(String str) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.add(ch);
			} else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}

		}
		return stack.isEmpty();
	}

}
