package com.manish.javadev.geeks.stack;

import java.util.Stack;

/**
 * @author kmamani
 *
 */
public class FindMinimumOfStackByUsingRefStack {
	Stack<Integer> stack;
	Stack<Integer> refstack;
	Integer minEle;

	// Constructor
	FindMinimumOfStackByUsingRefStack() {
		stack = new Stack<Integer>();
		refstack = new Stack<Integer>();
	}

	// Prints minimum element of MyStack
	void getMin() {
		// Get the minimum number in the entire stack
		if (stack.isEmpty())
			System.out.println("Stack is empty");

		// variable minEle stores the minimum element
		// in the stack.
		else
			System.out.println("Minimum Element in the " + " stack is: " + refstack.peek());
	}

	// prints top element of MyStack
	void peek() {
		if (stack.isEmpty()) {
			System.out.println("Stack is empty ");
			return;
		}
		Integer t = stack.peek(); // Top element.

		System.out.print("Top Most Element is: ");

		// If t < minEle means minEle stores
		// value of t.
		if (t < refstack.peek())
			System.out.println(refstack.peek());
		else
			System.out.println(t);
	}

	// Removes the top element from MyStack
	void pop() {
		if (stack.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.print("Top Most Element Removed: ");
		Integer t = stack.pop();

		// Minimum will change as the minimum element
		// of the stack is being removed.
		if (t == refstack.peek()) {
			System.out.println(refstack.peek());
			refstack.pop();
		} else
			System.out.println(t);
	}

	// Insert new number into MyStack
	void push(Integer x) {
		if (stack.isEmpty()) {
			stack.push(x);
			refstack.push(x);
			System.out.println("Number Inserted: " + x);
			return;
		}

		// If new number is less than original minEle
		if (x < refstack.peek()) {
			stack.push(x);
			refstack.push(x);
		} else
			stack.push(x);
		System.out.println("Number Inserted: " + x);
	}

	public static void main(String[] args) {
		FindMinimumOfStackByUsingRefStack s = new FindMinimumOfStackByUsingRefStack();
		s.push(50);
		s.push(40);
		s.push(35);
		s.push(55);
		s.push(37);
		s.push(20);
		s.getMin();
		s.pop();
		s.pop();
		s.getMin();
		s.push(60);
		s.pop();
		s.push(10);
		s.getMin();
	}
}
