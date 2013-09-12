package com.ff.linkedlist.doubly;


import java.util.List;

import com.ff.linkedlist.LinkedList;

public class DoublyLinkedList implements LinkedList
{
	DoublyLinkedNode head;
	DoublyLinkedNode tail;
	int size;

	public DoublyLinkedList() 
	{
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public void addFirst(int data) 
	{
		DoublyLinkedNode node = new DoublyLinkedNode(data);

		if(isEmpty())
		{
			head = tail = node;			
		}else
		{
			node.next = head;
			head.prev = node;
			head = node;			
		}
		size++;
	}

	@Override
	public void addLast(int data) 
	{
		DoublyLinkedNode node = new DoublyLinkedNode(data);

		if(isEmpty())
		{
			addFirst(data);
		}else
		{
			tail.next = node;
			node.prev = tail;
			tail = node;			
		}
		size++;
	}

	@Override
	public void add(int data) 
	{

	}

	@Override
	public boolean add(int data, int pos) 
	{
		return false;
	}

	@Override
	public boolean removeFirst() 
	{
		return false;
	}

	@Override
	public boolean removeLast() 
	{
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
		return 0;
	}

	@Override
	public int getLast() 
	{
		return 0;
	}

	@Override
	public int find(int pos)
	{
		return 0;
	}

	@Override
	public void show()
	{
		if(!isEmpty())
		{
			DoublyLinkedNode currentNode = head;
			System.out.print("List:");
			while (currentNode != null)
			{
				System.out.print(" "+currentNode.data);
				currentNode = currentNode.next;

			}
			System.out.print("\nSize: "+size);
		}
	}

	public void showReverse()
	{
		if(!isEmpty())
		{
			DoublyLinkedNode currentNode = tail;
			
			System.out.print("\nReverse:");
			while (currentNode != null)
			{
				System.out.print(" "+currentNode.data);
				currentNode = currentNode.prev;

			}
			//System.out.print("\n Size:"+size);
		}
	}

	@Override
	public int getSize() 
	{		
		return 0;
	}

	@Override
	public boolean isEmpty() 
	{	
		return size == 0 ? true : false;
	}

	public List<Integer> reverse()
	{
		return null;

	}

}
