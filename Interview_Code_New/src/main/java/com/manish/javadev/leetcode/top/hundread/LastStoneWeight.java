package com.manish.javadev.leetcode.top.hundread;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
	public static void main(String[] args) {
		int[] stones = { 2, 7, 4, 1, 8, 1 };
		LastStoneWeight lsw = new LastStoneWeight();
		int lastStoneWeight = lsw.lastStoneWeight(stones);
		System.out.println(lastStoneWeight);
	}

	public int lastStoneWeight(int[] stones) {

		Queue<Integer> result = new PriorityQueue<>(Collections.reverseOrder());

		for (int val : stones) {
			result.add(val);
		}

		while (result.size() >= 2) {
			int k = result.poll();
			int l = result.poll();
			result.add(Math.abs(l - k));
		}

		return result.peek();
	}

}
