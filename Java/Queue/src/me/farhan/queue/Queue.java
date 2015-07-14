package me.farhan.queue;

public interface Queue<T>{

	boolean isEmpty();
	void enque(T t);
	void deque() throws Exception; 
	T peek();
}
