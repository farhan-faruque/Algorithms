package me.farhan.queue;

public class Node <T>{

	public Node(T t) 
	{
		this.data = t;
		next = null;
	}
	
	public T data;
	public Node<T> next;
}
