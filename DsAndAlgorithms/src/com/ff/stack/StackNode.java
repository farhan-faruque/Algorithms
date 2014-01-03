package com.ff.stack;

public class StackNode<T> 
{
	private T info;	
	public StackNode<T> next;

	public StackNode(T t) 
	{
		this(t,null);
	}
	
	public StackNode(T t,StackNode<T> next) 
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
	
	public StackNode<T> getNext() {
		return next;
	}
	
	public void setNext(StackNode<T> next) {
		this.next = next;
	}	
}
