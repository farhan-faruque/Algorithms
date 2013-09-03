package com.ff.linkedlist;

public class SingleLinkedList 
{
	private SingleLinkedNode head;
	private int size;
	
	public SingleLinkedList() 
	{
		size = 0;
		head = null;
	}
	
	public void addFirst(int data)
	{
		SingleLinkedNode node = null;
		node = new SingleLinkedNode();
		node.data = data;
		
		if(head == null)
		{	
			node.next = null;
			head = node;
		}else
		{
			node.next = head;
			head = node;			
		}
		
	}
	
	public void addLast(int data)
	{
		SingleLinkedNode node = new SingleLinkedNode();
		node.data = data;
		
		if(head != null)
		{
			SingleLinkedNode temp = head; 
			
			while (temp != null) 
			{
				if(temp.next == null)
				{
					temp.next = node;
					break;
				}
				temp = temp.next;
			}
		}else 
		{
			node.next = null;
			head = node;
		}
	}
	
	public void addBetween(int data,int pos)
	{
		
	}
	
	public boolean removeFirst()
	{
		if(head != null)
		{
			SingleLinkedNode temp = head;
			head = head.next;
			temp = null;
			return true;
		}		
		return false;
	}
	
	public void removeLast()
	{
		
	}
	
	public void remove(int pos)
	{
		
	}
	
	public int findPos()
	{
		return 0;
	}
	
	public void show()
	{
		if(head != null)
		{
			SingleLinkedNode temp = head;
			while (temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;				
			}
			//System.out.print(temp.data+" ");
		}
	}

	public int getSize() {
		return size;
	}

}
