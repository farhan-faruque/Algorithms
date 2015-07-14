package me.farhan.tree.bst;

public class BstNode<T extends Comparable<T>>
{
	public T key;
	public BstNode<T> left;
	public BstNode<T> right;
	
	public BstNode(T key) 
	{
		this.key = key;
		left = null;
		right = null;
	}
}
