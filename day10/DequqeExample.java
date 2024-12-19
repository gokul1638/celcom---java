package com.day10;

import java.util.Deque;
import java.util.LinkedList;


public class DequqeExample {

	public static void main(String[] args) {
		Deque<Integer> dqueue = new LinkedList<>();
		dqueue.offer(10);
		dqueue.add(20);
		dqueue.offer(20);
		dqueue.add(30);
		
		System.out.println(dqueue);
		
		//queue.poll();
		
		//dqueue.remove(30);
		dqueue.offerFirst(111);
		
		System.out.println(dqueue);
		
		dqueue.pollFirst();
		dqueue.pollLast();
		
		System.out.println(dqueue);

	}

}
