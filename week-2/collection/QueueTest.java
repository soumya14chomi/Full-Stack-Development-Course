package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public QueueTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Queue<Integer> pq = new LinkedList<>();
		for(int i=0;i<6;i++)	pq.add(i);
		System.out.println(pq);
		System.out.println("==========================");
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println("===========================");
		System.out.println(pq.poll());
	}

}
