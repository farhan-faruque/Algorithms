package com.ff.linkedlist.circular;

public class CircularLinkedNode 
{
	int data;
	CircularLinkedNode next;
	
	public CircularLinkedNode() 
	{
		this(-1);	
	}
	
	public CircularLinkedNode(int data)
	{
		this.data = data;
		this.next = null;

	}

}
