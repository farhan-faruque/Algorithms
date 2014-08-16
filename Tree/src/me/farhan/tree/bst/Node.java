package me.farhan.tree.bst;

public class Node<T extends Comparable<T>>
{
	T key;
	Node<T> left;
	Node<T> right;
	
	public Node(T key) 
	{
		this.key = key;
		left = null;
		right = null;
	}
}
