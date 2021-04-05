package com.manish.javadev.geeks.stack;

import java.util.Stack;

/**
 * https://java-questions.com/valid-parentheses.html
 * 
 * More Complex Link https://www.youtube.com/watch?v=KuE_Cn3xhxI
 * 
 * 
 * Q) Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid. The brackets must close in the
 * correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * The problem can be solved using a Stack which maintains the state of the
 * valid parentheses. The way problem can be approached is as follows:
 * 
 * If the current index contains one of the open brackets push the string to
 * stack. If the current index contains the close bracket. Pop the element from
 * the top of stack If the pop element is the correct pair of the current index,
 * continue traversing the string, else return false If end of string is return
 * check whether stack is empty. If stack is empty return true else return false
 * 
 * @author Manish Srivastava
 *
 */
public class ValidParentheses {

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