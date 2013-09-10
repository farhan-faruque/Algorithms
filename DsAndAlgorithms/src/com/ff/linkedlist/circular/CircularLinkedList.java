package com.ff.linkedlist.circular;

import com.ff.linkedlist.LinkedList;

public class CircularLinkedList implements LinkedList {

	private int size;
	private CircularLinkedNode head;
	
	public CircularLinkedList() 
	{
		size = 0;
		head = null;		
	}
	
	@Override
	public void addFirst(int data) {
		
		
	}

	@Override
	public void addLast(int data) {
		
	}

	@Override
	public void add(int data) {
		
	}

	@Override
	public boolean add(int data, int pos) {
		return false;
	}

	@Override
	public boolean removeFirst() {
		return false;
	}

	@Override
	public boolean removeLast() {
		return false;
	}

	@Override
	public boolean remove(int pos) {
		return false;
	}

	@Override
	public int getFirst() {
		return 0;
	}

	@Override
	public int getLast() {
		return 0;
	}

	@Override
	public int find(int pos) {
		return 0;
	}

	@Override
	public void show() 
	{
		
		
	}

	@Override
	public int getSize() 
	{		
		return size;
	}

}
