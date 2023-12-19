package com.zettamine.java.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListQueue {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.offer(13);
		queue.offer(1);
		queue.offer(7);
		queue.offer(25);
		queue.offer(90);
		queue.offer(3);
		queue.offer(1000);
		queue.offer(56);
		queue.offer(2);
		queue.offer(77);
		System.out.println(queue);
	}
}
