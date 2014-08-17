package me.farhan.tree;

public class Node<T>
{
	public T key;
	public Node<T> left;
	public Node<T> right;
	
	public Node(T key) 
	{
		this.key = key;
		left = null;
		right = null;
	}
}
