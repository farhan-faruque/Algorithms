package com.ff.tree.binarytree;

public class Tree 
{
	public Node root;
	
	public Node find(int key)
	{
		Node currentNode = root;
		while (currentNode.data != key) 
		{
			currentNode = key < currentNode.data ? currentNode.leftChild : currentNode.rightChild;
			if(currentNode == null)
				return null;			
		}
		return currentNode;		
	}
	
	public void insert(int data)
	{
		
	}
	
	public void delete(int data)
	{
		
	}

}
