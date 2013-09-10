package com.ff.linkedlist;

public interface LinkedListI<T>
{
	void addFirst(T data);
	void addLast(T data);
	void add(T data);
	void add(int pos,T data);

	boolean removeFirst();
	boolean removeLast();
	boolean remove(int pos);
	boolean remove(T t);

	T getFist();
	T getLast();
	T find(int pos);	
	int find(T t);
	void show();
	int getSize();

}
