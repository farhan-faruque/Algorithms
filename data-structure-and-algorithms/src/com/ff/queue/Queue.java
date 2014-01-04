package com.ff.queue;

public interface Queue<T>
{
	int size();
	void enque(T t);
	T deque();
	boolean isEmpty();
	void show();
}
