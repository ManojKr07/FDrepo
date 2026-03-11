package com.ds.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<Integer>();
		myQueue.add(10);
		myQueue.offer(20);
		myQueue.offer(30);
		myQueue.offer(40);
		myQueue.offer(50);
		System.out.println(myQueue.peek());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		
	}

}
