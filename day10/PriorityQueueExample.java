package com.day10;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
		pqueue.offer(50);
		pqueue.offer(20);
		pqueue.offer(10);
		pqueue.offer(5);
		pqueue.offer(12);

		System.out.println(pqueue);

		pqueue.poll();
		System.out.println(pqueue);
		pqueue.poll();
		
		System.out.println(pqueue);

	}

}
