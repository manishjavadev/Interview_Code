package com.manish.javadev.geeks.stack;

import java.util.Stack;

/**
 * https://www.geeksforgeeks.org/design-a-stack-that-supports-getmin-in-o1-time-and-o1-extra-space/
 * 
 * Design a stack that supports getMin() in O(1) time and O(1) extra space
 * 
 * Question: Design a Data Structure SpecialStack that supports all the stack
 * operations like push(), pop(), isEmpty(), isFull() and an additional
 * operation getMin() which should return minimum element from the SpecialStack.
 *
 * All these operations of SpecialStack must be O(1). To implement SpecialStack,
 * you should only use standard Stack data structure and no other data structure
 * like arrays, list, .. etc.
 * 
 * Example:
 * 
 * Consider the following SpecialStack 16 --> TOP 15 29 19 18
 * 
 * When getMin() is called it should return 15, which is the minimum element in
 * the current stack.
 * 
 * If we do pop two times on stack, the stack becomes 29 --> TOP 19 18
 * 
 * When getMin() is called, it should return 18 which is the minimum in the
 * current stack.
 * 
 * @author kmamani
 *
 */
public class FindMaximumOfStackByO1 {
	Stack<Integer> s;
	Integer maxEle;

	// Constructor
	FindMaximumOfStackByO1() {
		s = new Stack<Integer>();
	}

	// Prints minimum element of MyStack
	void getMax() {
		// Get the minimum number in the entire stack
		if (s.isEmpty())
			System.out.println("Stack is empty");

		// variable minEle stores the minimum element
		// in the stack.
		else
			System.out.println("Minimum Element in the " + " stack is: " + maxEle);
	}

	// prints top element of MyStack
	void peek() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty ");
			return;
		}

		Integer t = s.peek(); // Top element.

		System.out.print("Top Most Element is: ");

		// If t < minEle means minEle stores
		// value of t.
		if (t > maxEle)
			System.out.println(maxEle);
		else
			System.out.println(t);
	}

	// Removes the top element from MyStack
	void pop() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.print("Top Most Element Removed: ");
		Integer tmp = s.pop();

		// Minimum will change as the minimum element
		// of the stack is being removed.
		if (tmp > maxEle) {
			System.out.println(maxEle);
			maxEle = 2 * maxEle - tmp;
		} else
			System.out.println(tmp);
	}

	// Insert new number into MyStack
	void push(Integer x) {
		if (s.isEmpty()) {
			maxEle = x;
			s.push(x);
			System.out.println("Number Inserted: " + x);
			return;
		}

		// If new number is less than original minEle
		if (x > maxEle) {
			s.push(2 * x - maxEle);
			maxEle = x;
		} else
			s.push(x);
		System.out.println("Number Inserted: " + x);
	}

	public static void main(String[] args) {
		FindMaximumOfStackByO1 s = new FindMaximumOfStackByO1();
		s.push(3);
		s.push(5);
		s.getMax();
		s.push(2);
		s.push(1);
		System.out.println(s);
		System.out.println("Getting Max Element");
		s.getMax();

		s.pop();
		System.out.println("Getting Max Element");
		s.getMax();
		s.pop();
		s.peek();
	}
}
