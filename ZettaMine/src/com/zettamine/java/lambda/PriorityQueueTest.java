package com.zettamine.java.lambda;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(25);
		queue.offer(5);
		queue.offer(200);
		queue.offer(91);
		queue.offer(2);
		queue.offer(3);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
	}
}
