package com.ff.stack;

public class Node<T> 
{
	private T info;	
	public Node<T> next;

	public Node(T t) 
	{
		this(t,null);
	}
	
	public Node(T t,Node<T> next) 
	{
		this.info = t;
		this.next = next;
	}
	
	public T getInfo() {
		return info;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}
		
}
