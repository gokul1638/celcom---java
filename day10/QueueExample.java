package com.day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.add(20);
		queue.offer(20);
		queue.add(30);
		
		System.out.println(queue);
		
		//queue.poll();
		
		queue.remove(30);
		
		System.out.println(queue);
	}

}
