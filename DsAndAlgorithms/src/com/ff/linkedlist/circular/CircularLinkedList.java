package com.ff.linkedlist.circular;

import com.ff.linkedlist.LinkedList;

public class CircularLinkedList implements LinkedList {

	private int size;
	private CircularLinkedNode head;
	private CircularLinkedNode tail;

	public CircularLinkedList() 
	{
		size = 0;
		head = null;		
		tail = null;
	}

	@Override
	public void addFirst(int data) 
	{
		CircularLinkedNode node = new CircularLinkedNode(data);
		if(head == null)
		{
			head = node;
			tail = node;
		}else 
		{
			node.next = head;
			head = node;
		}
		tail.next = head;		
		size++;		
	}

	@Override
	public void addLast(int data) 
	{
		if(head == null)
		{
			addFirst(data);			
		}else 
		{
			CircularLinkedNode node = new CircularLinkedNode(data);
			tail.next = node;			
			tail = node;
			tail.next = head;
			size++;
		}	

	}

	@Override
	public void add(int data) 
	{
		addLast(data);
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
		CircularLinkedNode tempNode = head;

		while (tempNode != tail) 
		{
			System.out.print(" "+tempNode.data);

			tempNode = tempNode.next;
		}
		System.out.print(" "+tempNode.data);
		System.out.println("\n List Size:"+size);		
	}

	@Override
	public int getSize() 
	{		
		return size;
	}

}
