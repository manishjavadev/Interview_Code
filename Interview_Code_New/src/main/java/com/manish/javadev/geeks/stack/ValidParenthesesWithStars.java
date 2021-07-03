package com.manish.javadev.geeks.stack;

import java.util.Stack;

/**
 * 
 * https://www.youtube.com/watch?v=KuE_Cn3xhxI
 * 
 * " * can be convert to '(' or ')' or empty String
 * 
 * 
 * position of breakers is extremely impotent for balancing
 * 
 * 
 * 
 * (*) //TRUE
 * 
 * (*)) //TRUE
 * 
 * )*() // FALSE
 * 
 * *()) //TRUE
 * 
 * **()) // TRUE
 *
 * @author Manish Srivastava
 *
 */
public class ValidParenthesesWithStars {
	public static void main(String[] args) {
		ValidParenthesesWithStars fixture = new ValidParenthesesWithStars();
		boolean result = fixture.checkValidString("*(()*))");
		System.out.println("Check Valid String ::  " + result);
	}

	public boolean checkValidString(String s) {

		Stack<Integer> open = new Stack<Integer>();
		Stack<Integer> star = new Stack<Integer>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == '(')
				open.push(i);
			else if (s.charAt(i) == '*')
				star.push(i);
			else {
				if (!open.empty())
					open.pop();
				else if (!star.empty())
					star.pop();
				else
					return false;
			}
		}

		// Now process left over opening brackets
		while (!open.empty()) {
			if (star.empty())
				return false;
			else if (open.peek() < star.peek()) {
				open.pop();
				star.pop();
			} else // CASE: open.top() > star.top()
				return false;
		}
		return true;
	}
}