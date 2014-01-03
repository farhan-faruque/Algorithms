package com.ff.stack;

public class LinkedStack<T>  implements Stack<T>
{
	private int size;
	private StackNode<T> head;
	
	public LinkedStack() 
	{
		size = 0;
		head = null;
	}

	@Override
	public boolean isEmpty() 
	{
		return head == null;
	}

	@Override
	public void push(T t) 
	{
		if(t == null)
		{
			System.out.println("Null Objcet");
			throw new NullPointerException();
		}
		
		if(head == null)
		{
			head = new StackNode<T>(t);
		}else 
		{
			StackNode<T> node = new StackNode<T>(t,head);
			head = node;
		}	
		size++;
	}

	@Override
	public T pop()
	{
		if(head == null)
		{			
			System.out.println("Empty stack");
			return null;
		}else 
		{			
			StackNode<T> tempHead = head;
			T data = tempHead.getInfo();
			head = head.getNext();
			size--;
			return data;
		}
	}

	@Override
	public void show() 
	{
		StackNode<T> tempNode = head;
		
		while (tempNode.getNext() != null) 
		{
			toString();
			tempNode = tempNode.getNext();					
		}
	}
	

	@Override
	public int size() 
	{
		return size;
	}
	

}
