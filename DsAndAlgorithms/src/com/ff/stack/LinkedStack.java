package com.ff.stack;

public class LinkedStack<T>  implements Stack<T>
{
	private int size;
	private Node<T> head;

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
			head = new Node<T>(t);
		}else 
		{
			Node<T> node = new Node<T>(t,head);
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
			Node<T> tempHead = head;
			T data = tempHead.getInfo();
			head = head.next;
			size--;
			return data;
		}
	}

	@Override
	public void show() 
	{	
		Node<T> tempNode = head;
		do 
		{
			System.out.print(tempNode.getInfo().toString()+" ");
			tempNode = tempNode.next;					
		}while (tempNode != null);

	}	

	@Override
	public int size() 
	{
		return size;
	}


}
