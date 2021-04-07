package com.manish.javadev.geeks.stack;

import java.util.Stack;

/**
 * 
 * 
 * More Complex Link https://www.youtube.com/watch?v=KuE_Cn3xhxI
 * 
 * 
 * @author Manish Srivastava
 *
 */
public class ValidParentheses2 {

	public static void main(String[] args) {
		System.out.println(isValid("{}[]"));
		System.out.println(isValid("{[}]"));
		System.out.println(isValid("[{}]"));
	}

	public static boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> set = new Stack<Character>();
		for (Character ch : s.toCharArray()) {
			if (ch == '{' || ch == '[' || ch == '(') {
				set.push(ch);
			} else if (ch == '}' && !set.isEmpty() && set.peek() == '{') {
				set.pop();
			} else if (ch == ']' && !set.isEmpty() && set.peek() == '[') {
				set.pop();
			} else if (ch == ')' && !set.isEmpty() && set.peek() == '(') {
				set.pop();
			}
		}
		return set.isEmpty();
	}
}