package com.ff.linkedlist.circular;

import com.ff.linkedlist.LinkedList;

public class CircularLinkedList implements LinkedList 
{

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
	public boolean removeFirst() 
	{
		if(head != null)
		{
			CircularLinkedNode tempNode = head;
			head = head.next;
			tail.next = head;
			tempNode = null;			
			size --;			
			return true;
		}
		return false;
	}

	@Override
	public boolean removeLast()
	{
		if(head != null)
		{
			CircularLinkedNode tempNode = head;
			while (tempNode != tail)
			{
				if(tempNode.next ==  tail)
				{
					tail = tempNode;
					tail.next = head;
					tempNode = null;
					size--;
					return true;
				}
				tempNode = tempNode.next;				
			}
		}
		return false;
	}

	@Override
	public boolean remove(int pos) 
	{
		return false;
	}

	@Override
	public int getFirst() 
	{
		if(head != null)
		{		
			return head.data;		

		}

		return -1;
	}

	@Override
	public int getLast() 
	{
		if(head != null)
		{
			if(head == tail)
			{
				return head.data;
			}else 
			{
				CircularLinkedNode tempNode = head;				
				while (tempNode != tail) 
				{
					if(tempNode.next == head)
					{
						return tempNode.data;
					}
					tempNode = tempNode.next;					
				}
			}

		}
		return -1;
	}

	@Override
	public int find(int pos) {
		return 0;
	}

	@Override
	public void show() 
	{
		if(head != null)
		{
			CircularLinkedNode tempNode = head;
			while (tempNode != tail) 
			{
				System.out.print(" "+tempNode.data);

				tempNode = tempNode.next;
			}
			System.out.print(" "+tempNode.data);
			System.out.println("\n List Size:"+size);


			if(tail != null)
				System.out.println(" Tail next:"+tail.next.data);
		}

	}

	@Override
	public int getSize() 
	{		
		return size;
	}

}
