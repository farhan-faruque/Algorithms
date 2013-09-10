package com.ff.linkedlist;

public interface LinkedList 
{
	void addFirst(int data);
	void addLast(int data);
	void add(int data);
	boolean add(int data,int pos);

	boolean removeFirst();
	boolean removeLast();
	boolean remove(int pos);

	int getFirst();
	int getLast();
	int find(int pos);
	void show();
	int getSize();

}
