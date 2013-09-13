package com.ff.linkedlist.doubly;


import java.util.ArrayList;
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
		addFirst(data);
	}

	@Override
	public boolean add(int data, int pos) 
	{
		if(pos >=0 && pos <=size)
		{
			if(isEmpty() || pos == 0)
			{
				addFirst(data);				
			}else if (pos == size) {
				addLast(data);
			}else 
			{
				DoublyLinkedNode currentNode = head;
				
			}			
			return true;
		}
		return false;
	}

	@Override
	public boolean removeFirst() 
	{
		if(!isEmpty())
		{
			if(head.next == null)
			{
				head = null;
			}
			else 
			{
				DoublyLinkedNode tempNode = head;
				head = head.next;
				head.prev = null;
				tempNode = null;	
			}	
			size--;
			return true;
		}
		return false;
	}

	@Override
	public boolean removeLast() 
	{
		if(!isEmpty())
		{
			if(head.next == null)
			{
				removeFirst();
			}else 
			{
				DoublyLinkedNode currentNode = head;
				
				while (currentNode != null) 
				{
					if(currentNode.next == null)
					{
						tail = currentNode.prev;
						tail.next = null;
						currentNode = null;
						size--;
						return true;
					}
					currentNode = currentNode.next;					
				}
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
		return !isEmpty() ? head.data : -1;		
	}

	@Override
	public int getLast() 
	{
		return !isEmpty() ? tail.data : -1;			
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
		return size;
	}

	@Override
	public boolean isEmpty() 
	{	
		return size == 0 ? true : false;
	}

	public List<Integer> reverse()
	{
		if(!isEmpty())
		{
			List<Integer> reverseList = new ArrayList<Integer>();
			
			DoublyLinkedNode currentNode = tail;
			
			System.out.print("\nReverse:");
			while (currentNode != null)
			{
				//System.out.print(" "+currentNode.data);
				reverseList.add(currentNode.data);
				currentNode = currentNode.prev;
			}
			
		}
		return null;

	}

}
