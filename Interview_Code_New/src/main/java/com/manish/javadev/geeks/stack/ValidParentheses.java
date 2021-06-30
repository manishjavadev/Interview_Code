package com.manish.javadev.geeks.stack;

import java.util.HashMap;
import java.util.Map;
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

		System.out.println(isValid("{}[]"));// true
		System.out.println(isValid("{[}]"));// false
		System.out.println(isValid("[}]"));// false
		System.out.println(isValid("(])"));// false
		System.out.println(isValid("({[})"));// false
		System.out.println(isValid("([}}])"));// false
		System.out.println(isValid("([{}])"));// true
		System.out.println(isValid("[{}]"));// true

	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				stack.push(s.charAt(i));
			else if (s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
				stack.pop();
			else if (s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
				stack.pop();
			else if (s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
				stack.pop();
			else
				return false;
		}
		return stack.empty();
	}
}