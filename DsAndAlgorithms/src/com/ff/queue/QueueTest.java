package com.ff.queue;

public class QueueTest {

	public static void main(String [] args)
	{
		Queue<String> queue = new LinkedQueue<String>();
		queue.enque("Farhan");
		queue.enque("Faruque");
		queue.enque("Russel");
		queue.deque();
		queue.show();
		
		
	}
}
