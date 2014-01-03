package com.ff.queue;

import com.ff.stack.Node;

public class LinkedQueue<T> implements Queue<T> 
{
	int size;
	private Node font;
	private Node rear;
	
	public LinkedQueue()
	{
		size = 0;
		font = null;
		rear = null;
		
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public void enque(T t) 
	{
		
	}

	@Override
	public T deque() 
	{
		return null;
	}

	@Override
	public boolean isEmpty() 
	{
		return false;
	}

}
