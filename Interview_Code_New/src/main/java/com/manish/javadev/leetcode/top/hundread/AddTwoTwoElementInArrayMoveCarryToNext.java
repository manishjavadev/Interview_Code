package com.manish.javadev.leetcode.top.hundread;

import java.util.ArrayList;
import java.util.List;

import com.manish.javadev.geeks.linkedlist.Entity;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * 
 * Input:
 * 
 * l1 = [2,4,3],
 * 
 * l2 = [5,6,4]
 * 
 * Output: [7,0,8]
 * 
 * Explanation: 342 + 465 = 807.
 * 
 * Example 2:
 * 
 * Input: l1 = [0], l2 = [0] Output: [0] Example 3:
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]
 * 
 * @author kmamani
 *
 */
public class AddTwoTwoElementInArrayMoveCarryToNext {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 4, 1, 5, 6, 2, 7, 8, 1 };
		List<Integer> result = addAndMoveCarry(arr);
		System.out.println(result);

	}

	private static List<Integer> addAndMoveCarry(int[] arr) {
		int carry = 0;
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i += 2) {
			int sum = arr[i] + arr[i + 1] + carry;
			result.add(sum % 10);
			carry = sum / 10;
		}
		if (carry > 0) {
			result.add(carry);
		}
		return result;

	}

	private static void display(Entity root) {
		while (root != null) {
			System.out.println(root.data);
			root = root.next;
		}

	}

}
