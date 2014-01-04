package com.ff.queue;


import com.ff.stack.Node;

public class LinkedQueue<T> implements Queue<T> 
{
	int size;
	private Node<T> font;
	private Node<T> rear;

	public LinkedQueue()
	{
		size = 0;
		font = rear = null;

	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public void enque(T t)
	{
		if(t == null)
			throw new NullPointerException();

		if(rear == null)
		{
			rear = new Node<T>(t);
			font = rear;
		}else 
		{
			Node<T> node = new Node<T>(t);
			rear.next = node;
			rear = rear.next;
		}	

	}

	@Override
	public T deque() 
	{
		if(font == null)
		{
			System.out.print("Queue is Empty");			
			return null;
		}else 
		{
			Node<T> node = font;
			T t = node.getInfo();
			font = font.next;
			node = null;
			return t;
		}
	}

	@Override
	public boolean isEmpty() 
	{
		return font == null;
	}
	@Override
	public void show() 
	{
		Node<T> tempNode = font;
		do 
		{
			System.out.print(tempNode.getInfo().toString()+" ");
			tempNode = tempNode.next;					
		}while (tempNode != null);
	}

}
